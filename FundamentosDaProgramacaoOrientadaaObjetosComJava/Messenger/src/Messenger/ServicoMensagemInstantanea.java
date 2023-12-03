package Messenger;

public abstract class ServicoMensagemInstantanea {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("ENVIANDO MENSAGEM!");
        salvarHistoriacoMensagem();
    }

    public void receberMensagem(){
        System.out.println("RECEBENDO MENSAGEM!");
    }
    private void validarConectadoInternet(){
        System.out.println("VALIDANDO SE ESTÁ CONECTADO A INTERNET!");
    }
    private void salvarHistoriacoMensagem(){
        System.out.println("SALVANDO O HISTÓRICO DA MENSAGEM!");
    }
}
