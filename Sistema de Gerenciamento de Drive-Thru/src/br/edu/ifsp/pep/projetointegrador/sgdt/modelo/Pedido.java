package br.edu.ifsp.pep.projetointegrador.sgdt.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "pedido")
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "veiculo")
    @OneToOne
    private Veiculo veiculo;

    @Column(name = "data_pedido")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataPedido;

    @Column(name = "forma_pagamento")
    private FormaPagamento formaPagamento;

    @Column(name = "nome_cliente", length = 60)
    private String nomeCliente;

    @Column(name = "estado_atual")
    private EstadoPedido estadoPedido;

    @OneToOne
    @Column(name = "caixa_id")
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

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public EstadoPedido getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
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
}
