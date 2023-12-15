package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
        System.out.println("Adicionando lanche natural no balcao");
    }

    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
    }

    private void prepararLanche(){
        System.out.println("Preparando lanche");
    }


    public void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }

}
