- Spring Boot Start web
- - Auxilia na contrução de aplicações web trazendo já disponíveis para uso o Spring MVC, Rest e o Tomcat como servidor.
- Sring Boot Start Test 
- - Contém a maioria das dependências necessárias para realizar testes da sua aplicação: Junit, AssertJ, HamCrest, 
    Mockito, entre outros.
- Sprting Boot Starter Data JPA
- Facilita a construção da nossa camada de persistência, ajudando na abstração do nosso banco de dados provendo uma 
  serie de facilidades para a criação de repositories, escrita de queries, entre outras.
- API:
- - Significa interface de programação de aplicações, um conjunto de definções e protocolor para criar e integrar 
    software de aplicações.
- REST
- - O cliente envia solicitações ao servidor como dados. O servidor usa essa entrada do cliente para iniciar funções 
    internas e retorna os dados de saída do cliente.
- SOAP
- - Cliente e servidor trocam mesangem usando XML. Esta é uma API menos flexível que era mais popular no passado.
- WebSocket 
- - O Servidor pode enviar mensagens de retorno de chamada a clientes conectados, tornando-o mais eficiente que a 
    API REST.
- RPC
- -  O cleinte conclui uma função (ou um procedimento) no servidor e o servidor envia a saída de volta ao cliente.
- Sobre os HTTP Status
- - 500 - 599 Server error responses
- Spring initialzr:
- - É uma UI que permite a criação de projetos SPring Boot de forma facilitada.
- Annotations
- - Foram introduzidas no Spring a partir da versão 2.5, possibilitando aos desenvolvedores um aumento significativo 
    em produtividade. Isto se deve à facilidade de configuração, o que era bem mais complicado nas versões 
    anteriores do SPring, pois toda configuração era via XML.
- Sobre o Spring Framework
- - O Sring Boot é um framework java open source, ele traz mais agilidade para o processo de desenvolvimento, uma 
    vez que devs conseguem reduzir o tempo gasto com as configgurações iniciais.
- Arquitetura de três camadas:
- - A arquitetura de três camadas, que separa os aplicativos em três camadas de computação lógica e física, é a 
    arquitetura de software predominante para aplicativos tradicionais cliente-servidor.
- Sobre o conceito de API:
- - A aplicação que envia a solicitação é chamada de cliente e a aplicação que envia a respota é chamada de servidor.
- POST
- - É utilizado para submeter uma entidade a um recurso específico, frequentemente causando uma mudança no estado do 
    recurso ou efeitos colaterias no servidor.
- PUT
- - Substitui todas as atuais representações do recurso de destino pela carga de dados da requisição
- PATCH 
- - É utilizado para aplicar modificações parciais em um recurso.
- GET
- - Solicita a representação de um recurso específico.

### Contextualizando o Desenvolvimento Web com Spring Boot 3

O Spring Boot é uma poderosa ferramenta no ecossistema Java para desenvolvimento de aplicações web modernas. Ele abstrai grande parte da complexidade de configuração que era tradicionalmente necessária com o Spring Framework, permitindo que os desenvolvedores se concentrem em escrever código de negócio.

#### Spring Boot Starter Web
O **Spring Boot Starter Web** é um dos starters mais utilizados no desenvolvimento de aplicações web. Ele inclui diversas funcionalidades prontas para uso, como o Spring MVC, REST e o servidor embutido Tomcat. Isso significa que com algumas poucas linhas de código você já consegue levantar uma aplicação web funcional.

```java
@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
```

No exemplo acima, criamos um simples endpoint que responde com "Hello, World!" quando acessado via HTTP GET.

#### Spring Boot Starter Test
Para garantir a qualidade do código, é essencial realizar testes. O **Spring Boot Starter Test** inclui várias bibliotecas populares de teste como JUnit, AssertJ, Hamcrest e Mockito. Isso facilita a criação de testes unitários e de integração.

