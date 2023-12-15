package ListaTelefonica;

public class Main {
    public static void main(String[] args) {
        AparelhoTelefonico telefone = new AparelhoTelefonico();

        telefone.fazerLigacao("23421341234");
        telefone.atenderLigacao();
        telefone.encerrarLigacao();
        telefone.verificarCorreioDeVoz();

    }
}
