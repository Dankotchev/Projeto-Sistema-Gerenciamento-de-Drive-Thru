package br.edu.ifsp.pep.projetointegrador.sgdt.modelo;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "refeicao")
@NamedQueries(value = {
    @NamedQuery(name = "Refeicao.buscarTodos",
            query = "SELECT r FROM Refeicao r WHERE r.status = true"),
    @NamedQuery(name = "Refeicao.buscarPorNome",
            query = "SELECT r FROM Refeicao r WHERE r.nome LIKE :nome AND r.status = true")
})
public class Refeicao extends ItemPedido {

    @Column(name = "lista_ingredientes", columnDefinition = "TEXT")
    private String listaIngredientes;

    //  Código Gerado
    public String getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(String listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    public Refeicao(String nome, BigDecimal precoUnitario, String descricao, String listaIngredientes, Integer quantidade) {
        super(nome, precoUnitario, descricao, quantidade);
        this.listaIngredientes = listaIngredientes;
    }

    public Refeicao() {
    }
}
