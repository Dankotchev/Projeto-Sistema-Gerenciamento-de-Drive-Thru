package br.edu.ifsp.pep.projetointegrador.sgdt.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "pedido")
@NamedQueries(value = {
    @NamedQuery(name = "Pedido.buscarTodos",
            query = "SELECT p FROM Pedido p WHERE p.status = true"),
    @NamedQuery(name = "Pedido.buscarPorEstado",
            query = "SELECT p FROM Pedido p WHERE p.estadoPedido = :estadoPedido "
                    + "AND p.status = true"),
    @NamedQuery(name = "Pedido.buscarEmFilaEmPreparo",
            query = "SELECT p FROM Pedido p WHERE p.estadoPedido = :emFila OR p.estadoPedido = :emPreparo "
                    + "AND p.status = true ORDER BY p.id ASC")
})
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Integer id;

    @JoinColumn(name = "veiculo")
    @OneToOne
    private Veiculo veiculo;

    @Column(name = "data_pedido")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataPedido;
    
    @Column(name = "total_pedido", precision = 10, scale = 2, nullable = false)
    BigDecimal totalPedido;

    @Column(name = "forma_pagamento")
    @Enumerated(EnumType.STRING)
    private FormaPagamento formaPagamento;

    @Column(name = "estado_atual")
    @Enumerated(EnumType.STRING)
    private EstadoPedido estadoPedido;

    @Column(name = "status_pedido", nullable = false)
    private boolean status;

    @OneToOne
    @JoinColumn(name = "caixa_id")
    private Caixa caixa;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private List<PedidoProduto> listaPedidoProdutos;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private List<PedidoRefeicao> listaPedidoRefeicao;

    public enum EstadoPedido {
        ABERTO, EM_FILA, EM_PREPARO, FINALIZADO, ENTREGUE
    }

    public enum FormaPagamento {
        DINHEIRO, CARTAO_CREDITO, CARTAO_DEBITO, PIX
    }

    // Código Gerado
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public BigDecimal getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(BigDecimal totalPedido) {
        this.totalPedido = totalPedido;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public EstadoPedido getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public List<PedidoProduto> getListaPedidoProdutos() {
        return listaPedidoProdutos;
    }

    public void setListaPedidoProdutos(List<PedidoProduto> listaPedidoProdutos) {
        this.listaPedidoProdutos = listaPedidoProdutos;
    }

    public List<PedidoRefeicao> getListaPedidoRefeicao() {
        return listaPedidoRefeicao;
    }

    public void setListaPedidoRefeicao(List<PedidoRefeicao> listaPedidoRefeicao) {
        this.listaPedidoRefeicao = listaPedidoRefeicao;
    }

    public Pedido(Veiculo veiculo, Date dataPedido, BigDecimal totalPedido, FormaPagamento formaPagamento, EstadoPedido estadoPedido, Caixa caixa, List<PedidoProduto> listaPedidoProdutos, List<PedidoRefeicao> listaPedidoRefeicao) {
        this.veiculo = veiculo;
        this.dataPedido = dataPedido;
        this.totalPedido = totalPedido;
        this.formaPagamento = formaPagamento;
        this.estadoPedido = estadoPedido;
        this.caixa = caixa;
        this.listaPedidoProdutos = listaPedidoProdutos;
        this.listaPedidoRefeicao = listaPedidoRefeicao;
        this.status = true;
    }

    public Pedido() {
    }
}
