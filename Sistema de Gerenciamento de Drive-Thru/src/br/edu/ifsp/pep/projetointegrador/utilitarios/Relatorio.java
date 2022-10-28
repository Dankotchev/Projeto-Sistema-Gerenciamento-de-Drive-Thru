package br.edu.ifsp.pep.projetointegrador.utilitarios;

import java.io.InputStream;
import java.util.List;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Relatorio {

    public static void gerarFromXML(String fileXML, List lista) {
        try {
            // Gera um data source a partir da lista
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(lista);

            // Carrega o relatório
            InputStream relatorioCompilado = Relatorio.class
                    .getResourceAsStream("/br/edu/ifsp/pep/projetointegrador/relatorio/" + fileXML);

            // Complilando o relatório
            JasperReport jasperReport = JasperCompileManager
                    .compileReport(JRXmlLoader.load(relatorioCompilado));

            // Preenche o relátorio com os dados
            JasperPrint jp = JasperFillManager.fillReport(jasperReport, null, dataSource);

            // Exibe o relatório
            JasperViewer visualizador = new JasperViewer(jp, true);
            visualizador.setVisible(true);
        } catch (JRException ex) {
            Mensagem.mErro(ex.getMessage());
        }
    }
}
