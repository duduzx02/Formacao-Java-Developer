package dio.me.models;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao {

    private Double valorBonificacao;


    public Gerente(String nome, String documento, Endereco endereco, Integer horasTrabalhadas, Double valorDaHora) {
        super(nome, documento, endereco, horasTrabalhadas, valorDaHora);
    }

    @Override
    public String toString() {
        return "Gerente{" + "nome='" + nome + '\'' + ", documento='" + documento + '\'' + ", endereco=" + endereco.getRua() + ", horasTrabalhadas=" + horasTrabalhadas + ", valorDaHora=" + valorDaHora + ", valorRemuneracao=" + valorRemuneracao + ", valorBonificacao=" + valorBonificacao + '}';
    }

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = (getValorRemuneracao() * (porcentagemBonificacao / 100)) + 100d;
    }
}
