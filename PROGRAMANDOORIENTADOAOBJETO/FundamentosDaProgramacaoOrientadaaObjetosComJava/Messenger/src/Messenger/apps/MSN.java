package Messenger.apps;

public class MSN extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("ENVIANDO MENSAGEM PELO MSN!");
    }

    @Override
    public void receberMensagem() {
        System.out.println("RECEBENDO MENSAGEM PELO MSN");
    }
}
