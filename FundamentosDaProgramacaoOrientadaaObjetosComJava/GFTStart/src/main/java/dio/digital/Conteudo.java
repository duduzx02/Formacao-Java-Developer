package dio.digital;

import lombok.Data;

@Data
public abstract class Conteudo {

    public static final double XP_PADRAO = 10.0;


    private String titulo;
    private String descricao;

    protected abstract double calcularXp();

}
