package br.edu.ifsp.pep.projetointegrador.sgdt;

import br.edu.ifsp.pep.projetointegrador.sgdt.controledao.VeiculoDAO;
import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.Veiculo;

public class PrincipalTestes {

    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo();
        VeiculoDAO veiculoDAO = new VeiculoDAO();
        veiculo.setPlaca("ABC1E23");

        try {
            veiculoDAO.inserir(veiculo);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
