public class ResultadoEscolar {
    public static void main(String[] args) {

        double nota = 4.9;

        String resultado = nota >= 7.0 ? "Aprovado!" : nota >= 5.0 ? "Recuperação!!" : "Reprovado!!";

        System.out.println(resultado);
    }
}
