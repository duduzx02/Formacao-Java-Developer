package Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("d");
        set.add("a");
        set.add("c");
        set.add("b");
        System.out.println(set.contains("b"));
        System.out.println(set.remove("b"));

        System.out.println(set); // Não importa a ordem sempre ira mostrar em ordem alfabetica

        Set<Integer> set2 = new TreeSet<>();
        set2.add(2);
        set2.add(1);
        set2.add(3);
        set2.add(4);
        System.out.println(set2); // TreeSet mantém a ordem natural dos elementos

    }
}
