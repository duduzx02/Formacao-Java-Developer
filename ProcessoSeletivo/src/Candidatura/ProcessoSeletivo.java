package Candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(1900.0);
        analisarCandidato(2000.0);
        analisarCandidato(2900.0);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para candidato!");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para candidato com contra proposta!");
        } else {
            System.out.println("Aguradando o resultado dos demais candidatos!");
        }
    }
}
