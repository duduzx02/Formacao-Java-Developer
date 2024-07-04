package Abstracao.Polimorfismo;

import Abstracao.Animal;
import Abstracao.Cachorro;
import Abstracao.Gato;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        cachorro.emitirSom();

        Animal gato = new Gato();
        gato.emitirSom();
    }
}
