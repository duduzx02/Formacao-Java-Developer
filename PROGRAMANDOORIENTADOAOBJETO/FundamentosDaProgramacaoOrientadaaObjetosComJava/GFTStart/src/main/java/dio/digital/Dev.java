package dio.digital;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
public class Dev {

    private String nome;
    private List<Conteudo> conteudosInscrito = new ArrayList<>();
    private List<Conteudo> conteudosConcluidos = new ArrayList<>();

    public void inscrever(Conteudo conteudo) {
        if (conteudosInscrito.contains(conteudo)) {
            System.err.println("Conteúdo já inscrito!");
        }else {
            conteudosInscrito.add(conteudo);
            System.out.println("Conteúdo adicionado!");
        }

    }

    public void inscrever(Bootcamp bootcamp) {
        for (Conteudo conteudo: bootcamp.getConteudos()) {
            inscrever(conteudo);
        }
        bootcamp.getDevs().add(this);

    }

    public void progredir(){
        Optional<Conteudo> conteudo = conteudosInscrito.stream().findFirst();
        if (conteudo.isPresent()){
            conteudosConcluidos.add(conteudo.get());
            conteudosInscrito.remove(conteudo.get());
        } else{
            System.out.println("Você concluido todos!");
        }
    }


    public double calcularTotalXp(){
        return conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
    }
}
