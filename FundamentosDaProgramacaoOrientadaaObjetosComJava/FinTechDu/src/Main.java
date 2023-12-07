public class Main {
    public static void main(String[] args) {

        Cliente eduardo =  new Cliente();
        eduardo.setNome("Eduardo");

        Conta cc = new ContaCorrente(eduardo);
        Conta poupanca = new ContaPoupanca(eduardo);


        cc.depositar(100);
        poupanca.depositar(52);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.transferir(22, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
