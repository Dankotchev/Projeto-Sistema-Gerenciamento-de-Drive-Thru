package br.edu.ifsp.pep.projetointegrador.sgdt.modelo;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
@NamedQueries(value = {
    @NamedQuery(name = "Produto.buscarTodos",
            query = "SELECT p FROM Produto p WHERE p.status = true"),
    @NamedQuery(name = "Produto.buscarPorNome",
            query = "SELECT p FROM Produto p WHERE p.nome LIKE :nome AND p.status = true")
})
public class Produto extends ItemPedido {

    // Código Gerado
    public Produto(String nome, BigDecimal precoUnitario, String descricao, Integer quantidade) {
        super(nome, precoUnitario, descricao, quantidade);
    }

    public Produto() {
    }
}
