public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2364509");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("CEP digitado errado!");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }

        return "23.645-098";

    }
}
