package br.edu.ifsp.pep.projetointegrador.sgdt.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PedidoProdutoPK implements Serializable {

    @Column(name = "pedido_id", insertable = false, updatable = false)
    private Integer pedidoId;

    @Column(name = "produto_id", insertable = false, updatable = false)
    private Integer produtoId;

    public Integer getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Integer pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Integer getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Integer produtoId) {
        this.produtoId = produtoId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.pedidoId);
        hash = 89 * hash + Objects.hashCode(this.produtoId);
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
        final PedidoProdutoPK other = (PedidoProdutoPK) obj;
        if (!Objects.equals(this.pedidoId, other.pedidoId)) {
            return false;
        }
        return Objects.equals(this.produtoId, other.produtoId);
    }
}
