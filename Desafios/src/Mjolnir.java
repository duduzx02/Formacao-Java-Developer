import java.util.Scanner;

public class Mjolnir {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quntas tentativas?");
        int C = leitor.nextInt();
        String nome;
        int N;

// TODO: complete os espaços em branco com sua solução para o problema

        for (int i = 0; i < C; i++) {
            System.out.println("Qual o nome? ");
            nome = leitor.next();
            System.out.println("Quanto de força? ");
            N = leitor.nextInt();
            if (nome.equals("Thor")) {
                System.out.println("Y");
            }
            else {
                System.out.println("N");
            }
        }
    }

}