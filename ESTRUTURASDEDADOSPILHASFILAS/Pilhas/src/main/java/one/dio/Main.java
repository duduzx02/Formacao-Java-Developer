package one.dio;

public class Main {
    public static void main(String[] args) {

        Pilha<Integer> minhaPilha = new Pilha<>();

        minhaPilha.push(1);
        minhaPilha.push(2);
        minhaPilha.push(3);
        minhaPilha.push(4);
        minhaPilha.push(5);
        minhaPilha.push(6);
        System.out.println("A pilha está vazia? " + minhaPilha.isEmpty());

        System.out.println(minhaPilha);

        System.out.println(minhaPilha.top());

        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha);
        minhaPilha.push(89);

        System.out.println(minhaPilha);

    }
}
