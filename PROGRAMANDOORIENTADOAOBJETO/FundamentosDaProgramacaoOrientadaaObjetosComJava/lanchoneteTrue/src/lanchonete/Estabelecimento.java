package lanchonete;

import lanchonete.area.cozinha.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();


        Atendente atendente = new Atendente();

        // Ações que estabelecimento precisa ter ciência
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        atendente.servindoMesa();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

    }
}
