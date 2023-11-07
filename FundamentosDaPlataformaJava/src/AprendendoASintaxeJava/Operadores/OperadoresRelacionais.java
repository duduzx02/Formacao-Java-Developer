package AprendendoASintaxeJava.Operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        boolean maiorque = x > y;
        boolean menorque = x < y;
        boolean iqual = x == y;
        boolean diferente = x != y;
        boolean maiorouigual = x >= y;
        boolean menorigual = x <= y;


        String eduardo = "Eduardo";
        String livia = "Livia";

        System.out.printf("1 > 2: %b%n", maiorque);
        System.out.printf("1 < 2: %b%n", menorque);
        System.out.printf("1 == 2: %b%n", iqual);
        System.out.printf("1 != 2: %b%n", diferente);
        System.out.printf("1 >= 2: %b%n", maiorouigual);
        System.out.printf("1 <= 2: %b%n", menorigual);

        System.out.println(eduardo.equalsIgnoreCase(livia));

    }
}
