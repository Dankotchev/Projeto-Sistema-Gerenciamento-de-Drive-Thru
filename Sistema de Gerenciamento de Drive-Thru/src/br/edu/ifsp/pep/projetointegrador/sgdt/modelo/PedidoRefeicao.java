package br.edu.ifsp.pep.projetointegrador.sgdt.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pedido_refeicao")
public class PedidoRefeicao implements Serializable {

    @EmbeddedId
    PedidoRefeicaoPK pedidoRefeicaoPK;

    @ManyToOne
    @JoinColumn(name = "pedido_id", nullable = false)
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "refeicao_id", nullable = false)
    private Refeicao refeicao;

    @Column(name = "quantidade", nullable = false)
    private Integer quantidade;

    @Column(name = "preco_unitario_refeicao", precision = 10, scale = 2, nullable = false)
    private BigDecimal precoUnitarioRefeicao;

    @Column(name = "status_pedido_produto", nullable = false)
    private boolean status;

    //  Código Gerado
    public PedidoRefeicaoPK getPedidoRefeicaoPK() {
        return pedidoRefeicaoPK;
    }

    public void setPedidoRefeicaoPK(PedidoRefeicaoPK pedidoRefeicaoPK) {
        this.pedidoRefeicaoPK = pedidoRefeicaoPK;
    }

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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public PedidoRefeicao(Pedido pedido, Refeicao refeicao, Integer quantidade, BigDecimal precoUnitarioRefeicao) {
        this.pedido = pedido;
        this.refeicao = refeicao;
        this.quantidade = quantidade;
        this.precoUnitarioRefeicao = precoUnitarioRefeicao;
        this.status = true;
    }

    public PedidoRefeicao() {
    }
}
