import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {
        int i = 1;

        while(i <= 10){
            System.out.println(i);
            i++;
        }

        Scanner sc = new Scanner(System.in);
        int sorteado = 55;
        System.out.println("Tente adivinhar o número: ");
        int seuNumero = sc.nextInt();

        int contador = 1;


        while(seuNumero != sorteado){
            System.out.println("Tente adivinhar o número: ");
            seuNumero = sc.nextInt();
            contador++;
        }
        System.out.println("Numeros de tentativas: " + contador);
    }
}
