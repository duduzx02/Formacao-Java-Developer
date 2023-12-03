public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos", "125.658.589-97");
        marcos.setEndereco("Rudas Marias");

        System.out.println(marcos.getNome()+ " : " + marcos.getCpf());
    }
}
