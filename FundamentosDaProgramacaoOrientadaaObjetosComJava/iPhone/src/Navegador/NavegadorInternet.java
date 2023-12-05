package Navegador;

import java.util.ArrayList;

public class NavegadorInternet {
    private ArrayList<Aba> abas;

    public NavegadorInternet(){
        this.abas = new ArrayList<>();
    }

    private Aba obterAbaAtual(){
        if(!abas.isEmpty()){
            return abas.get(abas.size() -1);
        } else {
            return null;
        }
    }

    public void exibirPagina(String url){
        Aba abatual = obterAbaAtual();
        if(abatual !=null){
            abatual.exibirPagina(url);
        } else {
            System.out.println("Nenhuma aba aberta. Adicione uma nova aba para exibir uma página.");
        }
    }

    public void adicionarNovaAba(){
        Aba novaAba = new Aba();
        abas.add(novaAba);
        System.out.println("Nova aba adicionada. Adicione uma nova aba para atualizar uma página.");
    }

    public void atualizarPagina(){
        Aba abaAtual = obterAbaAtual();
        if(abaAtual != null){
            abaAtual.atualizarPagina();
        } else {
            System.out.println("Nenhuma aba aberta.Adicione uma nova aba");
        }
    }
}
