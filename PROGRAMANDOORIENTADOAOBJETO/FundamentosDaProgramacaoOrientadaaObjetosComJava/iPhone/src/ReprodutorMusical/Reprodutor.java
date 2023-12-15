package ReprodutorMusical;

public class Reprodutor {
    public static void main(String[] args) {
        Player reprodutor = new Player();
        Musica musica1 = new Musica("Música 1", "Artista 1", "Album 1", 140);
        Musica musica2 = new Musica("Música 2", "Artista 2", "Album 2", 240);

        reprodutor.reproduzir();
        reprodutor.adicionarMusica(musica1);
        reprodutor.adicionarMusica(musica2);

        reprodutor.reproduzir();
        System.out.println(reprodutor.obterInformacoesMusicalAtual());
        reprodutor.avancar();
        System.out.println(reprodutor.obterInformacoesMusicalAtual());
        reprodutor.aumentarVolume();
        System.out.println(reprodutor.getVolume());

    }
}
