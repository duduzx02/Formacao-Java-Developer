package Messenger.apps;

public class Telegram extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("ENVIANDO MENSAGEM PELO TELEGRAM!!");
    }

    @Override
    public void receberMensagem() {
        System.out.println("RECEBENDO MENSAGEM PELO TELEGRAM");
    }
}
