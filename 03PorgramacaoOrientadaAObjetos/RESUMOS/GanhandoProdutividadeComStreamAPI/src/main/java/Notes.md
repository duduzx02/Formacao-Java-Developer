# Stream API
## Introdução 
- A Stream API foi introduzida no Java 8 como uma maneira de realizar operações de agregação em coleções de maneira 
  mais expressiava e eficiente. Ela permite processar dados em um estilo funcional, suportando operações como 
  filtrar, mapear, reduzir, entre outros.
### Por que usar a Stream API?
- **Concisa e legível:** Reduz a quantidade de código necessária para realizar operações comuns.;
- **Paralelismo:** Facilita a execução de operações em paralelo.
- **Imutabilidade:** As streams não modificam as fontes dos dados, mas produzem novos resultados.

## Programação Imperativa
- Na programação imperativa, você descreve como o programa deve atingir um determiado resultado. Foca-se no controle 
  explícito do fluxo de execução.

## Programação Declarativa
- Na programação declarativa, você descreve o que deseja alancaçar, sem especificar os detalhes de como isso deve 
  ser feito.

## Lambda expressions
- Uma expressão lambda é uma forma consisa de representar uma função anônima (uma função sem nome). Ela permite 
  tratar funcionalidades como argumentos de métodos ou armazená-las em variáveis.
### Sintaxe
`(parameters) -> expression`
se houver várias intruções:
`(parameters) -> { statements; }`
### Exemplos
1. Uma expressão lambda que soma dois números:
   `(int a, int b) -> a + b`
2. Usando lambda com coleções:
```
  List<String> names = Arrays.asList("Ana", "João", "Carlos", "Maria");

  // Ordenar a lista em ordem alfabética inversa
  Collections.sort(names, (a, b) -> b.compareTo(a));

  names.forEach(name -> System.out.println(name));
 ```

## Method References
- Uma referência de método é uma forma simplificada de escrever uma expressão lambda que apenas chama um método 
existente. Elas são particulamente úteis para tornar o código mais legível.
### Sintaxe
`ClassName::methodName`

