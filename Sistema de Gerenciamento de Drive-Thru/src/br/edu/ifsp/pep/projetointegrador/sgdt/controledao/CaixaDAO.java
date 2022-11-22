package br.edu.ifsp.pep.projetointegrador.sgdt.controledao;

import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.Caixa;
import java.util.Date;
import java.util.List;

public class CaixaDAO extends AbstractDAO<Caixa> {

    public List<Caixa> fluxoDeCaixa(Date dataInicial, Date dataFinal) {
        return getEntityManager()
                .createNamedQuery("Caixa.fluxoDeCaixa", Caixa.class)
                .setParameter("fechado", Caixa.EstadoCaixa.FECHADO)
                .setParameter("dataInicial", dataInicial)
                .setParameter("dataFinal", dataFinal)
                .getResultList();
    }
}
