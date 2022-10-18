package br.edu.ifsp.pep.projetointegrador.sgdt.modelo;

import java.util.List;

public class Cozinha {
    
    private List<Pedido> listaPedidos;
    
    // Modifica um pedido da lista em fila, para o estado em preparo
    public void prepararPedido(Pedido pedido){
        int posicao = listaPedidos.indexOf(pedido);
        Pedido get = listaPedidos.get(posicao);
        get.setEstadoPedido(Pedido.EstadoPedido.EM_PREPARO);
        listaPedidos.remove(posicao);
        listaPedidos.add(get);
    }
}
