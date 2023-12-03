package classe;

public class main {
    public static void main(String[] args) {
        // Criar um objeto da classe Carro

        Carro meuCarro = new Carro();

        // Configurar atributos
        meuCarro.modelo = "Fusca";
        meuCarro.anoFabricacao = 1970;

        // CHhmar métodos
        meuCarro.ligar();
        meuCarro.exibirInformacoes();
        meuCarro.desligar();
        meuCarro.exibirInformacoes();
    }
}
