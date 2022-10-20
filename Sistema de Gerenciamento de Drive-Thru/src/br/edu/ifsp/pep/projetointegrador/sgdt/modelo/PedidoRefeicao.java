package br.edu.ifsp.pep.projetointegrador.sgdt.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pedido_refeicao")
@IdClass(PedidoRefeicaoPK.class)
public class PedidoRefeicao implements Serializable {
    
    @Id
    @ManyToOne
    @JoinColumn(name = "pedido_id", nullable = false)
    private Pedido pedido;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "refeicao_id", nullable = false)
    private Refeicao refeicao;
    
    @Column(name = "quantidade", nullable = false)
    private Integer quantidade;
    
    @Column(name = "preco_unitario_refeicao", precision = 10, scale = 2, nullable = false)
    private BigDecimal precoUnitarioRefeicao;
    
    //  Código Gerado
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Refeicao getRefeicao() {
        return refeicao;
    }

    public void setRefeicao(Refeicao refeicao) {
        this.refeicao = refeicao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPrecoUnitarioRefeicao() {
        return precoUnitarioRefeicao;
    }

    public void setPrecoUnitarioRefeicao(BigDecimal precoUnitarioRefeicao) {
        this.precoUnitarioRefeicao = precoUnitarioRefeicao;
    }
}
