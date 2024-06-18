package Messenger.apps;

public class Facebook extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("ENVIANDO MENSAGEM PELO FACEBOOK");
    }

    @Override
    public void receberMensagem() {
        System.out.println("RECEBENDO MENSAGEM PELO FACEBOOK");
    }
}
