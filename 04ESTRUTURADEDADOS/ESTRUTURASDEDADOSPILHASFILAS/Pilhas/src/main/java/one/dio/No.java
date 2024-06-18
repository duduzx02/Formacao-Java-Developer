package one.dio;

public class No<T>{

    private T dado;
    private No ref = null;

    public No() {
    }

    public No(T dado) {
        this.dado = dado;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No getRef() {
        return ref;
    }

    public void setRef(No ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
