
### Primeiro Exemplo: Verificação da Idade

**Objetivo:** Verificar se a idade de uma pessoa é suficiente para ir para a piscina de adultos ou para a piscina de crianças.

#### Código Corrigido

```java
public class App {
    public static void main(String[] args) throws Exception {
        int idade = 14;
        if (idade >= 16) {
            System.out.println("Vá para a piscina de adultos");
        } else {
            System.out.println("Vá para a piscina de crianças");
        }
    }
}
```

#### Explicação do Código

1. **Declaração da Classe:**
    ```java
    public class App {
    ```
   Define a classe pública `App`.

2. **Método Principal:**
    ```java
    public static void main(String[] args) throws Exception {
    ```
   Declara o método `main`, que é o ponto de entrada do programa. O método é `public` para ser acessível, `static` porque é chamado sem precisar de uma instância da classe, e `void` porque não retorna nenhum valor. `throws Exception` indica que o método pode lançar uma exceção.

3. **Declaração da Variável:**
    ```java
    int idade = 14;
    ```
   Define uma variável inteira `idade` e atribui a ela o valor 14.

4. **Estrutura de Controle `if-else`:**
    ```java
    if (idade >= 16) {
        System.out.println("Vá para a piscina de adultos");
    } else {
        System.out.println("Vá para a piscina de crianças");
    }
    ```
   Verifica se `idade` é maior ou igual a 16. Se for, imprime "Vá para a piscina de adultos". Caso contrário, imprime "Vá para a piscina de crianças".

### Segundo Exemplo: Comparação de Alturas

**Objetivo:** Comparar a altura de João e Marcos e imprimir quem é mais alto.

#### Código Corrigido

```java
public class App {
    public static void main(String[] args) {
        double alturaJoao = 1.46;
        double alturaMarcos = 1.37;
        
        if (alturaMarcos < alturaJoao) {
            System.out.println("João é mais alto que Marcos");
        } else {
            System.out.println("Marcos é mais baixo que João");
        }
    }
}
```

#### Explicação do Código

1. **Declaração da Classe:**
    ```java
    public class App {
    ```
   Define a classe pública `App`.

2. **Método Principal:**
    ```java
    public static void main(String[] args) {
    ```
   Declara o método `main`, que é o ponto de entrada do programa.

3. **Declaração das Variáveis:**
    ```java
    double alturaJoao = 1.46;
    double alturaMarcos = 1.37;
    ```
   Define duas variáveis de ponto flutuante `alturaJoao` e `alturaMarcos` e atribui valores a elas.

4. **Estrutura de Controle `if-else`:**
    ```java
    if (alturaMarcos < alturaJoao) {
        System.out.println("João é mais alto que Marcos");
    } else {
        System.out.println("Marcos é mais baixo que João");
    }
    ```
   Verifica se `alturaMarcos` é menor que `alturaJoao`. Se for, imprime "João é mais alto que Marcos". Caso contrário, imprime "Marcos é mais baixo que João".

#### Mudando a Condicional

Se quisermos inverter a lógica da comparação, mudamos a condicional:

```java
public class App {
    public static void main(String[] args) {
        double alturaJoao = 1.46;
        double alturaMarcos = 1.37;
        
        if (alturaMarcos > alturaJoao) {
            System.out.println("Marcos é mais baixo que João");
        } else {
            System.out.println("João é mais alto que Marcos");
        }
    }
}
```

### Resumo

- **Método `main` correto:** `public static void main(String[] args)`.
- **Estruturas de controle `if-else`** corretamente formatadas e sem erros de sintaxe.
- **Comparações:** Alterar o operador de condicional (`<`, `>`, `<=`, `>=`) altera a lógica da comparação.

Esses exemplos e explicações devem ajudá-lo a entender melhor como utilizar `if-else` em Java.