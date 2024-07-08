package FunctionalInterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        // A expressão lambda que soma dois valores
        BinaryOperator<Integer> sum = Integer::sum;
        System.out.println(sum.apply(5, 4));

    }
}
