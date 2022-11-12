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
@Table(name = "pedido_produto")
public class PedidoProduto implements Serializable {

    @EmbeddedId
    PedidoProdutoPK pedidoProdutoPK;

    @ManyToOne
    @JoinColumn(name = "pedido_id", referencedColumnName = "id", nullable = false)
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "produto_id", referencedColumnName = "id", nullable = false)
    private Produto produto;

    @Column(name = "quantidade", nullable = false)
    private Integer quantidade;

    @Column(name = "preco_unitario_produto", precision = 10, scale = 2, nullable = false)
    private BigDecimal precoUnitarioProduto;

    @Column(name = "status_pedido_produto", nullable = false)
    private boolean status;

    //  Código Gerado
    public PedidoProdutoPK getPedidoProdutoPK() {
        return pedidoProdutoPK;
    }

    public void setPedidoProdutoPK(PedidoProdutoPK pedidoProdutoPK) {
        this.pedidoProdutoPK = pedidoProdutoPK;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPrecoUnitarioProduto() {
        return precoUnitarioProduto;
    }

    public void setPrecoUnitarioProduto(BigDecimal precoUnitarioProduto) {
        this.precoUnitarioProduto = precoUnitarioProduto;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public PedidoProduto(Pedido pedido, Produto produto, Integer quantidade, BigDecimal precoUnitarioProduto) {
        this.pedido = pedido;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitarioProduto = precoUnitarioProduto;
        this.status = true;
    }

    public PedidoProduto() {
    }
}
