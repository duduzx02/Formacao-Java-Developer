package ReprodutorMusical;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Musica> listaDemusicas;
    private Musica musicaAtual;
    private String estadoDeReproducao;
    private int volume;

    public Player(){
        listaDemusicas = new ArrayList<>();
        musicaAtual = null;
        estadoDeReproducao = "parado";
        volume  = 75;
    }

    public void adicionarMusica(Musica musica){
        listaDemusicas.add(musica);
    }

    public void removerMusica(Musica musica){
        listaDemusicas.remove(musica);
    }

    public void reproduzir(){
        if(!listaDemusicas.isEmpty()){
            musicaAtual = listaDemusicas.get(0);
            estadoDeReproducao = "reproduzindo";
            System.out.println("Reproduzindo: " + musicaAtual.titulo);
        }
    }

    public void pausar(){
        estadoDeReproducao = "pausado";
        System.out.println("Parado: " + musicaAtual.titulo);
    }

    public void avancar(){
        if(!listaDemusicas.isEmpty()){
            int indiceAtual = listaDemusicas.indexOf(musicaAtual);

            if (indiceAtual != -1 && indiceAtual < listaDemusicas.size() - 1){
                musicaAtual = listaDemusicas.get(indiceAtual + 1);
                System.out.println("Avançando para a próxima música: " + musicaAtual.titulo);
            } else {
                System.out.println("Não há mais músicas na lista.");
            }
        } else {
            System.out.println("A lista de música está vazia!");
        }
    }

    public void retroceder(){
        System.out.println("Retrocedendo para a música anterior!");
    }

    public void aumentarVolume(){
        volume+=1;
    }

    public void baixarVolume(){
        volume-=1;
    }

    public String obterInformacoesMusicalAtual(){
        if(musicaAtual != null){
            return "Titulo: " + musicaAtual.titulo + ", Artista: " + musicaAtual.titulo + ", Duração: " + musicaAtual.duracao +", segundos";
        } else {
            return "Nenhuma música em reproducação no momento.";
        }
    }

    public int getVolume() {
        return volume;
    }
}
