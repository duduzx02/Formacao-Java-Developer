public class Cachorro implements Animal,QuatroPatas{
    @Override
    public void fazerSom() {
        System.out.println("Au au!");
    }

    @Override
    public void mover() {
        System.out.println("Cachorro se move correndo");
    }

    @Override
    public void TerPatas() {
        System.out.println("Cachorro tem 4 patas! ");
    }
}
