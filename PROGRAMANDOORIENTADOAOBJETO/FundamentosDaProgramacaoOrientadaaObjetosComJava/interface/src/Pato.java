public class Pato implements Animal {
    @Override
    public void fazerSom() {
        System.out.println("Quack quack");
    }

    @Override
    public void mover() {
        System.out.println("Pato se move nanando!");
    }
}
