package dio.digital;

import lombok.Data;

import java.util.List;

@Data
public class Dev {

    private String nome;
    private List<Conteudo> conteudosInscrito;
    private List<Conteudo> conteudosConcluidos;
}
