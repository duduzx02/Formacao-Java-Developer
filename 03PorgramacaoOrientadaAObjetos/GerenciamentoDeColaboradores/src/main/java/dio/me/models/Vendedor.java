package dio.me.models;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {

    private Double valorBonificacao;

    public Vendedor() {
    }

    public Vendedor(String nome, String documento, Double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco);
    }

    @Override
    public String toString() {
        return "Vendedor{" + "valorBonificacao=" + valorBonificacao + ", nome='" + nome + '\'' + ", documento='" + documento + '\'' + ", valorSalario=" + valorSalario + ", endereco=" + endereco.getRua() + '}';
    }

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = this.valorSalario * (porcentagemBonificacao / 100d);
    }
}
