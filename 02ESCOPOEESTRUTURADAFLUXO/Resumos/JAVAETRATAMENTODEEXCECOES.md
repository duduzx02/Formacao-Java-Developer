- Qual palavra reservada utilizada para determinar em um tratamento de exceççoes que havendo ou não uma execeção, o 
  código será executado?
- - finally
- Palavras que fazem parte do contexto de tratamento de exceções
- - cath
- - try
- - throw
- - throws
- Quais são as duas subcategorias de exeções?
- checked \ unchecked
- Imagina que precisa criar sua própria exceção checada, como seria a implementação apropriada?
````java
class MinhasExcecao extends Exception {} 
````

## Tratamento de Exceções em Java

### Introdução

Em Java, o tratamento de exceções é uma característica fundamental que permite lidar com situações anômalas ou condições de erro que podem ocorrer durante a execução de um programa. As exceções são eventos que podem alterar o fluxo normal de um programa e, se não forem tratadas adequadamente, podem levar à falha do programa. O mecanismo de tratamento de exceções em Java é baseado em cinco palavras-chave: `try`, `catch`, `finally`, `throw` e `throws`.

### Palavras-chave do Tratamento de Exceções

#### try

O bloco `try` é usado para envolver o código que pode lançar uma exceção. Dentro do bloco `try`, você coloca o código que deseja monitorar para possíveis exceções.

```java
try {
    // Código que pode lançar uma exceção
}
```

#### catch

O bloco `catch` é usado para capturar e tratar as exceções lançadas dentro do bloco `try`. Você pode ter múltiplos blocos `catch` para tratar diferentes tipos de exceções.

```java
try {
    // Código que pode lançar uma exceção
} catch (TipoDaExcecao e) {
    // Código para tratar a exceção
}
```

#### finally

O bloco `finally` contém código que será executado independentemente de uma exceção ser lançada ou não. Isso é útil para liberar recursos, como fechar arquivos ou conexões de banco de dados.

```java
try {
    // Código que pode lançar uma exceção
} catch (TipoDaExcecao e) {
    // Código para tratar a exceção
} finally {
    // Código que sempre será executado
}
```

#### throw

A palavra-chave `throw` é usada para lançar uma exceção explicitamente.

```java
if (condicaoDeErro) {
    throw new TipoDaExcecao("Mensagem de erro");
}
```

#### throws

A palavra-chave `throws` é usada na assinatura de um método para declarar que esse método pode lançar uma ou mais exceções.

```java
public void meuMetodo() throws TipoDaExcecao {
    // Código que pode lançar TipoDaExcecao
}
```

### Subcategorias de Exceções

As exceções em Java são divididas em duas grandes categorias:

1. **Checked Exceptions (Exceções Checadas)**: São verificadas em tempo de compilação. O compilador exige que essas exceções sejam tratadas explicitamente, seja usando blocos `try-catch` ou declarando-as na assinatura do método com `throws`. Exemplos incluem `IOException` e `SQLException`.

2. **Unchecked Exceptions (Exceções Não Checadas)**: Não são verificadas em tempo de compilação. São subclasses de `RuntimeException`. O tratamento dessas exceções é opcional. Exemplos incluem `NullPointerException` e `ArrayIndexOutOfBoundsException`.

### Criando Sua Própria Exceção Checada

Para criar uma exceção checada personalizada, você deve estender a classe `Exception`. Aqui está um exemplo:

```java
public class MinhaExcecao extends Exception {
    public MinhaExcecao(String mensagem) {
        super(mensagem);
    }
}
```

E aqui está como você pode usar essa exceção em um método:

```java
public class Exemplo {
    public void meuMetodo() throws MinhaExcecao {
        // Condição para lançar a exceção
        if (algumaCondicao) {
            throw new MinhaExcecao("Ocorreu um erro personalizado.");
        }
    }
}
```

### Conclusão

O tratamento de exceções em Java é uma prática essencial para garantir que os programas possam lidar com condições de erro de maneira controlada e robusta. Utilizando as palavras-chave `try`, `catch`, `finally`, `throw` e `throws`, os desenvolvedores podem capturar e tratar exceções adequadamente, melhorando a confiabilidade e a manutenção do código. Além disso, a distinção entre exceções checadas e não checadas permite um controle mais preciso sobre como os erros são gerenciados em diferentes contextos. Compreender e implementar o tratamento de exceções de forma eficaz é uma habilidade crucial para qualquer desenvolvedor Java.