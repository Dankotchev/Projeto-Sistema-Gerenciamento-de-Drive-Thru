package br.edu.ifsp.pep.projetointegrador.sgdt.modelo;

import java.io.Serializable;
import java.util.Objects;

public class PedidoRefeicaoPK implements Serializable{
    
    private Integer pedido;
    private Integer refeição;

    public Integer getPedido() {
        return pedido;
    }

    public void setPedido(Integer pedido) {
        this.pedido = pedido;
    }

    public Integer getRefeição() {
        return refeição;
    }

    public void setRefeição(Integer refeição) {
        this.refeição = refeição;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.pedido);
        hash = 47 * hash + Objects.hashCode(this.refeição);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PedidoRefeicaoPK other = (PedidoRefeicaoPK) obj;
        if (!Objects.equals(this.pedido, other.pedido)) {
            return false;
        }
        return Objects.equals(this.refeição, other.refeição);
    }
}
