package dio.me.models;

import lombok.Data;

@Data
public class Endereco {

    private String rua;
    private String complemento;
    private String bairro;

    public Endereco() {
    }

    public Endereco(String rua, String complemento, String bairro) {
        this.rua = rua;
        this.complemento = complemento;
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "Rua: " + rua + " Complemento: " + complemento + " Bairro: " + bairro;
    }
}
