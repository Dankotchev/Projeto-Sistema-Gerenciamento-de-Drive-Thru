package br.edu.ifsp.pep.projetointegrador.sgdt.controledao;

import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.Produto;
import java.util.List;

public class ProdutoDAO extends AbstractDAO<Produto> {

    public List<Produto> buscarTodos() {
        return getEntityManager()
                .createNamedQuery("Produto.buscarTodos", Produto.class)
                .getResultList();
    }

    public List<Produto> buscarPorNome(String nome) {
        return getEntityManager()
                .createNamedQuery("Produto.buscarPorNome", Produto.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();
    }
}
