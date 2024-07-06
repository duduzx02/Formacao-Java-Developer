import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterfaceComparable {

    static class Pessoas implements Comparable<Pessoas> {
        private String nome;

        public Pessoas(String nome) {
            this.nome = nome;
        }

        @Override
        public int compareTo(Pessoas o) {
            return this.nome.compareTo(o.nome);
        }

        public static void main(String[] args) {
            List<Pessoas> pessoas = new ArrayList<>();
            pessoas.add(new Pessoas("Maria"));
            pessoas.add(new Pessoas("Joaquim"));
            pessoas.add(new Pessoas("Pedro"));
            pessoas.add(new Pessoas("Ana"));
            pessoas.add(new Pessoas("Carlos"));

            // foreach
            for(Pessoas p : pessoas) {
                System.out.println(p.nome);
            }


            // sort
            System.out.println("Depois do sort: ");
            Collections.sort(pessoas);
            for(Pessoas p : pessoas) {
                System.out.println(p.nome);
            }
        }
    }
}

