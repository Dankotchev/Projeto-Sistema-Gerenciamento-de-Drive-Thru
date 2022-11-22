package br.edu.ifsp.pep.projetointegrador.sgdt.visao;

import br.edu.ifsp.pep.projetointegrador.sgdt.controledao.PedidoDAO;
import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.Pedido;
import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.PedidoProduto;
import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.PedidoRefeicao;
import br.edu.ifsp.pep.projetointegrador.utilitarios.Mensagem;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class EntregaPedidoVisao extends javax.swing.JFrame {

    private Pedido pedidoGlobal;
    private List<Pedido> listagemDePedidos;
    private final PedidoDAO pedidoDAO = new PedidoDAO();

    public EntregaPedidoVisao() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.atualizarListaPedidos();
        this.btnCancelar.setVisible(false);
        this.btnConfirmar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFundo = new javax.swing.JPanel();
        painelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPedido = new javax.swing.JTable();
        btnEntregarPedido = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaDetalhamento = new javax.swing.JTable();
        labelTabelaPedidos = new javax.swing.JLabel();
        labelTabelaDetalhamento = new javax.swing.JLabel();
        btnVisualizarPedido = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cozinha");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("cozinha"); // NOI18N

        painelFundo.setBackground(new java.awt.Color(255, 202, 138));

        painelTitulo.setBackground(new java.awt.Color(242, 5, 5));

        labelTitulo.setFont(new java.awt.Font("Liberation Serif", 1, 48)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(242, 226, 5));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("ENTREGA DE PEDIDOS");
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
            .addGroup(painelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabelaPedido.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tabelaPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº do Pedido", "Veiculo", "Satus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPedido.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tabelaPedido);
        if (tabelaPedido.getColumnModel().getColumnCount() > 0) {
            tabelaPedido.getColumnModel().getColumn(0).setResizable(false);
            tabelaPedido.getColumnModel().getColumn(1).setResizable(false);
            tabelaPedido.getColumnModel().getColumn(2).setResizable(false);
        }

        btnEntregarPedido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEntregarPedido.setForeground(new java.awt.Color(217, 28, 38));
        btnEntregarPedido.setText("Entregar Pedido");
        btnEntregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregarPedidoActionPerformed(evt);
            }
        });

        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(217, 28, 38));
        btnConfirmar.setText("Confimar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        tabelaDetalhamento.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tabelaDetalhamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quantidade", "Nome", "Detalhamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaDetalhamento.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tabelaDetalhamento);

        labelTabelaPedidos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTabelaPedidos.setText("Pedidos");

        labelTabelaDetalhamento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTabelaDetalhamento.setText("Detalhamento");

        btnVisualizarPedido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVisualizarPedido.setForeground(new java.awt.Color(217, 28, 38));
        btnVisualizarPedido.setText("Visualizar Pedido");
        btnVisualizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarPedidoActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(217, 28, 38));
        btnCancelar.setText("Cancelar Entrega");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTabelaPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEntregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisualizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(labelTabelaDetalhamento, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(labelTabelaPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTabelaDetalhamento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addContainerGap())
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addComponent(btnEntregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVisualizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregarPedidoActionPerformed
        Pedido.EstadoPedido finalizado = Pedido.EstadoPedido.FINALIZADO;

        if (this.tabelaPedido.getSelectedRow() >= 0) {
            this.pedidoGlobal = this.listagemDePedidos
                    .get(this.tabelaPedido
                            .getSelectedRow());

            if (this.pedidoGlobal.getEstadoPedido() == finalizado) {
                this.atualizarDetalhamento(this.pedidoGlobal);
                this.atualizarListaPedidos();
                this.btnConfirmar.setVisible(true);
                this.btnCancelar.setVisible(true);
            }
        } else {
            Mensagem.mAviso("Selecione um pedido");
        }
    }//GEN-LAST:event_btnEntregarPedidoActionPerformed

    private void btnVisualizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarPedidoActionPerformed
        if (this.tabelaPedido.getSelectedRow() >= 0) {
            Pedido pedido = this.listagemDePedidos
                    .get(this.tabelaPedido
                            .getSelectedRow());

            this.atualizarDetalhamento(pedido);
            this.atualizarListaPedidos();
        } else {
            Mensagem.mAviso("Selecione um pedido");
        }
    }//GEN-LAST:event_btnVisualizarPedidoActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        Pedido.EstadoPedido entregue = Pedido.EstadoPedido.ENTREGUE;

        if (this.pedidoGlobal != null) {

            this.pedidoGlobal.setEstadoPedido(entregue);
            this.pedidoDAO.alterar(this.pedidoGlobal);
            this.atualizarListaPedidos();
            this.btnCancelar.setVisible(false);
            this.btnConfirmar.setVisible(false);
            this.pedidoGlobal = null;
        } else {
            Mensagem.mAviso("Selecione um pedido");
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (this.pedidoGlobal != null) {
            this.atualizarListaPedidos();
            this.btnCancelar.setVisible(false);
            this.btnConfirmar.setVisible(false);
            this.pedidoGlobal = null;
        } else {
            Mensagem.mAviso("Selecione um pedido");
        }
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
            java.util.logging.Logger.getLogger(EntregaPedidoVisao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntregaPedidoVisao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntregaPedidoVisao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntregaPedidoVisao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntregaPedidoVisao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnEntregarPedido;
    private javax.swing.JButton btnVisualizarPedido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelTabelaDetalhamento;
    private javax.swing.JLabel labelTabelaPedidos;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JPanel painelTitulo;
    private javax.swing.JTable tabelaDetalhamento;
    private javax.swing.JTable tabelaPedido;
    // End of variables declaration//GEN-END:variables

    private void atualizarTabela() {
        if (!(this.listagemDePedidos.isEmpty())) {
            DefaultTableModel modelo = (DefaultTableModel) this.tabelaPedido.getModel();
            modelo.setNumRows(0);

            for (Pedido pedido : this.listagemDePedidos) {
                modelo.addRow(new Object[]{
                    pedido.getId(), pedido.getVeiculo(), pedido.getEstadoPedido()
                });
            }
        }
    }

    private void atualizarListaPedidos() {
        this.listagemDePedidos = this.pedidoDAO.buscarFinalizado();
        this.atualizarTabela();
    }

    private void atualizarDetalhamento(Pedido pedido) {
        DefaultTableModel modelo = (DefaultTableModel) this.tabelaDetalhamento.getModel();
        modelo.setNumRows(0);

        for (PedidoRefeicao pedidoRefeicao : pedido.getListaPedidoRefeicao()) {
            modelo.addRow(new Object[]{
                pedidoRefeicao.getQuantidade(),
                pedidoRefeicao.getRefeicao().getNome(),
                pedidoRefeicao.getRefeicao().getListaIngredientes()
            });
        }

        for (PedidoProduto pedidoProduto : pedido.getListaPedidoProdutos()) {
            modelo.addRow(new Object[]{
                pedidoProduto.getQuantidade(),
                pedidoProduto.getProduto().getNome(),
                pedidoProduto.getProduto().getDescricao()
            });
        }
        this.tabelaDetalhamento.setEnabled(false);
    }
}
