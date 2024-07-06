import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InterfaceComparable {

    static class Pessoas implements Comparable<Pessoas> {
        private String nome;
        private int idade;

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public Pessoas(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        @Override
        public int compareTo(Pessoas o) {
            return this.nome.compareTo(o.nome);
        }

        static class IdadeComparator implements Comparator<Pessoas> {

            @Override
            public int compare(Pessoas o1, Pessoas o2) {
                return Integer.compare(o1.getIdade(), o2.getIdade());
            }
        }

        public static void main(String[] args) {
            List<Pessoas> pessoas = new ArrayList<>();
            pessoas.add(new Pessoas("Maria", 25));
            pessoas.add(new Pessoas("Joaquim", 30));
            pessoas.add(new Pessoas("Pedro", 20));
            pessoas.add(new Pessoas("Ana", 40));
            pessoas.add(new Pessoas("Carlos", 35));

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



            // Comparator
            System.out.println("Depois do Comparator comparando por idade: ");
            Collections.sort(pessoas, new IdadeComparator());
            for(Pessoas p : pessoas) {
                System.out.println(p.nome + " " + p.getIdade());
            }
        }
    }
}

