package dio.me.models;

import lombok.Data;

@Data
public abstract class FuncionarioPJ {

    protected String nome;
    protected String documento;
    protected Endereco endereco;
    protected Integer horasTrabalhadas;
    protected Double valorDaHora;
    protected Double valorRemuneracao;

    public FuncionarioPJ(String nome, String documento, Endereco endereco, Integer horasTrabalhadas, Double valorDaHora) {
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorDaHora = valorDaHora;
    }

    public void calculaRemuneracao() {
        this.valorRemuneracao = this.valorDaHora * this.horasTrabalhadas;
    }
}
