- Qual é a definição da "JWT"?
- - É uma estratégia para realizar autenticação entre duas partes por meio de um token assinando que autentica uma 
    requisição Web. Além disso, um token JWT também podem conter informações relacionadas à autorização.
- Qual o tipo de autorização devemos utilizar quando queremos fazer uma autenticação básica de um usuário?
- - Basic Auth
- Sobre o Spring security
- -  Para adicionarmos um nível de segurança em uma aplicação Spring boot é necessário apenas importar o Starter do 
     Spring security.
- O Starter para importar a dependência referente ao Spring Security
````xml
<dependecy>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependecy>
````
- @PreAuthorize?
- - Fornece controle de acesso beaseado em expressão. Verifica a expressão fornecida antes de inserir o método.
- Autenticação
- - Refere ao processo de verificação de identidade de um usuário, bom base nas credenciais fornecidas.
- Autorização.
- Refere ao processo de determinar se um usuário tem permissão adequada para uma ação específica ou ler dados 
  específicos.
- Para obter os dados do usuário em memória, devemos sobrescrever o método "configure" estendida da classe 
  WebSecurityConfigurerAdapter. Qual argumento este método recebe?
- - AuthenticationManagerBuilder auth
- Sobre o Spring Security
- - é incorreto dizer que o default o Spring Security não possui um usuário padrão chamado User e toza vez que sua 
    aplicação é iniciada ele gera uma senha aleatória no console.
- O Starter para importar corretamente a depêndecia referente ao JWT é:
````xml
<dependecy>
    <groupdId>io.jsonwebtoken</groupdId>
    <artifactId>jjwt</artifactId>
    <version>0.7.0</version>
</dependecy>
````
- A interface UserDetailsService é usada para recuperar dados relacionados ao usuário.

Claro! Vamos abordar cada um dos conceitos mencionados em um artigo estruturado para esclarecer como funcionam no contexto do Spring Security.

---

## Conceitos Fundamentais de Autenticação e Autorização com Spring Security

### JSON Web Token (JWT)

**Definição:**
JWT (JSON Web Token) é um padrão aberto (RFC 7519) que define uma maneira compacta e independente de transmitir informações entre duas partes como um objeto JSON. Essas informações podem ser verificadas e confiadas porque são assinadas digitalmente.

**Autenticação e Autorização:**
- **Autenticação:** Verifica a identidade do usuário. JWT autentica requisições ao garantir que o token que o usuário apresenta foi gerado por um servidor confiável.
- **Autorização:** Permite que o token carregue informações sobre as permissões do usuário, permitindo que o servidor decida quais recursos o usuário pode acessar.

### Autenticação Básica (Basic Auth)

**Definição:**
Basic Auth é um método simples de autenticação em que o cliente envia as credenciais (nome de usuário e senha) codificadas em Base64 no cabeçalho da requisição HTTP.

**Uso:**
- Simplicidade e facilidade de implementação.
- Não é adequado para aplicações que necessitam de maior segurança, pois as credenciais são facilmente decodificáveis se não forem enviadas por uma conexão segura (HTTPS).

### Spring Security

**Introdução:**
Spring Security é um framework que fornece autenticação, autorização e outras funcionalidades de segurança para aplicações Java, especialmente as baseadas no Spring Framework.

**Configuração:**
Para adicionar segurança a uma aplicação Spring Boot, você precisa incluir a dependência `spring-boot-starter-security` no seu arquivo `pom.xml`:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>
```

### @PreAuthorize

**Definição:**
A anotação `@PreAuthorize` é utilizada em métodos para realizar controle de acesso baseado em expressões SpEL (Spring Expression Language). Antes que o método anotado seja executado, a expressão fornecida é avaliada para determinar se o acesso é permitido.

**Exemplo:**
```java
@PreAuthorize("hasRole('ADMIN')")
public void adminMethod() {
    // logic here
}
```

### Autenticação e Autorização

**Autenticação:**
Refere-se ao processo de verificar a identidade de um usuário com base nas credenciais fornecidas (por exemplo, nome de usuário e senha).

**Autorização:**
Refere-se ao processo de determinar se um usuário autenticado tem permissão para realizar uma ação específica ou acessar dados específicos.

### Configuração de Segurança em Memória

Para configurar usuários em memória, você deve sobrescrever o método `configure` da classe `WebSecurityConfigurerAdapter` e passar um argumento `AuthenticationManagerBuilder`:

```java
@Override
protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication()
        .withUser("user")
        .password("{noop}password")
        .roles("USER");
}
```

### Usuário Padrão do Spring Security

É incorreto afirmar que o Spring Security, por padrão, não possui um usuário padrão. Na verdade, ele cria um usuário padrão chamado `user` e gera uma senha aleatória cada vez que a aplicação é iniciada, que é exibida no console.

### Dependência para JWT

Para trabalhar com JWT, você precisa incluir a dependência `jjwt` no seu arquivo `pom.xml`:

```xml
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt</artifactId>
    <version>0.7.0</version>
</dependency>
```

### Interface UserDetailsService

**Definição:**
A interface `UserDetailsService` é usada pelo Spring Security para recuperar informações do usuário durante o processo de autenticação. Esta interface possui um único método:

```java
UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
```

**Implementação:**
Você pode criar uma implementação personalizada desta interface para buscar usuários de um banco de dados ou outro repositório de dados:

```java
@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthorities(user));
    }

    private Collection<? extends GrantedAuthority> getAuthorities(User user) {
        return user.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());
    }
}
```

---

Esses conceitos são fundamentais para a implementação de segurança em aplicações Spring Boot. Compreender a diferença entre autenticação e autorização, como configurar usuários e dependências, e como usar anotações para controle de acesso, são passos cruciais para garantir que sua aplicação esteja segura e funcionando conforme esperado.