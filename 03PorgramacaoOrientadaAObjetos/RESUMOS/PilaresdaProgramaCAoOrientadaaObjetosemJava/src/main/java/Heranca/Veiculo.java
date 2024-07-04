package Heranca;

public class Veiculo {
    protected String marca;

    public Veiculo(String marca) {
        this.marca = marca;
    }

    public void ligar(){
        System.out.println("Ligando o veiculo");
    }
}