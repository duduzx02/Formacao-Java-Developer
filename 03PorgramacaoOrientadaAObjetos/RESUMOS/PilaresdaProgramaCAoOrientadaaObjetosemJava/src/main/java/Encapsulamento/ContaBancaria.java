package Encapsulamento;

public class ContaBancaria {

    private double saldo;

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public double getSaldo(){
        return saldo;
    }


    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000);
        conta.sacar(50);
        System.out.println(conta.getSaldo());
    }

}
