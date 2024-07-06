package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterfaceList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a"); // adiciona o elemento a na lista
        list.add("d");
        list.add("c");
        list.add("b");

        System.out.println(list);

        System.out.println("Retonar o elemento na posiçãob 0 " + list.get(0)); // retorna o elemento na posição 0
        System.out.println("Remove o elemento na posiçãob 0 " + list.remove(0)); // remove o elemento na posição 0

        // Pesquisa e ordenação de listas
        Collections.sort(list); // ordena a lista
        System.out.println(list); // imprime a lista
        System.out.println(list.indexOf("c")); // imprime a posição do elemento b

    }
}
