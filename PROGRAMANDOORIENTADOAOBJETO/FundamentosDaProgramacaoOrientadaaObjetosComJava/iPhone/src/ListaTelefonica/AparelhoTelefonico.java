package ListaTelefonica;

public class AparelhoTelefonico {
    private boolean emLigacao;
    private Ligacao licacaoAtual;
    private CorreioVoz correioVoz;

    public AparelhoTelefonico(){
        this.emLigacao = false;
        this.correioVoz = new CorreioVoz();
    }

    public void fazerLigacao(String numero){
        if(!emLigacao){
            System.out.println("Chamando " + numero);
            licacaoAtual = new Ligacao(numero);
            emLigacao = true;
        } else {
            System.out.println("Você já estpa em uma ligação. Encerre a ligação atual para fazer uma nova chamada.");
        }
    }

    public void atenderLigacao(){
        if (emLigacao){
            System.out.println("Atendendo a ligação " + licacaoAtual.getNumeroChamador());
        } else {
            System.out.println("Não há chamadas recebidas no momento.");
        }
    }

    public void encerrarLigacao(){
        if(emLigacao){
            System.out.println("Ligação encerrada.");
            emLigacao = false;
            licacaoAtual = null;
        } else {
            System.out.println("Não há chamadas para encerrar.");
        }
    }

    public void verificarCorreioDeVoz(){
        correioVoz.verificarMensagens();
    }
}
