package Map;

import java.util.HashMap;
import java.util.Map;

public class ClassMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        System.out.println(map);

        map.remove(2); // remove o elemento com a chave 2
        System.out.println(map);

        System.out.println(map.get(1)); // retorna o elemento com a chave 1
        System.out.println(map);

        // Pesquisa
        System.out.println(map.containsKey(3)); // verifica se existe o elemento com a chave 3
        System.out.println(map.containsValue("b")); // verifica se existe o elemento com o valor b
    }
}
