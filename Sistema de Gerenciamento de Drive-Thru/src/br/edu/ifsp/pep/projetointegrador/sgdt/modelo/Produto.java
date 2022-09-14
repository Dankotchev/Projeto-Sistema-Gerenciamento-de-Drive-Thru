package br.edu.ifsp.pep.projetointegrador.sgdt.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
@NamedQueries(value = {
    @NamedQuery(name = "Produto.buscarPorNome",
            query = "SELECT p FROM Produto p WHERE p.nomeProduto LIKE :nome AND p.status = true")       
})
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private Integer id;

    @Column(name = "nome_produto", length = 60)
    private String nomeProduto;

    @Column(name = "preco_unitario_produto", precision = 10, scale = 2)
    private BigDecimal precoUnitarioProduto;

    @Column(name = "descricao_produto", length = 100)
    private String descricaoProduto;

    @Column(name = "quantidade_produto")
    private Integer quantidadeProduto;

    @Column(name = "status_produto", nullable = false)
    private boolean status;

    //  Código Gerado
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public BigDecimal getPrecoUnitarioProduto() {
        return precoUnitarioProduto;
    }

    public void setPrecoUnitarioProduto(BigDecimal precoUnitarioProduto) {
        this.precoUnitarioProduto = precoUnitarioProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Integer getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(Integer quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Produto(String nomeProduto, BigDecimal precoUnitarioProduto, String descricaoProduto, Integer quantidadeProduto) {
        this.nomeProduto = nomeProduto;
        this.precoUnitarioProduto = precoUnitarioProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    public Produto() {
    }
}
