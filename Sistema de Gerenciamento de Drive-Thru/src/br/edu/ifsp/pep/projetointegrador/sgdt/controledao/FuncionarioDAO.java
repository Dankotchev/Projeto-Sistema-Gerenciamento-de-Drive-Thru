package br.edu.ifsp.pep.projetointegrador.sgdt.controledao;

import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.Funcionario;
import java.util.List;

public class FuncionarioDAO extends AbstractDAO<Funcionario> {

    public List<Funcionario> buscarPorNome(String nome) {
        return getEntityManager()
                .createNamedQuery("Funcionario.buscarPorNome", Funcionario.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();
    }

    public Funcionario buscarPorCPF(String cpf) {
        return getEntityManager()
                .createNamedQuery("Funcionario.buscarPorCPF", Funcionario.class)
                .setParameter("cpf", cpf)
                .getSingleResult();
    }
}
