import java.util.Scanner;

public class PulandoNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// TODO: complete os espaços em branco com sua solução para o problema
        String[] nomes = new String[10];

        for(int i=0 ; i<10 ; i++) {
            System.out.println("Digite um nome");
            nomes[i] = sc.nextLine();

            if(nomes[i] == nomes[2] || nomes[i] == nomes[6] || nomes[i] == nomes[8]){
                System.out.println(nomes[i]);
            }
        }
    }
}