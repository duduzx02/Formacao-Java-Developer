package one.dio;

public class Pilha <T>{

    private No<T> refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(T no){
		No novoNo = new No(no);
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRef(refAuxiliar);
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRef();
            return noPoped;
        }
        return null;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorna = "---------------\n";
        stringRetorna += "      Pilha\n";
        stringRetorna += "---------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true) {
            if (noAuxiliar != null) {
                stringRetorna += "[No{dados= " + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRef();
            } else {
                break;
            }
        }

        stringRetorna += "===============\n";
        return stringRetorna;
    }

}
