package ListaTelefonica;

public class CorreioVoz {
   private boolean temMensagens;

    public CorreioVoz() {
        this.temMensagens = false;
    }

    public void verificarMensagens(){
        if(temMensagens){
            System.out.println("Você tem novas mensagens no correio de voz.");
        }else {
            System.out.println("Não há novas mensagens no correio de voz.");
        }
    }
}
