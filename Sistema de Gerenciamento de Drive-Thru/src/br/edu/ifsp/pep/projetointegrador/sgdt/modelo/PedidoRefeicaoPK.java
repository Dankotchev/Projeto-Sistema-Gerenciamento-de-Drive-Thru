package br.edu.ifsp.pep.projetointegrador.sgdt.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PedidoRefeicaoPK implements Serializable {

    @Column(name = "pedido_id", insertable = false, updatable = false)
    private Integer pedidoId;

    @Column(name = "refeicao_id", insertable = false, updatable = false)
    private Integer refeiçãoId;

    public Integer getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Integer pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Integer getRefeiçãoId() {
        return refeiçãoId;
    }

    public void setRefeiçãoId(Integer refeiçãoId) {
        this.refeiçãoId = refeiçãoId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.pedidoId);
        hash = 11 * hash + Objects.hashCode(this.refeiçãoId);
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
        if (!Objects.equals(this.pedidoId, other.pedidoId)) {
            return false;
        }
        return Objects.equals(this.refeiçãoId, other.refeiçãoId);
    }
}
