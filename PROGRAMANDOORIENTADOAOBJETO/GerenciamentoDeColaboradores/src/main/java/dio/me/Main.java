package dio.me;

import dio.me.models.Endereco;
import dio.me.models.Gerente;
import dio.me.models.OperadorDeCaixa;
import dio.me.models.Vendedor;

public class Main {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Francisco Camilo", "Perto do Hospital", "Cetro");
        Endereco endereco1 = new Endereco("Sei la", "perto de num sei da onde", "Ladeira");

        Vendedor vendedor = new Vendedor("Eduardo", "166.698.689-52", 1000.00, endereco);
        vendedor.calculaBonificacao(2.0);
        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Ertya", "569.698.589-84", 1325.00, endereco1);

        Gerente gerente = new Gerente("Dudu Lima", "568.987.654-96", endereco, 20, 100.0);
        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3.0);

        System.out.println(vendedor);

        System.out.println(operadorDeCaixa);

        System.out.println(gerente);


    }
}
