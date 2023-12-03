package Messenger;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSN msn = new MSN();
        Facebook facebook = new Facebook();
        Telegram telegram = new Telegram();

        System.out.println("Telegram: ");
        telegram.enviarMensagem();
        telegram.receberMensagem();

        System.out.println("Facebook: ");
        facebook.enviarMensagem();
        facebook.receberMensagem();

        System.out.println("MSN: ");
        msn.enviarMensagem();
        msn.receberMensagem();
    }
}
