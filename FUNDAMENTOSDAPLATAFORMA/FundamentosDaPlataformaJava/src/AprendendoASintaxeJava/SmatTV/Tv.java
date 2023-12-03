package AprendendoASintaxeJava.SmatTV;


public class Tv {
    boolean ligada = false;
    int canal = 1;
    int volume = 5;

    public void ligar(){
        ligada = true;
        System.out.println("Tv Ligada");
    }

    public void desligar(){
        ligada = false;
        System.out.println("Tv desligada");
    }

    public void canalMais(){
        canal++;
        System.out.println("Canal atual: " + canal);
    }

    public void canalMenos(){
        canal--;
        System.out.println("Canal atual: " + canal);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume: " + volume);
    }
}
