package ClaroJavaComSpringBoot.ExplorandoServicoesDeTelefonia;

import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

enum Servico {
    MOVEL("movel"),
    BANDA_LARGA("banda larga"),
    TV("tv");

    private final String nome;

    Servico(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static Servico fromNome(String nome) {
        for (Servico servico : values()) {
            if (servico.getNome().equalsIgnoreCase(nome)) {
                return servico;
            }
        }
        throw new IllegalArgumentException("Serviço inválido");
    }
}

public class VerificaCombo {


    public static boolean isComboCompleto(Set<Servico> servicosContratados) {
        return servicosContratados.containsAll(Set.of(Servico.MOVEL, Servico.BANDA_LARGA, Servico.TV));
    }

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();
    scanner.close();

    Set<Servico> servicosContratados = Stream.of(input.split(","))
            .map(String::trim)
            .map(Servico::fromNome)
            .collect(Collectors.toSet());

    boolean comboCompleto = isComboCompleto(servicosContratados);
    System.out.println(comboCompleto ? "Combo Completo" : "Combo Incompleto");

    }
}
