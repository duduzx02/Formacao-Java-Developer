package classe;

public class Carro {
    // Atributos (variáveis) da classe
    String modelo;
    int anoFabricacao;
    boolean ligado;

    // Método da classe para ligar o carro
    void ligar(){
        ligado = true;
        System.out.println("O carro está ligado.");
    }

    // Método da classe para desligar o carro
    void desligar(){
        ligado = false;
        System.out.println("O carro está desligado.");
    }

    // Método para obter informações sobre o carro
    void exibirInformacoes(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Status: " + (ligado? "Ligado" : "Desligado"));
    }
}
