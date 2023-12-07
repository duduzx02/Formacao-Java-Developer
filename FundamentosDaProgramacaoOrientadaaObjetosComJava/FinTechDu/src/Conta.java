public class Conta {

    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;


    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
    }


    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){

    }

    public void depositar(double valor){

    }

    public void transferir(double valor, Conta contaDestino){

    }
}
