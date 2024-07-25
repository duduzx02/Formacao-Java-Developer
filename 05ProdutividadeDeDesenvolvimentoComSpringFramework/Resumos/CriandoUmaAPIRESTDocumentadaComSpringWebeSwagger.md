- Controller
- - É a camada da aplicação que lida com as requisições dos usuários.
- Sobre o Swagger
- - É uma linguagem de descrição de interface para descrever APIs RESTful expressas usando JSON. O Swagger é usado 
    junto com um conjunto de ferramentas de software de codigo aberto para projetar, contruir, documentar e usar 
    serviços da Web RESTful.
- O que significa o acrônimo CRUD?
- - Create, Read, Update, Delete
- Para que serve o método HTTP "GET"?
- - Obter dados.
- Exception Handler
- - Um manipulador de exceção é o código que estitula o que um programa fará quando um evento anômalo interromper o 
    fluxo normal das intruções deste programa.
- Qual a função da anotação @RestController?
- - Responsável por designar o bean do componente que suporta requisições HTTP com base na arquitetura REST.
- O endpoint "/usuarios/1" seguindo o padrão RESTful, é comumnete utilizado com alguns métodos HTTP, exceto:
- - POST
- Como podemos definir uma API:
- - É um código programável que faz a "ponte" de comunicação entre duas aplicações distintas.
- Endpoint:
- - É a URL onde seu serviço pode ser acessado por uma aplicação cliente.
- O que é o Postman?
- - É uma ferramenta que provê uma interface para o consumo de endpoints REST, além disso, permite a documentação 
    das requisições HTTP em questão.
### Criando uma API REST Documentada com Spring Web e Swagger

#### Introdução

Criar uma API REST eficiente e bem documentada é fundamental para a construção de aplicações web robustas e escaláveis. Com o Spring Boot e o Swagger, conseguimos não apenas implementar as funcionalidades necessárias, mas também fornecer uma documentação clara e interativa, facilitando a integração e o uso da API por outros desenvolvedores.

#### O Que é uma API REST?

Uma API (Application Programming Interface) é um conjunto de definições e protocolos que permite a comunicação entre diferentes sistemas. No contexto REST (Representational State Transfer), a API segue princípios específicos que a tornam mais simples, escalável e eficiente. Os principais métodos HTTP usados em uma API RESTful são:

- **GET**: Obter dados.
- **POST**: Criar novos dados.
- **PUT**: Atualizar dados existentes.
- **DELETE**: Remover dados.

#### O Que é o Swagger?

O Swagger é um framework que auxilia na documentação de APIs REST. Ele permite descrever as operações disponíveis, parâmetros esperados, respostas possíveis, entre outros detalhes, utilizando JSON. Além disso, o Swagger fornece uma interface gráfica que facilita a interação e o teste dos endpoints.

#### Configurando o Projeto

Para começar, vamos criar um projeto Spring Boot utilizando o Spring Initializr. Inclua as seguintes dependências:

- Spring Web
- Spring Boot DevTools
- Spring Data JPA (se for usar um banco de dados)
- H2 Database (para testes, opcional)
- Springfox Swagger 2 (para documentação)

#### Implementando a API

Vamos criar uma API simples para gerenciar usuários.

**1. Entidade Usuário**

```java
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    // Getters e Setters
}
```

**2. Repositório**

```java
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
```

**3. Serviço**

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> obterPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    public Usuario criar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deletar(Long id) {
        usuarioRepository.deleteById(id);
    }
}
```

**4. Controlador**

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> listarTodos() {
        return usuarioService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> obterPorId(@PathVariable Long id) {
        return usuarioService.obterPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario criar(@RequestBody Usuario usuario) {
        return usuarioService.criar(usuario);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Long id) {
        usuarioService.deletar(id);
    }
}
```

#### Adicionando Swagger

Para adicionar o Swagger ao projeto, precisamos configurar algumas dependências e classes.

**1. Dependência Maven**

```xml
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.9.2</version>
</dependency>
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.9.2</version>
</dependency>
```

**2. Configuração Swagger**

```java
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.seuprojeto"))
                .paths(PathSelectors.any())
                .build();
    }
}
```

Com essa configuração, a documentação da sua API estará disponível em `http://localhost:8080/swagger-ui.html`.

#### Testando a API

Para testar a API, você pode utilizar ferramentas como o Postman ou a própria interface do Swagger. Ambas permitem enviar requisições HTTP e visualizar as respostas.

**1. Testando com Postman**

- **GET** `http://localhost:8080/usuarios`: Listar todos os usuários.
- **GET** `http://localhost:8080/usuarios/{id}`: Obter um usuário por ID.
- **POST** `http://localhost:8080/usuarios`: Criar um novo usuário.
- **DELETE** `http://localhost:8080/usuarios/{id}`: Deletar um usuário por ID.

**2. Testando com Swagger**

Acesse `http://localhost:8080/swagger-ui.html`, onde você verá a documentação interativa da API. Lá, você pode testar os endpoints diretamente na interface gráfica.

#### Conclusão

Criar uma API REST bem documentada com Spring Boot e Swagger não é apenas uma boa prática, mas também um facilitador para a integração e uso da sua API por outros desenvolvedores. Com a configuração adequada, você pode garantir que sua API seja facilmente compreendida e utilizada, proporcionando uma melhor experiência para todos os envolvidos.