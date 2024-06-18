package AtribuicaoReferencia;

public class Main {
    public static void main(String[] args) {

        int intA = 1;
        int intB = intA;

        System.out.println("IntA= " + intA + " IntB= " + intB);
        intA = 4;
        System.out.println("IntA= " + intA + " IntB= " + intB);


        MeuObj meuObjA = new MeuObj(1);
        MeuObj meuObjB = meuObjA;

        System.out.println("meuobjA= " + meuObjA + " meuObjB= " + meuObjB);
        meuObjA.setNum(8);
        System.out.println("meuobjA= " + meuObjA + " meuObjB= " + meuObjB);


    }
}
