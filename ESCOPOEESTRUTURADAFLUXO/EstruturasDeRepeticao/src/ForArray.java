public class ForArray {
    public static void main(String[] args) {
        String alunos [] = {"Felipe", "Jonas", "Julia", "Marcos"};

        for (int x = 0; x < alunos.length; x++){
            System.out.printf("Aluno na posição %d é %s%n", x, alunos[x]);
        }
    }
}
