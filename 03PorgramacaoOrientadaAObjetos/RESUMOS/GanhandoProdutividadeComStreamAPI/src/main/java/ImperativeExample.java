import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImperativeExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Mark", "Sarah"); // aqui estamos criando uma lista de nomes
        List<String> filteredNames = new ArrayList<>(); // aqui estamos criando uma lista vazia para armazenar os nomes filtrados

        // Filtrar nomes que comecam com a letra "J"
        for(String name : names){ // aqui estamos percorrendo a lista de nomes
            if(name.startsWith("J")){ // aqui estamos filtrando os nomes que comecam com J
                filteredNames.add(name.toUpperCase()); // aqui estamos adicionando os nomes filtrados a lista
            }
        }

        System.out.println(filteredNames); // aqui estamos imprimindo os nomes filtrados
    }
}
