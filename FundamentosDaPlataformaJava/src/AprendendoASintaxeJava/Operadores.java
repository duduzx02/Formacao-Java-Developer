package AprendendoASintaxeJava;

import java.util.Date;

public class Operadores {
    public static void main(String[] args) {
        System.out.println("Operador de atribuição: ");

        Date dataAgora = new Date();
        System.out.println(dataAgora);


        System.out.println("Operadores aritméticos");

        double soma = 10.5 + 12.5;
        double subtracao = 113 - 25;
        double multiplicacao = 20 * 7;
        double divisao = 15 / 3;
        double modulo = 19 % 3;
        double resultado = (13 + 7) / (10 * 1);

        System.out.println("Soma: " + soma);
        System.out.println("subtracao: " + subtracao);
        System.out.println("multiplicacao: " + multiplicacao);
        System.out.println("divisao: " + divisao);
        System.out.println("modulo: " + modulo);
        System.out.println("resultado: " + resultado);
    }
}
