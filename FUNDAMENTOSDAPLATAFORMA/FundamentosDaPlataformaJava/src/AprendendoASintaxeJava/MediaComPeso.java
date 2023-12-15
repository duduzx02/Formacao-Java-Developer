package AprendendoASintaxeJava;

import java.util.Scanner;

public class MediaComPeso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, media;

        System.out.println("Digite um número: ");
        A = sc.nextDouble();
        System.out.println("Digite outro número: ");
        B = sc.nextDouble();

        media = (A * 3.5 + B * 7.5) / 11;

        System.out.printf("Media: %.5f", media );
    }
}
