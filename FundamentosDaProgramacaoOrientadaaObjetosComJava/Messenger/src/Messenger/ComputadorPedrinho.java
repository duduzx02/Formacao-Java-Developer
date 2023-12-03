package Messenger;

import Messenger.apps.Facebook;
import Messenger.apps.MSN;
import Messenger.apps.ServicoMensagemInstantanea;
import Messenger.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "facebook";

        if(appEscolhido.equalsIgnoreCase("msn")){
            smi = new MSN();
        } else if (appEscolhido.equalsIgnoreCase("telegram")) {
            smi = new Telegram();
        } else if (appEscolhido.equalsIgnoreCase("facebook")){
            smi = new Facebook();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
