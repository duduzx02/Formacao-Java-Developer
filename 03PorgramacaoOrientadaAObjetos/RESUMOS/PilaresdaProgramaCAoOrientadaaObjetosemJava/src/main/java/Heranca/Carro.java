package Heranca;

public class Carro extends Veiculo{
    public Carro(String marca) {
        super(marca);
    }

    public void acelerar(){
        System.out.println("Carro acelerando");
    }

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Fiat");
        Carro carro = new Carro("Chevrolet");

        System.out.println(veiculo.marca);
        System.out.println(carro.marca);

        veiculo.ligar();

        carro.ligar();
        carro.acelerar();
    }
}
