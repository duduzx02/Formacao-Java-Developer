package formulaUm;

public class Autodromo {
    public static void main(String[] args) {
        Carro ferrari = new Carro();
        Moto mt09 = new Moto();

        ferrari.setChassi("55654787");
        ferrari.ligar();

        mt09.setChassi("5874981");
        mt09.ligar();

    }
}
