package Candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
  //      selecaoCandidatos();
  //      imprimirSelecionados();

        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        for (String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
    }

        static void entrandoEmContato(String candidato){
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;

           do{
               atendeu = atender();
               continuarTentando = !atendeu;
               if(continuarTentando){
                   tentativasRealizadas++;
               } else {
                   System.out.println("Contato realizado com sucesso!");
               }
           } while(continuarTentando && tentativasRealizadas<3);

           if(atendeu){
               System.out.println("Conseguimos contanto com " + candidato +" na " + tentativasRealizadas);
           } else {
               System.out.println("Não conseguimos contato com " + candidato);
           }
        }

    // método auxiliar
        static boolean atender(){
            return new Random().nextInt(3)==1;
        }

    static void imprimirSelecionados(){
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        for (String candidato: candidatos) {
            System.out.println(candidato);
        }
    }

    static void selecaoCandidatos () {

            String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA",
                    "DANIELA", "JOSE"};

            int candidatosSelecionados = 0;
            int canditadoAtual = 0;
            double salarioBase = 2000.0;
            while (candidatosSelecionados < 5 && canditadoAtual < candidatos.length) {
                String candidato = candidatos[canditadoAtual];
                double salarioPretendido = valorPretendido();

                System.out.println("O canditado " + candidato + " Solicitou este valor: " + salarioPretendido);
                if (salarioBase < salarioPretendido) {
                    System.out.println("O candidato " + candidato + " foi selecionado!");
                    candidatosSelecionados++;
                }

                canditadoAtual++;
            }
        }


        static double valorPretendido () {
            return ThreadLocalRandom.current().nextDouble(1800, 2200);
        }


        static void analisarCandidato ( double salarioPretendido){
            double salarioBase = 2000.0;
            if (salarioBase > salarioPretendido) {
                System.out.println("Ligar para candidato!");
            } else if (salarioBase == salarioPretendido) {
                System.out.println("Ligar para candidato com contra proposta!");
            } else {
                System.out.println("Aguradando o resultado dos demais candidatos!");
            }
        }
}

