package br.edu.ifsp.pep.projetointegrador.sgdt.controledao;

import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.Veiculo;
import java.util.List;

public class VeiculoDAO extends AbstractDAO<Veiculo> {

    public List<Veiculo> buscarTodos() {
        return getEntityManager()
                .createNamedQuery("Veiculo.buscarTodos", Veiculo.class)
                .getResultList();
    }
    
    public Veiculo buscarPorPlaca(String placa){
        return getEntityManager()
                .createNamedQuery("Veiculo.buscarPorPlaca", Veiculo.class)
                .setParameter("placa", placa)
                .getSingleResult();
    }
}
