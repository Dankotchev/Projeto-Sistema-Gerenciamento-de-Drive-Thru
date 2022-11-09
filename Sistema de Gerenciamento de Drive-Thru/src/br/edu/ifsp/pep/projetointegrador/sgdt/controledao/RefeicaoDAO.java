package br.edu.ifsp.pep.projetointegrador.sgdt.controledao;

import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.Refeicao;
import java.util.List;

public class RefeicaoDAO extends AbstractDAO<Refeicao> {

    public List<Refeicao> buscarPorNome (String nome){
        return getEntityManager()
                .createNamedQuery("Refeicao.buscarPorNome", Refeicao.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();
    }
}
