package br.edu.ifsp.pep.projetointegrador.sgdt.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "refeicao")
public class Refeicao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "nome_refeicao", length = 60)
    private String nomeRefeicao;
    
    @Column(name = "preco_unitario_refeicao", precision = 10, scale = 2)
    private BigDecimal precoUnitarioRefeicao;
    
    @Column(name = "descricao_refeicao", length = 100)
    private String descricaoRefeicao;
    
    @Column(name = "lista_ingredientes", columnDefinition = "TEXT")
    private String listaIngredientes;
    
    //  Código Gerado
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeRefeicao() {
        return nomeRefeicao;
    }

    public void setNomeRefeicao(String nomeRefeicao) {
        this.nomeRefeicao = nomeRefeicao;
    }

    public BigDecimal getPrecoUnitarioRefeicao() {
        return precoUnitarioRefeicao;
    }

    public void setPrecoUnitarioRefeicao(BigDecimal precoUnitarioRefeicao) {
        this.precoUnitarioRefeicao = precoUnitarioRefeicao;
    }

    public String getDescricaoRefeicao() {
        return descricaoRefeicao;
    }

    public void setDescricaoRefeicao(String descricaoRefeicao) {
        this.descricaoRefeicao = descricaoRefeicao;
    }

    public String getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(String listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }
}
