package Navegador;

public class Main {
    public static void main(String[] args) {
        NavegadorInternet navegador = new NavegadorInternet();

        navegador.adicionarNovaAba();
        navegador.exibirPagina("https://www.exemplo.com");
        navegador.atualizarPagina();

        navegador.adicionarNovaAba();
        navegador.exibirPagina("https://www.outroexemplo.com");
        navegador.atualizarPagina();

    }
}
