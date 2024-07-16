package ClaroJavaComSpringBoot.VerificandoVelocidadeMediaEQUedaDeConexao;

import java.util.Arrays;
import java.util.Scanner;

public class VelocidadeMediaDeConexao {

    // Função para calcular a velocidade média de conexão de internet
    public static int calcularVelocidadeMedia(String[] velocidades) {
        int totalSpeed = 0;

        totalSpeed = Arrays.stream(velocidades)// Convertendo a entrada em um array de inteiros
                .mapToInt(Integer::parseInt) // Convertendo cada string em um inteiro
                .sum(); // Somando todos os inteiros

        int averageSpeed = totalSpeed / velocidades.length;
        return averageSpeed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Calculando a velocidade média de conexão
        double velocidadeMedia = calcularVelocidadeMedia(velocidades);

        // Exibindo a velocidade média de conexão
        System.out.println((int)velocidadeMedia + " Mbps");

        scanner.close();
    }
}