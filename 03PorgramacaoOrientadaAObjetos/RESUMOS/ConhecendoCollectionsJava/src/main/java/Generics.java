public class Generics {
    // classe genérica
    static class Caixa<T> {

        private T conteudo;

        public T getConteudo() {
            return conteudo;
        }

        public void setConteudo(T conteudo) {
            this.conteudo = conteudo;
        }

    }

    public static void main(String[] args) {
        Caixa<String> caixa = new Caixa<>();
        caixa.setConteudo("teste");
        System.out.println(caixa.conteudo);
    }
}
