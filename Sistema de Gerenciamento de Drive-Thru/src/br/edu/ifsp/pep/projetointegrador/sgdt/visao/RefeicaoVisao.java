package br.edu.ifsp.pep.projetointegrador.sgdt.visao;

import br.edu.ifsp.pep.projetointegrador.sgdt.controledao.RefeicaoDAO;
import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.Refeicao;
import br.edu.ifsp.pep.projetointegrador.utilitarios.Mensagem;
import br.edu.ifsp.pep.projetointegrador.utilitarios.UtilitariosDeTela;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class RefeicaoVisao extends javax.swing.JDialog implements UtilitariosDeTela<Refeicao> {

    private List<Refeicao> listagemDeRefeicoes;
    private Refeicao refeicaoGlobal;
    private final RefeicaoDAO refeicaoDAO = new RefeicaoDAO();

    public RefeicaoVisao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setEstadoBotoes(true);
        this.setEstadoCamposTexto(true);
        this.setVisibilidadeCamposTextos(false);
        this.btnOK.setVisible(false);
    }

    private void atualizarTabela() {
        if (this.listagemDeRefeicoes.isEmpty()) {
            Mensagem.mAviso("Não há Refeições cadastradas");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tabelaRefeicao.getModel();
            modelo.setNumRows(0);

            for (Refeicao refeicao : this.listagemDeRefeicoes) {
                modelo.addRow(new Object[]{refeicao.getNomeRefeicao(), refeicao.getPrecoUnitarioRefeicao(),
                    refeicao.getDescricaoRefeicao(), refeicao.getListaIngredientes()
                });
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFundo = new javax.swing.JPanel();
        painelBotoes = new javax.swing.JPanel();
        btnInserir = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        painelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        labelIngredientes = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelaRefeicao = new javax.swing.JTable();
        labelDescricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtIngrediente = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        labelPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manter Refeição");
        setMinimumSize(new java.awt.Dimension(854, 480));
        setPreferredSize(new java.awt.Dimension(854, 480));

        painelFundo.setBackground(new java.awt.Color(255, 202, 138));

        painelBotoes.setBackground(new java.awt.Color(255, 202, 138));
        painelBotoes.setLayout(new java.awt.GridLayout());

        btnInserir.setBackground(new java.awt.Color(243, 192, 32));
        btnInserir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInserir.setForeground(new java.awt.Color(217, 28, 38));
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        painelBotoes.add(btnInserir);

        btnVisualizar.setBackground(new java.awt.Color(243, 192, 32));
        btnVisualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVisualizar.setForeground(new java.awt.Color(217, 28, 38));
        btnVisualizar.setText("Visualizar");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });
        painelBotoes.add(btnVisualizar);

        btnGravar.setBackground(new java.awt.Color(243, 192, 32));
        btnGravar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGravar.setForeground(new java.awt.Color(217, 28, 38));
        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });
        painelBotoes.add(btnGravar);

        btnCancelar.setBackground(new java.awt.Color(243, 192, 32));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(217, 28, 38));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        painelBotoes.add(btnCancelar);

        btnAlterar.setBackground(new java.awt.Color(243, 192, 32));
        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(217, 28, 38));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        painelBotoes.add(btnAlterar);

        btnExcluir.setBackground(new java.awt.Color(243, 192, 32));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(217, 28, 38));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        painelBotoes.add(btnExcluir);

        painelTitulo.setBackground(new java.awt.Color(243, 192, 32));

        labelTitulo.setFont(new java.awt.Font("Liberation Serif", 1, 48)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(217, 28, 38));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("REFEIÇÃO");
        labelTitulo.setToolTipText("");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        labelNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNome.setText("Nome:");

        labelIngredientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelIngredientes.setText("Ingredientes");

        tabelaRefeicao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Preço Unit.", "Descriçao", "Lista de Ingredientes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tabelaRefeicao);

        labelDescricao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDescricao.setText("Descrição");

        btnPesquisar.setBackground(new java.awt.Color(243, 192, 32));
        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(217, 28, 38));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        labelPreco.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelPreco.setText("Preço:");

        btnOK.setBackground(new java.awt.Color(243, 192, 32));
        btnOK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnOK.setForeground(new java.awt.Color(217, 28, 38));
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6)
                            .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(labelNome, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addComponent(labelIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIngrediente)))))
                .addContainerGap())
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addComponent(labelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        this.listagemDeRefeicoes = refeicaoDAO.buscarPorNome(this.txtNome.getText());
        this.atualizarTabela();
        this.setEstadoBotoes(true);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        this.limparCampos();
        this.setVisibilidadeCamposTextos(true);
        this.txtNome.requestFocus();
        this.setEstadoBotoes(false);
        this.setEstadoCamposTexto(true);
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        if (this.tabelaRefeicao.getSelectedRow() >= 0) {
            this.setCampos(this.listagemDeRefeicoes
                    .get(this.tabelaRefeicao.getSelectedRow()));
            this.setVisibilidadeCamposTextos(true);
            this.setEstadoCamposTexto(false);
            this.btnOK.setVisible(true);
        } else {
            Mensagem.mAviso("Nenhuma Refeição selecionada.\nSelecione uma refeição");
        }
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        this.limparCampos();
        this.setEstadoCamposTexto(true);
        this.setVisibilidadeCamposTextos(false);
        this.btnOK.setVisible(false);
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (this.tabelaRefeicao.getSelectedRow() >= 0) {
            this.refeicaoGlobal = this.listagemDeRefeicoes
                    .get(this.tabelaRefeicao.getSelectedRow());
            this.setCampos(this.refeicaoGlobal);
            this.setVisibilidadeCamposTextos(true);
            this.setEstadoCamposTexto(true);
            this.setEstadoBotoes(false);
        } else {
            Mensagem.mAviso("Nenhuma Refeição selecionada.\nSelecione uma refeição");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (this.tabelaRefeicao.getSelectedRow() >= 0) {
            this.refeicaoGlobal = this.listagemDeRefeicoes
                    .get(this.tabelaRefeicao.getSelectedRow());
            this.setCampos(this.refeicaoGlobal);
            this.setVisibilidadeCamposTextos(true);
            this.setEstadoCamposTexto(false);
            this.setEstadoBotoes(false);
            this.btnGravar.setText("Excluir");
        } else {
            Mensagem.mAviso("Nenhuma Refeição selecionada.\nSelecione uma refeição");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setEstadoBotoes(true);
        this.setEstadoCamposTexto(true);
        this.setVisibilidadeCamposTextos(false);
        this.limparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(RefeicaoVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RefeicaoVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RefeicaoVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RefeicaoVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RefeicaoVisao dialog = new RefeicaoVisao(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelIngredientes;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JPanel painelTitulo;
    private javax.swing.JTable tabelaRefeicao;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtIngrediente;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setEstadoBotoes(boolean estado) {
        boolean subEstado;
        if (this.tabelaRefeicao.getRowCount() > 0) {
            subEstado = estado;
        } else {
            if (!estado) {
                subEstado = estado;
            } else {
                subEstado = !estado;
            }
        }
        this.btnPesquisar.setVisible(estado);
        this.btnInserir.setVisible(estado);
        this.btnVisualizar.setVisible(subEstado);
        this.btnAlterar.setVisible(subEstado);
        this.btnExcluir.setVisible(subEstado);
        this.btnGravar.setVisible(!estado);
        this.btnCancelar.setVisible(!estado);
    }

    @Override
    public void setEstadoCamposTexto(boolean estado) {
        this.txtNome.setEnabled(estado);
        this.txtDescricao.setEnabled(estado);
        this.txtIngrediente.setEnabled(estado);
        this.txtPreco.setEnabled(estado);
    }

    @Override
    public void setVisibilidadeCamposTextos(boolean estado) {
        this.txtDescricao.setVisible(estado);
        this.txtIngrediente.setVisible(estado);
        this.txtPreco.setVisible(estado);
        this.labelDescricao.setVisible(estado);
        this.labelIngredientes.setVisible(estado);
        this.labelPreco.setVisible(estado);
    }

    @Override
    public void limparCampos() {
        this.txtNome.setText("");
        this.txtDescricao.setText("");
        this.txtIngrediente.setText("");
        this.txtPreco.setText("");
    }

    @Override
    public void setCampos(Refeicao entity) {
        this.txtNome.setText(entity.getNomeRefeicao());
        this.txtDescricao.setText(entity.getDescricaoRefeicao());
        this.txtIngrediente.setText(entity.getListaIngredientes());
        this.txtPreco.setText(String.valueOf(entity.getPrecoUnitarioRefeicao()));
    }
}
