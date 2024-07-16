package ClaroJavaComSpringBoot.ExplorandoServicoesDeTelefonia;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		String servico = scanner.nextLine();
		String listaContratados = scanner.nextLine();
		List<String> partes = Arrays.asList(listaContratados.split(","));

   		boolean contratdo = estaContratado(servico, partes);
		System.out.println(contratdo ? "Sim" : "Nao");

		scanner.close();
    }

	public static boolean estaContratado(String servico, List<String> partes) {
		for(String parte : partes){
			if(parte.equalsIgnoreCase(servico)){
				return true;
			}
		}
		return false;
	}
}