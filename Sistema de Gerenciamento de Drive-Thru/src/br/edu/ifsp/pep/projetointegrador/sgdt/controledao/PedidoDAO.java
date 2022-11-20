package br.edu.ifsp.pep.projetointegrador.sgdt.controledao;

import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.Pedido;
import java.util.List;

public class PedidoDAO extends AbstractDAO<Pedido> {

    public List<Pedido> buscarTodos(){
        return getEntityManager()
                .createNamedQuery("Pedido.buscarTodos", Pedido.class)
                .getResultList();
    }
    
    public List<Pedido> buscarPorEstado (Pedido.EstadoPedido estadoPedido){
        return getEntityManager()
                .createNamedQuery("Pedido.buscarPorEstado", Pedido.class)
                .setParameter("estadoPedido", estadoPedido)
                .getResultList();
    }
    
    public List<Pedido> buscarEmFilaEmPreparo (){
        return getEntityManager()
                .createNamedQuery("Pedido.buscarEmFilaEmPreparo", Pedido.class)
                .setParameter("emFila", Pedido.EstadoPedido.EM_FILA)
                .setParameter("emPreparo", Pedido.EstadoPedido.EM_PREPARO)
                .getResultList();

    }
}
