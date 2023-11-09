import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var novaConta = new ContaTerminal();

        novaConta.saldo = 1000000000.44;

        System.out.println("Por favor, digite o seu nome: ");
        novaConta.nome = sc.nextLine();
        System.out.println("Por favor, digite o número da agência!");
        novaConta.agencia = sc.nextLine();
        System.out.println("Por favor, digite agora o número da conta!");
        novaConta.numeroConta = sc.nextInt();


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s," +
                " conta %d e seu saldo %.2f já está disponível para saque.", novaConta.nome, novaConta.agencia,
                novaConta.numeroConta, novaConta.saldo );


    }
}
