package dio.digital;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Bootcamp {

    private String nome;
    private LocalDate inicio;
    private LocalDate fim;
    private List<Conteudo> conteudos;
    private List<Dev> devs;
}
