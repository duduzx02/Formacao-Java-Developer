package Messenger.apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    protected void validarConectadoInternet(){
        System.out.println("VALIDANDO SE ESTÁ CONECTADO A INTERNET!");
    }
    private void salvarHistoriacoMensagem(){
        System.out.println("SALVANDO O HISTÓRICO DA MENSAGEM!");
    }
}
