- Qual é a definição do Spring Data JPA?
- - É parte da família maior do SPring Data, torna mais fácil implementar repositórios baseados em JPA.
- ORM 
- - É um recurso para aproximar o POO ao contexto de Banco de dados relacionais
- JPA
- - É uma especificação baseada em interfaces,que através de um framewokrealiza operações de persistência de objetos 
    em Java.
- Implementações JPA:
- - Hibernate, Eclipse link, Top Link, Open JPA.
- O que são os Startes do Spring Boot?
- - São dependências que agrupam outras dependências com um propósito em comum.
- Para que serve a annotation @Value?
- - Para podermos atribuir valor padrão a uma propriedade de classe.
- Para que serve a annotation @ConfigurationProperties(prefix)?
- - Uma maneira de incluir uma configuração externalizada e de fácil acesso a propriedades em arquivos de propriedades.
- .properties
- - É uma extensão de arquivo de configuração padrão do aplicativo quando estamos trabalhando com Spring Boot.
- Para que serve a annotation @Query?
- - Serve para executar consultas SQL e SQL nativas.
- A forma correta de importarmos a dependência do SGBD PostgresSQL?
````xml
<dependecy>
    <groupId>org.postgresql</groupId>
    <artifactid>postgresql</artifactid>
</dependecy>
````

- Para que serve a annotation @Scope?
- - Utilizada para marcar o tempo de vida de um objeto gerenciado pelo container.
- Singleton 
- - O container do Spring IoC define uma instância do objeto
- Prototype
- - Será criado um novo objeto a cada solicitação ao container
- Http-Request
- -Um brean será criado para cada requisição HTTP;
- Aplplication Scope
- - Cria um bean para o ciclo de vida do contexto de aplicação.
### Introdução ao Spring Framework com Spring Boot

O Spring Framework é uma das mais populares e amplamente utilizadas plataformas para o desenvolvimento de aplicações em Java. Ele oferece um ecossistema robusto e modular que facilita a criação de aplicações complexas e escaláveis. O Spring Boot, por sua vez, é um projeto do Spring que visa simplificar a configuração e a execução de aplicações Spring.

#### Spring Framework

O Spring Framework fornece um conjunto abrangente de funcionalidades, incluindo injeção de dependência (IoC), programação orientada a aspectos (AOP), transações declarativas, e acesso a dados de forma integrada, entre outras. Suas principais características incluem:

- **Injeção de Dependência (IoC)**: Facilita a construção de aplicações desacopladas e mais testáveis.
- **Programação Orientada a Aspectos (AOP)**: Permite a separação de preocupações transversais, como logging e segurança.
- **Acesso a Dados**: Suporte a diversas tecnologias de persistência, como JDBC, JPA e Hibernate.
- **MVC Web**: Framework robusto para desenvolvimento de aplicações web.

#### Spring Boot

O Spring Boot é uma extensão do Spring Framework que tem como objetivo reduzir o tempo e a complexidade de configuração das aplicações Spring. Ele faz isso através de convenções sobre configurações e uma série de "starters" que incluem dependências comuns para diferentes tipos de projetos. Com Spring Boot, é possível criar aplicações standalone com um servidor embutido (como Tomcat ou Jetty) e configurações mínimas.

##### Principais Características do Spring Boot

- **Auto-Configuração**: Automatiza a configuração do Spring e de bibliotecas de terceiros.
- **Starters**: Dependências predefinidas para iniciar rapidamente com componentes comuns.
- **Atuadores**: Monitoramento e gestão de aplicações em produção.
- **Maven/Gradle Plugins**: Suporte integrado para construir e executar aplicações.

#### Spring Data JPA

O Spring Data JPA é um subprojeto do Spring Data que facilita a implementação de repositórios baseados em JPA (Java Persistence API). Ele abstrai boa parte da complexidade do acesso a dados, permitindo que os desenvolvedores foquem na lógica de negócio.

- **Definição**: Spring Data JPA é parte da família maior do Spring Data, tornando mais fácil implementar repositórios baseados em JPA.
- **ORM**: É um recurso para aproximar a Programação Orientada a Objetos (POO) ao contexto de banco de dados relacionais.
- **JPA**: Uma especificação baseada em interfaces que, através de um framework, realiza operações de persistência de objetos em Java.
- **Implementações JPA**: Hibernate, EclipseLink, TopLink, OpenJPA.

#### Anotações Comuns no Spring Boot

- **@Value**: Atribui um valor padrão a uma propriedade de classe.
- **@ConfigurationProperties(prefix)**: Inclui uma configuração externalizada e facilita o acesso a propriedades em arquivos de configuração (.properties).
- **@Query**: Executa consultas SQL e SQL nativas.
- **@Scope**: Marca o tempo de vida de um objeto gerenciado pelo container Spring.

##### Exemplos de Escopos

- **Singleton**: O container do Spring IoC define uma única instância do objeto.
- **Prototype**: Cria um novo objeto a cada solicitação ao container.
- **Http-Request**: Um bean será criado para cada requisição HTTP.
- **Application Scope**: Cria um bean para o ciclo de vida do contexto de aplicação.

#### Dependências

Para adicionar a dependência do SGBD PostgreSQL em um projeto Spring Boot, o arquivo `pom.xml` (utilizando Maven) deve incluir:

```xml
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
</dependency>
```

#### Conclusão

O Spring Framework, com o auxílio do Spring Boot, proporciona uma base sólida e simplificada para o desenvolvimento de aplicações Java modernas. Com suas capacidades de auto-configuração e uma ampla gama de funcionalidades, os desenvolvedores podem se concentrar mais na lógica de negócio e menos na configuração da infraestrutura, acelerando o desenvolvimento e aumentando a produtividade.