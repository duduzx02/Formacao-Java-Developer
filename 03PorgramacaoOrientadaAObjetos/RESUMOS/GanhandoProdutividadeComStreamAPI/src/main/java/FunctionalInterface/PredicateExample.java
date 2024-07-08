package FunctionalInterface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // A expressão lambda que verifica se um número é par
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println(isEven.test(5));
    }
}
