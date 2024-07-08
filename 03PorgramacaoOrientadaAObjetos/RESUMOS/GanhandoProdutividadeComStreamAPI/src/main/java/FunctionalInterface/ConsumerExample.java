package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Mark", "Sarah");

        Consumer<String> printName = name -> System.out.println(name); //aqui temos uma expressão lambda que imprime cada nome
        names.forEach(printName); // aqui estamos chamando a expressão lambda para cada nome
    }
}
