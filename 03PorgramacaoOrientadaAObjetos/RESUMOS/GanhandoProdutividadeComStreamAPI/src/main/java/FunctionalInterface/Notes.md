# Functional Interfaces
## Consumer<T>
- Representa uma operação que aceita um único argumento de entra e não retorna nenhum resultado. Ele é 
  frequentemente usado para realziar operações em cada elemento de uma coleção.

## Supplier<T>
- Representa uma função que não aceita nenhum argumento e fornece um resultado.

## Function<T,R>
- Representa uma função que aceita um argumento de entrada e produz um resultado.

## Predicate<T>
- Representa uma função que aceita um único argumento de entrada e retorna um valor booleano.

## BinaryOperator<T>
- É um subinterface do ´BiFunction<T, T, T>´ e representa uma operação sobre dois operandos do mesmo tipo, 
  produzindo um resiltado do mesmo tipo.