import dio.me.Endereco;
import dio.me.OperadorDeCaixa;
import dio.me.Vendedor;

public class Main {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Francisco Camilo", "Perto do Hospital", "Cetro");
        Endereco endereco1 = new Endereco("Sei la", "perto de num sei da onde", "Ladeira");

        Vendedor vendedor = new Vendedor("Eduardo", "166.698.689-52", 3250.00, endereco);
        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Ertya", "569.698.589-84", 1325.00, endereco1);


        System.out.println(endereco);


        System.out.println(vendedor);

        System.out.println(operadorDeCaixa);


    }
}
