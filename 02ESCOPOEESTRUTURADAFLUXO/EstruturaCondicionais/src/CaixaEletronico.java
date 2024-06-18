public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 45000.00;
        double saque = 150000.00;

        if(saldo > saque){
            saldo = saldo - saque;
            System.out.println(saldo);
        } else {
            System.out.println("Saldo insuficiente!!");
        }
    }
}
