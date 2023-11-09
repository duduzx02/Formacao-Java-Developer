public class ResultadoEscolar {
    public static void main(String[] args) {

        double nota = 7.0;

        if(nota >= 7.0){
            System.out.println("Aprovado!");
        }else if(nota <=  7.0 && nota >= 5.0 ){
            System.out.println("Recuperação!!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
