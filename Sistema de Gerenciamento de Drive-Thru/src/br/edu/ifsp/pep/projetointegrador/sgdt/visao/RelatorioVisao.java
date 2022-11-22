package br.edu.ifsp.pep.projetointegrador.sgdt.visao;

import br.edu.ifsp.pep.projetointegrador.sgdt.controledao.CaixaDAO;
import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.Caixa;
import br.edu.ifsp.pep.projetointegrador.utilitarios.Mensagem;
import br.edu.ifsp.pep.projetointegrador.utilitarios.Relatorio;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class RelatorioVisao extends javax.swing.JFrame {

    public RelatorioVisao() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        painelGeral = new javax.swing.JPanel();
        labelRelatorio = new javax.swing.JLabel();
        cbTiposRelatorios = new javax.swing.JComboBox<>();
        labelPeriodo = new javax.swing.JLabel();
        labelDE = new javax.swing.JLabel();
        labelATE = new javax.swing.JLabel();
        btnGerarRelatorio = new javax.swing.JButton();
        dateDataInicial = new com.toedter.calendar.JDateChooser();
        dateDataFinal = new com.toedter.calendar.JDateChooser();
        painelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerar Relatórios");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("relatorio"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 720));

        painelGeral.setBackground(new java.awt.Color(255, 202, 138));
        painelGeral.setMinimumSize(new java.awt.Dimension(960, 540));
        painelGeral.setPreferredSize(new java.awt.Dimension(960, 540));
        painelGeral.setLayout(new java.awt.GridBagLayout());

        labelRelatorio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelRelatorio.setText("Relatório: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 38;
        gridBagConstraints.insets = new java.awt.Insets(12, 24, 0, 0);
        painelGeral.add(labelRelatorio, gridBagConstraints);

        cbTiposRelatorios.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbTiposRelatorios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fluxo de Caixa", "Relatório de Vendas", "Relátorio de Estoque" }));
        cbTiposRelatorios.setSelectedIndex(-1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 672;
        gridBagConstraints.ipady = 28;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 0, 0);
        painelGeral.add(cbTiposRelatorios, gridBagConstraints);

        labelPeriodo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelPeriodo.setText("Período:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipady = 38;
        gridBagConstraints.insets = new java.awt.Insets(42, 24, 0, 0);
        painelGeral.add(labelPeriodo, gridBagConstraints);

        labelDE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDE.setText("De");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipady = 38;
        gridBagConstraints.insets = new java.awt.Insets(42, 12, 0, 0);
        painelGeral.add(labelDE, gridBagConstraints);

        labelATE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelATE.setText("até");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 38;
        gridBagConstraints.insets = new java.awt.Insets(42, 6, 0, 0);
        painelGeral.add(labelATE, gridBagConstraints);

        btnGerarRelatorio.setBackground(new java.awt.Color(242, 5, 5));
        btnGerarRelatorio.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnGerarRelatorio.setForeground(new java.awt.Color(242, 226, 5));
        btnGerarRelatorio.setText("Gerar");
        btnGerarRelatorio.setPreferredSize(new java.awt.Dimension(100, 42));
        btnGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelatorioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 220, 0);
        painelGeral.add(btnGerarRelatorio, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 143;
        gridBagConstraints.ipady = 32;
        gridBagConstraints.insets = new java.awt.Insets(42, 6, 0, 0);
        painelGeral.add(dateDataInicial, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 143;
        gridBagConstraints.ipady = 32;
        gridBagConstraints.insets = new java.awt.Insets(42, 6, 0, 0);
        painelGeral.add(dateDataFinal, gridBagConstraints);

        painelTitulo.setBackground(new java.awt.Color(242, 5, 5));

        labelTitulo.setFont(new java.awt.Font("Liberation Serif", 1, 48)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(242, 226, 5));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Gerar Relatório");
        labelTitulo.setToolTipText("");
        labelTitulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout painelTituloLayout = new javax.swing.GroupLayout(painelTitulo);
        painelTitulo.setLayout(painelTituloLayout);
        painelTituloLayout.setHorizontalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelTituloLayout.setVerticalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelGeral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
            .addComponent(painelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelGeral, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatorioActionPerformed
        String relatorio;
        boolean tudoOK = true;
        int selecao = this.cbTiposRelatorios.getSelectedIndex();
        Date dataInicial = this.dateDataInicial.getDate();
        Date dataFinal = this.dateDataFinal.getDate();
        HashMap<String, Object> parametros = null;

        if (selecao < 0) {
            Mensagem.mAtencao("Selecione um tipo de relatório a ser gerado");
            this.cbTiposRelatorios.requestFocus();
            tudoOK = false;
        }

        if (dataInicial == null) {
            Mensagem.mAtencao("Selecione uma data inicial");
            this.dateDataInicial.requestFocus();
            tudoOK = false;
        }

        if (dataFinal == null) {
            Mensagem.mAtencao("Selecione uma data final");
            this.dateDataFinal.requestFocus();
            tudoOK = false;
        }

        if (dataInicial.before(dataFinal)) {
            Mensagem.mAtencao("Data inicial posterior a data final da consulta");
            this.dateDataInicial.requestFocus();
            tudoOK = false;
        }

        if (tudoOK) {
            parametros.put("DataInicial", dataInicial);
            parametros.put("DataFinal", dataFinal);
            switch (selecao) {
                case 0:
                    CaixaDAO caixaDAO = new CaixaDAO();
                    relatorio = "FluxoDeCaixa.jasper";
                    List<Caixa> fluxoDeCaixa = caixaDAO.fluxoDeCaixa(dataInicial, dataFinal);
                    Relatorio.gerarFromJasper(relatorio, fluxoDeCaixa, parametros);
                    break;
                case 1:
                    relatorio = "RelatorioDeVendas.jrxml";
                    Mensagem.mInformacao("Relatório ainda não disponível");
                    break;
                case 2:
                    relatorio = "RelatorioDeEstoque.jrxml";
                    Mensagem.mInformacao("Relatório ainda não disponível");
                    break;
                default:
                    throw new AssertionError();
            }
        }

        this.cbTiposRelatorios.setSelectedIndex(-1);
        this.dateDataInicial.cleanup();
        this.dateDataFinal.cleanup();
    }//GEN-LAST:event_btnGerarRelatorioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RelatorioVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioVisao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerarRelatorio;
    private javax.swing.JComboBox<String> cbTiposRelatorios;
    private com.toedter.calendar.JDateChooser dateDataFinal;
    private com.toedter.calendar.JDateChooser dateDataInicial;
    private javax.swing.JLabel labelATE;
    private javax.swing.JLabel labelDE;
    private javax.swing.JLabel labelPeriodo;
    private javax.swing.JLabel labelRelatorio;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painelGeral;
    private javax.swing.JPanel painelTitulo;
    // End of variables declaration//GEN-END:variables
}
