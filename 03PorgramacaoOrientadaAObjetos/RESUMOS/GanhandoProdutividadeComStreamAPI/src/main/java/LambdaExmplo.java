import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExmplo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Mark", "Sarah");
        // Ordenar a lsta em ordem alfabetica inversa
        Collections.sort(names, (a,b) -> b.compareTo(a));
        // Method reference
        names.forEach(System.out::println); //
    }
}
