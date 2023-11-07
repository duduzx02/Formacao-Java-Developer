public class ConstantesEVariaveis {
    public static void main(String[] args) {

        final String BR = "Brasil";
        final double PI = 3.14;
        final int ESTADOS_BRASILEIROS = 27;
        final int ANO_2000 = 2000;


        int numero_um = 1;
        int numero1 = 1;
        int numeroUm = 1;
        int longo = 1;

        String meuNomw = "Eduardo";
        int anoFabricacao = 2022;
        boolean verdadeiraOuFalsa = true;
        verdadeiraOuFalsa = false;

        String nome = "Eduardo";
        String sobrenome = "Lima";

        String nomeCompleto = nomeCompleto(nome, sobrenome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String nome, String sobrenome){
        return nome.concat(" ").concat(sobrenome);
    }
}
