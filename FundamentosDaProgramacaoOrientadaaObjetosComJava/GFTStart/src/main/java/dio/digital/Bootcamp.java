package dio.digital;

import lombok.Data;

import java.util.List;

@Data
public class Bootcamp {

    private String nome;
    private List<ConteudoEducacional> conteudos;
    private List<Dev> devs;

}
