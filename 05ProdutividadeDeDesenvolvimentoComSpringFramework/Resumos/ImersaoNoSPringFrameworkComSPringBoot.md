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