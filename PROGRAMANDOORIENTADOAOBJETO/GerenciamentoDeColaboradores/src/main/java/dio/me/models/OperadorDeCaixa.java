package dio.me.models;

import dio.me.models.Endereco;
import dio.me.models.FuncionarioCLT;

public class OperadorDeCaixa extends FuncionarioCLT {
    public OperadorDeCaixa() {

    }

    public OperadorDeCaixa(String nome, String documento, Double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco);
    }

    @Override
    public String toString() {
        return "OperadorDeCaixa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getRua() +
                '}';
    }
}
