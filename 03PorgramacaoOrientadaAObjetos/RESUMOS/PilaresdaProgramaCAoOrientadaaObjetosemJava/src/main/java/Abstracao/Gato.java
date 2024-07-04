package Abstracao;
// Polimorfismo

public class Gato implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }
}
