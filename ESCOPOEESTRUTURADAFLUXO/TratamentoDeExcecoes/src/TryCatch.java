import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();


        System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("E tenho " + altura + " de altura");
        sc.close();
        } catch (InputMismatchException e){
            System.out.println("Esse campo precisa ser númerico!");
        }
    }
}

