package FunctionalInterface;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> greetSupplier = () -> "Hello, World!";
        System.out.println(greetSupplier.get());
    }
}
