package Navegador;

public class Aba {
    private String paginaAtual;

    public void exibirPagina(String url){
        this.paginaAtual = url;
        System.out.println("Exibindo página: " + url);
    }

    public void atualizarPagina(){
        if(paginaAtual != null){
            System.out.println("Attualizando página: " + paginaAtual);
        } else {
            System.out.println("Nenhuma página para atualizar.");
        }
    }
}