```java
@SpringBootTest
public class HelloWorldControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void helloShouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/hello"))
            .andExpect(status().isOk())
            .andExpect(content().string("Hello, World!"));
    }
}
```

O exemplo acima demonstra como testar o endpoint `/hello` para verificar se ele retorna a mensagem esperada.

#### Spring Boot Starter Data JPA
A persistência de dados é um aspecto crucial em muitas aplicações. O **Spring Boot Starter Data JPA** simplifica a integração com bancos de dados relacionais, abstraindo grande parte do código boilerplate necessário para criar repositórios e consultas.

```java
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // getters and setters
}

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name);
}
```

Com o código acima, definimos uma entidade `User` e um repositório que nos permite realizar operações CRUD de forma simplificada.

#### API (Application Programming Interface)
Uma **API** é um conjunto de definições e protocolos que permitem a comunicação entre diferentes sistemas de software. Elas são essenciais no desenvolvimento moderno, permitindo que diferentes aplicações se integrem e troquem informações.

##### REST (Representational State Transfer)
REST é um estilo de arquitetura de software que utiliza verbos HTTP para realizar operações. Ele é amplamente utilizado devido à sua simplicidade e flexibilidade.

```java
@PostMapping("/users")
public User createUser(@RequestBody User user) {
    return userRepository.save(user);
}
```

No exemplo acima, definimos um endpoint POST para criar um novo usuário.

##### SOAP (Simple Object Access Protocol)
SOAP é um protocolo que utiliza XML para troca de mensagens. Embora seja menos flexível que REST, ele é robusto e ainda utilizado em muitos sistemas legados.

##### WebSocket
WebSocket permite a comunicação bidirecional entre o cliente e o servidor, tornando-o mais eficiente que a API REST para certas aplicações, como chats em tempo real.

```java
@ServerEndpoint("/chat")
public class ChatEndpoint {

    @OnMessage
    public void onMessage(Session session, String message) throws IOException {
        for (Session s : session.getOpenSessions()) {
            s.getBasicRemote().sendText(message);
        }
    }
}
```

##### RPC (Remote Procedure Call)
RPC permite que um cliente execute funções no servidor e receba os resultados. É menos comum em novas aplicações, mas ainda é relevante em muitos contextos.

#### HTTP Status Codes
Os códigos de status HTTP indicam o resultado de uma solicitação HTTP. Por exemplo, os códigos 500-599 indicam erros no servidor.

#### Spring Initializr
O **Spring Initializr** é uma ferramenta web que permite a criação fácil de projetos Spring Boot. Com ele, você pode selecionar as dependências necessárias e gerar um projeto pronto para ser importado em sua IDE.

#### Annotations
As **anotações** foram introduzidas no Spring a partir da versão 2.5, simplificando drasticamente a configuração. Elas permitem que você configure componentes do Spring de forma declarativa, sem a necessidade de arquivos XML.

```java
@Service
public class MyService {
    // lógica do serviço
}
```

#### Spring Framework e Arquitetura de Três Camadas
O **Spring Framework** é um framework Java open source que facilita o desenvolvimento de aplicações robustas. Ele promove a arquitetura de três camadas, separando a aplicação em camada de apresentação, lógica de negócio e persistência de dados.

#### Verbos HTTP
Os verbos HTTP são usados para indicar a ação desejada ao realizar uma solicitação HTTP.

- **POST**: Submete uma entidade a um recurso específico.
- **PUT**: Substitui todas as representações atuais do recurso de destino pela carga de dados da requisição.
- **PATCH**: Aplica modificações parciais a um recurso.
- **GET**: Solicita a representação de um recurso específico.

### Conclusão
Spring Boot 3 é uma ferramenta indispensável para o desenvolvimento web em Java, proporcionando uma série de facilidades que permitem aos desenvolvedores focarem no que realmente importa: a lógica de negócio. Com uma comunidade ativa e uma ampla gama de funcionalidades, ele continua sendo uma das melhores escolhas para quem deseja desenvolver aplicações web robustas e escaláveis.