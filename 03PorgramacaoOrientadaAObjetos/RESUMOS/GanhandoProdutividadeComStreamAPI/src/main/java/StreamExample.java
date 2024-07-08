import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Mark", "Sarah");

        // Filtrar nomes que começam com a letra "J"
        List<String> filteredNames = names.stream() // aqui estamos criando um stream
                .filter(name -> name.startsWith("J")) // aqui estamos filtrando os nomes que comecam com J
                .map(String::toUpperCase) // aqui estamos mapeando os nomes para letras maiusculas
                .toList(); // aqui estamos convertendo o stream para uma lista

        System.out.println(filteredNames); // aqui estamos imprimindo os nomes filtrados
    }
}
