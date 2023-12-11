package dio.digital;

import java.util.List;

public class Bootcamp {

    private String nome;
    private List<Dev> devs;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Dev> getDevs() {
        return devs;
    }

    public void setDevs(List<Dev> devs) {
        this.devs = devs;
    }
}
