- Qual a estrutura básica de um método de teste no JUnit?
-
    - Um método sem retorno (void), anotado como @Test e com uma validação realizada por meio da classe Assertions.
- Em que consiste o conceito de unidade quando se fala em testes unitários?
-
    - Unidade é a meno parte testável de uma aplicação, no contexto de java, seria métodos existentes nas classes.
- Com as IDEs disponíveis para uso, o desenvolvimento e execução de testes unitários é facilitado. No caso de
  encontrar buds, qual recurso presente nessas ferramentas facilita a investigação?
-
    - Debug
- Qual método de Assertions permite validar se o valor esperado é igual resultado obtido?
-
    - assertEquals
- @DisplayName
-
    - Dar um nome especial ao teste
- @Disabled
-
    - Desabilitar teste
- @Order
-
    - Ordenar execução de testes numericamente
- Boas práticas sobre teste unitários:
-
    - Legibilidade no entendimento das validações
-
    - Automatizar a execução dos testes na aplicação
-
    - Padronizar a nomenclatura escolhida para os testes.
-
    - Tentar iniciar os testes o mais próximo possível do desenvolvimento de funcionalidade.
- O método assertThrows
-
    - É o método da classe Assertions que vai validar se uma exceção foi lançada.
- @Test
-
    - É a anotação do JUnit que informa que estamos escrevendo um teste unitário.
- Métodos com as anotações @BeforeAll e @AfterAll respectivamente:
-
    - Executam antes e depois de todos os testes, uma única vez.
- Os métodos assertNull e assertNotNull da classe Aseertions validam
-
    - Se um objeto está nulo ou não nulo.

## Estrutura Básica de um Método de Teste no JUnit

A estrutura básica de um método de teste no JUnit envolve a utilização da anotação `@Test` e a validação de resultados
usando a classe `Assertions`. Um método de teste típico é sem retorno (void) e deve conter uma ou mais assertivas que
verificam a correção do comportamento da unidade em teste.

Exemplo básico de um método de teste:

```java
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    void shouldReturnExpectedValue() {
        // Arrange
        MyService service = new MyService();

        // Act
        int result = service.calculate(2, 3);

        // Assert
        assertEquals(5, result, "O resultado deveria ser 5");
    }
}
```

## Conceito de Unidade em Testes Unitários

Em testes unitários, a "unidade" refere-se à menor parte testável de uma aplicação. No contexto de Java, isso
normalmente se refere a métodos dentro de classes. Testar uma unidade envolve isolar essa parte do código e verificar se
ela funciona conforme esperado em diversos cenários, sem a interferência de outras partes do sistema.

## Recurso de Debug em IDEs

IDE's como IntelliJ IDEA e Eclipse fornecem recursos robustos de depuração (debugging) que facilitam a investigação de
bugs encontrados durante a execução de testes unitários. Com o debug, é possível definir pontos de interrupção (
breakpoints), inspecionar variáveis e a pilha de chamadas, e executar o código passo a passo para identificar a origem
dos problemas.

## Validação de Valores com Assertions

Para validar se o valor esperado é igual ao resultado obtido em um teste, utilizamos o método `assertEquals` da
classe `Assertions`.

Exemplo:

```java
assertEquals(expectedValue, actualValue, "Os valores deveriam ser iguais");
```

## Anotações do JUnit

- **@DisplayName**: Permite definir um nome descritivo para o teste, facilitando a leitura e o entendimento dos
  relatórios de execução de testes.

  ```java
  @Test
  @DisplayName("Deve calcular a soma de dois números")
  void shouldCalculateSum() {
      // Test code
  }
  ```

- **@Disabled**: Utilizada para desabilitar um teste temporariamente. Pode ser útil quando um teste está falhando e
  precisa de correção, mas não queremos que ele interrompa a execução dos demais testes.

  ```java
  @Test
  @Disabled("Desabilitado até que o bug #123 seja corrigido")
  void disabledTest() {
      // Test code
  }
  ```

- **@Order**: Utilizada para definir a ordem de execução dos testes. Útil em cenários onde a ordem dos testes é
  importante.

  ```java
  @Test
  @Order(1)
  void firstTest() {
      // Test code
  }
  ```

## Boas Práticas para Testes Unitários

1. **Legibilidade**: Escrever testes que sejam fáceis de entender e mantenham uma estrutura clara, com seções bem
   definidas de configuração (arrange), execução (act) e verificação (assert).

2. **Automatização**: Configurar a execução automática dos testes, como parte do processo de integração contínua, para
   garantir que novas alterações no código não quebrem funcionalidades existentes.

3. **Padronização**: Adotar uma nomenclatura padrão para os métodos de teste, facilitando a identificação do que cada
   teste está verificando.

4. **Testes Precoces**: Iniciar a escrita de testes o mais próximo possível do desenvolvimento das funcionalidades,
   promovendo o desenvolvimento orientado a testes (TDD).

## Validação de Exceções com assertThrows

O método `assertThrows` da classe `Assertions` é utilizado para verificar se um determinado código lança uma exceção
específica.

Exemplo:

```java
assertThrows(IllegalArgumentException .class, () ->{
        myService.

doSomethingThatThrows();
},"Deveria lançar IllegalArgumentException");
```

## Métodos com as Anotações @BeforeAll e @AfterAll

- **@BeforeAll**: Executa um método antes de todos os testes de uma classe. É usado para configurar recursos
  compartilhados que precisam ser inicializados uma única vez.

  ```java
  @BeforeAll
  static void setup() {
      // Configuração inicial
  }
  ```

- **@AfterAll**: Executa um método após todos os testes de uma classe. É usado para liberar recursos compartilhados que
  foram configurados no método anotado com @BeforeAll.

  ```java
  @AfterAll
  static void teardown() {
      // Liberação de recursos
  }
  ```

## Validação de Nulidade com assertNull e assertNotNull

Os métodos `assertNull` e `assertNotNull` da classe `Assertions` validam se um objeto está nulo ou não nulo,
respectivamente.

Exemplos:

```java
assertNull(objeto, "O objeto deveria ser nulo");

assertNotNull(objeto, "O objeto não deveria ser nulo");
```

---

Escrever testes unitários é uma prática essencial para garantir a qualidade e a robustez do software. Utilizar
corretamente as ferramentas e práticas de teste não apenas facilita a detecção precoce de bugs, mas também promove um
código mais limpo e bem estruturado. Seguindo essas diretrizes e boas práticas, você estará mais bem preparado para
desenvolver aplicações confiáveis e manter um ciclo de desenvolvimento eficiente e sustentável.