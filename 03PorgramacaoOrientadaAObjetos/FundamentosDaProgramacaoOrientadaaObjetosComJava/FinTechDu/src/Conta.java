import lombok.Data;

@Data
public class Conta {

    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private int agencia;
    private int conta;
    private double saldo;
    private Cliente cliente;


    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor){
        if (saldo >= valor){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }else {
            System.out.println("Você tentou sacar, porem!");
            System.out.println("Saldo insuficiente!");
        }

    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Deposito realizado com sucesso!!");
    }

    public void transferir(double valor, Conta contaDestino){
        if(saldo >= valor){
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferencia realizada com sucesso!!");
        } else {
            System.out.println("Você tentou tranferir! porem...");
            System.out.println("Saldo infuciente!");
        }

    }

    protected void imprimirExtrato(){
        System.out.println("Agencia: " +  getAgencia());
        System.out.println("Conta: " + getConta());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Nome: " + getCliente().getNome());
    }
}
