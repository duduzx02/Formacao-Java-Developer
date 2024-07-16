1 - Sobre os conceitos bases do Spring framework, analise as informações a baixo e marque a alternativa correta
I - O conceinar do Spring IoC define uma instância do objeto
II - Será criado um novo objeto a cada solicitação ao container.
III - Um bean será criado para cada requisição HTTP.
IV - Cria um bean para o ciclo de vida do contexto da aplicação.
R - Singleton, Prototype, Http-Request, Application Scope.

2 - Sobre os conceitos bases do java persistence API, analise as informações abaixo e marque a alternativa correta.
I - É um recurso para aproximar o POO ao contexto de Banco de dados relacionais.
II - É uma espeficicação baseadas em interfaces, que através de um framework realiza operações de persistência de objetos em java.
III - Hibernate, Eclipse link, Top Link, Open JPA.
R - ORM, JPA, implementações JPA.

3 - Qual das opções abaixo é uma extensão de arquivo de configuração do aplicativo quando estamos trabalhando com Spring boot?
- .properties
4 - Para que serve a annotation @ConfigurationProperties(prefix)?
- Uma maneira de incluir uma configuração extenalizada e de fácil acesso a propriedades definidas em arquivos de propriedades.
5 - Para que serve a annotation @Value?
- Para podemos atribuir valor padrão a uma propriedade de classe.
6 - Qual é a definição do Spring Data JPA?
- É parte da familia maior do Spring Data, torna mais fácil implementar repositórios baseados em JPA.
7 - Para que serve a annotation @Scope?
- Utilizado para marcar o tempo de vida de um objeto gerenciado pelo container
8 - Para que serve a annotation @Query
- Serve para executar consultas SQL e SQL nativas.
9 - O que são os Startes do Spring boot?
- São dependências que agrupam outras dependências com um propósito em comum. 
10 - Qual é a forma correta do Startet para importarmos a depedenência SGBD PostgresSQL?
<dependency>
	<groupid>org.postgresql</groupid>
	<artifactid>postgresql<artifactid>
</dependency>

### 1. Conceitos Básicos do Spring Framework

#### Inversion of Control (IoC)
IoC é um dos conceitos fundamentais do Spring Framework. Ele define a responsabilidade de gerenciar o ciclo de vida dos objetos para o container do Spring, ao invés de deixar para a aplicação. Em resumo, a IoC facilita a injeção de dependências, melhorando a modularidade e testabilidade do código.

#### Tipos de Escopo no Spring
1. **Singleton**: Define que uma única instância do bean será criada e compartilhada em todo o container.
2. **Prototype**: Define que um novo bean será criado a cada solicitação ao container.
3. **Request**: Um bean será criado para cada requisição HTTP.
4. **Application**: Um bean será criado para o ciclo de vida do contexto da aplicação.

### 2. Conceitos Básicos do Java Persistence API (JPA)

#### Object-Relational Mapping (ORM)
ORM é uma técnica de desenvolvimento que facilita a conversão de dados entre sistemas orientados a objetos e bancos de dados relacionais. Através do ORM, é possível trabalhar com objetos em Java que são mapeados para tabelas em um banco de dados relacional.

#### Java Persistence API (JPA)
JPA é uma especificação para gerenciamento de persistência de dados em Java. Ele fornece uma API para realizar operações de persistência, como criar, ler, atualizar e deletar registros no banco de dados.

#### Implementações de JPA
Existem várias implementações de JPA, como:
- **Hibernate**: Uma das implementações mais populares e amplamente utilizadas.
- **EclipseLink**: A implementação de referência da JPA.
- **TopLink**: Um dos primeiros frameworks de persistência a suportar JPA.
- **OpenJPA**: Uma implementação de código aberto.

### 3. Arquivo de Configuração do Spring Boot
Em aplicações Spring Boot, as configurações são frequentemente armazenadas em arquivos com extensão `.properties` ou `.yml`. Estes arquivos contêm propriedades e configurações que são usadas para configurar diversos aspectos da aplicação.

### 4. Annotation @ConfigurationProperties
A anotação `@ConfigurationProperties(prefix)` é usada para mapear propriedades externas (definidas em arquivos `.properties` ou `.yml`) para uma classe Java. Isso facilita o acesso e gerenciamento dessas propriedades dentro do código da aplicação.

### 5. Annotation @Value
A anotação `@Value` é usada para injetar valores em campos de uma classe. Esses valores podem ser provenientes de propriedades definidas em arquivos `.properties` ou `.yml`, permitindo a configuração dinâmica de variáveis de instância.

### 6. Definição do Spring Data JPA
Spring Data JPA é uma parte do ecossistema Spring Data que simplifica a implementação de repositórios baseados em JPA. Ele fornece uma abstração sobre a API de JPA, permitindo que os desenvolvedores criem repositórios sem a necessidade de escrever código boilerplate.

### 7. Annotation @Scope
A anotação `@Scope` é usada para definir o escopo de um bean no Spring. Isso pode ser `singleton`, `prototype`, `request`, `session`, ou `application`, determinando o ciclo de vida e a visibilidade do bean no contexto da aplicação.

### 8. Annotation @Query
A anotação `@Query` é usada para definir consultas personalizadas em métodos de repositórios Spring Data JPA. Ela pode ser utilizada para escrever consultas JPQL (Java Persistence Query Language) ou SQL nativas.

### 9. Starters do Spring Boot
Starters no Spring Boot são dependências pré-configuradas que facilitam a adição de funcionalidades específicas a uma aplicação. Eles agrupam dependências comuns, permitindo que os desenvolvedores adicionem funcionalidades com menos esforço e configuração manual.

### 10. Dependência SGBD PostgreSQL no Spring Boot
Para incluir o driver do PostgreSQL em uma aplicação Spring Boot, você precisa adicionar a seguinte dependência no arquivo `pom.xml`:

```xml
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
</dependency>
```

Este artigo cobre os conceitos básicos e algumas das funcionalidades mais utilizadas no Spring Framework e JPA. Ao entender esses conceitos, você estará bem equipado para desenvolver aplicações robustas e escaláveis usando o Spring Framework e JPA.