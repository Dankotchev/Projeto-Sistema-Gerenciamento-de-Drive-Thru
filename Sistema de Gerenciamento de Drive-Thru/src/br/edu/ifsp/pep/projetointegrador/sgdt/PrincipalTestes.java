package br.edu.ifsp.pep.projetointegrador.sgdt;

import br.edu.ifsp.pep.projetointegrador.sgdt.controledao.VeiculoDAO;
import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.Veiculo;
import br.edu.ifsp.pep.projetointegrador.utilitarios.Relatorio;

public class PrincipalTestes {

    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo();
        VeiculoDAO veiculoDAO = new VeiculoDAO();
        for (int i = 0; i < 10; i++) {
            veiculo.setPlaca("ABC1E2" + i);
            try {
                veiculoDAO.inserir(veiculo);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        // Testando se gera os relatórios
        String fileXML = "relatorio_veiculos.jrxml";
        Relatorio.gerarFromXML(fileXML, veiculoDAO.buscarTodos());
    }
}
