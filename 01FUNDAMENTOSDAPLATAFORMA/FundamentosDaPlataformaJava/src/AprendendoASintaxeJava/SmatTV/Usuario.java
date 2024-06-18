package AprendendoASintaxeJava.SmatTV;

public class Usuario {
    public static void main(String[] args) {
         Tv smartTv = new Tv();

        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Canal tual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        smartTv.desligar();

        smartTv.canalMais();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

    }
}
