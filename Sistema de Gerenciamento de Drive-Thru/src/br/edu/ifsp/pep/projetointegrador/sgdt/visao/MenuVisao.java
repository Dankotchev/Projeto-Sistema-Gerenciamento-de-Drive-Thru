package br.edu.ifsp.pep.projetointegrador.sgdt.visao;

import br.edu.ifsp.pep.projetointegrador.sgdt.controledao.CaixaDAO;
import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.Caixa;
import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.Funcionario;
import br.edu.ifsp.pep.projetointegrador.utilitarios.Mensagem;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;

public class MenuVisao extends javax.swing.JFrame {

    private Caixa caixa;
    private CaixaDAO caixaDAO = new CaixaDAO();
    private Funcionario funcionario;
    private boolean statusCaixa;
    private final Date dataAtual = new Date();
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd / MM / yyyy");

    public MenuVisao() {
        initComponents();
        this.statusCaixa = false;
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        painelFundo = new javax.swing.JPanel();
        painelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        painelInfoCaixaOperacao = new javax.swing.JPanel();
        labelFuncionario = new javax.swing.JLabel();
        labelNomeFuncionario = new javax.swing.JLabel();
        labelData = new javax.swing.JLabel();
        labelDataAtual = new javax.swing.JLabel();
        labelCargo = new javax.swing.JLabel();
        labelCargoFuncionario = new javax.swing.JLabel();
        labelCaixa = new javax.swing.JLabel();
        labelIdCaixa = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        painelBotoes = new javax.swing.JPanel();
        btnAbrirCaixa = new javax.swing.JButton();
        btnRealizarPedido = new javax.swing.JButton();
        btnFecharCaixa = new javax.swing.JButton();
        btnGerenciarRefeicoes = new javax.swing.JButton();
        btnGerenciarFuncionarios = new javax.swing.JButton();
        btnGerenciarProdutos = new javax.swing.JButton();
        btnGerarRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("menu"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 720));

        painelFundo.setBackground(new java.awt.Color(242, 183, 5));

        painelTitulo.setBackground(new java.awt.Color(242, 5, 5));

        labelTitulo.setFont(new java.awt.Font("Liberation Serif", 1, 48)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(242, 226, 5));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("MENU");
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

        labelFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelFuncionario.setText("Funcionário: ");

        labelNomeFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNomeFuncionario.setText("Giovana Perreira Dassie");

        labelData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelData.setText("Data: ");

        labelDataAtual.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDataAtual.setText("12/11/2022");

        labelCargo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCargo.setText("Cargo");

        labelCargoFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCargoFuncionario.setText("GERENTE");

        labelCaixa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCaixa.setText("Caixa: ");

        labelIdCaixa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelIdCaixa.setText("Caixa Fechado");

        javax.swing.GroupLayout painelInfoCaixaOperacaoLayout = new javax.swing.GroupLayout(painelInfoCaixaOperacao);
        painelInfoCaixaOperacao.setLayout(painelInfoCaixaOperacaoLayout);
        painelInfoCaixaOperacaoLayout.setHorizontalGroup(
            painelInfoCaixaOperacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInfoCaixaOperacaoLayout.createSequentialGroup()
                .addComponent(labelFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCargoFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelCaixa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelIdCaixa)
                .addGap(18, 18, 18)
                .addComponent(labelData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDataAtual)
                .addContainerGap())
        );
        painelInfoCaixaOperacaoLayout.setVerticalGroup(
            painelInfoCaixaOperacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInfoCaixaOperacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(labelIdCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(painelInfoCaixaOperacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(labelDataAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(painelInfoCaixaOperacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(labelCargoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(painelInfoCaixaOperacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(labelNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        painelBotoes.setBackground(new java.awt.Color(255, 202, 138));
        painelBotoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        java.awt.GridBagLayout painelBotoesLayout = new java.awt.GridBagLayout();
        painelBotoesLayout.columnWidths = new int[] {0, 10, 0, 10, 0};
        painelBotoesLayout.rowHeights = new int[] {0, 10, 0, 10, 0};
        painelBotoes.setLayout(painelBotoesLayout);

        btnAbrirCaixa.setBackground(new java.awt.Color(243, 192, 32));
        btnAbrirCaixa.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnAbrirCaixa.setForeground(new java.awt.Color(217, 28, 38));
        btnAbrirCaixa.setText("Abrir Caixa");
        btnAbrirCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirCaixaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.1;
        painelBotoes.add(btnAbrirCaixa, gridBagConstraints);

        btnRealizarPedido.setBackground(new java.awt.Color(243, 192, 32));
        btnRealizarPedido.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnRealizarPedido.setForeground(new java.awt.Color(217, 28, 38));
        btnRealizarPedido.setText("Realizar Pedido");
        btnRealizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPedidoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        painelBotoes.add(btnRealizarPedido, gridBagConstraints);

        btnFecharCaixa.setBackground(new java.awt.Color(243, 192, 32));
        btnFecharCaixa.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnFecharCaixa.setForeground(new java.awt.Color(217, 28, 38));
        btnFecharCaixa.setText("Fechar Caixa");
        btnFecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCaixaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        painelBotoes.add(btnFecharCaixa, gridBagConstraints);

        btnGerenciarRefeicoes.setBackground(new java.awt.Color(243, 192, 32));
        btnGerenciarRefeicoes.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnGerenciarRefeicoes.setForeground(new java.awt.Color(217, 28, 38));
        btnGerenciarRefeicoes.setText("Gerenciar Refeições");
        btnGerenciarRefeicoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenciarRefeicoesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.1;
        painelBotoes.add(btnGerenciarRefeicoes, gridBagConstraints);

        btnGerenciarFuncionarios.setBackground(new java.awt.Color(243, 192, 32));
        btnGerenciarFuncionarios.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnGerenciarFuncionarios.setForeground(new java.awt.Color(217, 28, 38));
        btnGerenciarFuncionarios.setText("Gerenciar Funcionários");
        btnGerenciarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenciarFuncionariosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        painelBotoes.add(btnGerenciarFuncionarios, gridBagConstraints);

        btnGerenciarProdutos.setBackground(new java.awt.Color(243, 192, 32));
        btnGerenciarProdutos.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnGerenciarProdutos.setForeground(new java.awt.Color(217, 28, 38));
        btnGerenciarProdutos.setText("Gerenciar Produtos");
        btnGerenciarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenciarProdutosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        painelBotoes.add(btnGerenciarProdutos, gridBagConstraints);

        btnGerarRelatorio.setBackground(new java.awt.Color(243, 192, 32));
        btnGerarRelatorio.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnGerarRelatorio.setForeground(new java.awt.Color(217, 28, 38));
        btnGerarRelatorio.setText("Gerar Relatório");
        btnGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelatorioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.1;
        painelBotoes.add(btnGerarRelatorio, gridBagConstraints);

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelInfoCaixaOperacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 1268, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelInfoCaixaOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirCaixaActionPerformed
        BigDecimal zero = new BigDecimal(0);

        if (this.caixa == null) {
            try {
                this.caixa = new Caixa(
                        this.dataAtual,
                        this.funcionario);
                this.caixaDAO.inserir(caixa);
                this.carregarPainelInformacoes();

            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println(ex.getMessage());
            }
        } else {
            Mensagem.mAviso("Caixa já aberto");
        }
    }//GEN-LAST:event_btnAbrirCaixaActionPerformed

    private void btnRealizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPedidoActionPerformed
        if (this.caixa == null) {
            if (Mensagem.mSimNao("Caixa Fechado.\nDeseja Abrir para continuar?")) {
                this.btnAbrirCaixaActionPerformed(evt);
                this.chamarRealizarPedido();
            }
        } else {
            this.chamarRealizarPedido();
        }
    }//GEN-LAST:event_btnRealizarPedidoActionPerformed

    private void btnFecharCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCaixaActionPerformed
        if (this.caixa != null) {
            this.caixa.setEstadoCaixa(Caixa.EstadoCaixa.FECHADO);
            this.caixaDAO.alterar(this.caixa);
            this.caixa = null;
            this.carregarPainelInformacoes();
            Mensagem.mInformacao("Caixa Fechado");
        } else {
            Mensagem.mAviso("Não há caixa aberto");
        }
    }//GEN-LAST:event_btnFecharCaixaActionPerformed

    private void btnGerenciarRefeicoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenciarRefeicoesActionPerformed
        RefeicaoVisao refeicaoVisao = new RefeicaoVisao();
        refeicaoVisao.setExtendedState(JFrame.MAXIMIZED_BOTH);
        refeicaoVisao.setVisible(true);
    }//GEN-LAST:event_btnGerenciarRefeicoesActionPerformed

    private void btnGerenciarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenciarFuncionariosActionPerformed
        FuncionarioVisao funcionarioVisao = new FuncionarioVisao();
        funcionarioVisao.setExtendedState(JFrame.MAXIMIZED_BOTH);
        funcionarioVisao.setVisible(true);
    }//GEN-LAST:event_btnGerenciarFuncionariosActionPerformed

    private void btnGerenciarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenciarProdutosActionPerformed
        ProdutoVisao produtoVisao = new ProdutoVisao();
        produtoVisao.setExtendedState(JFrame.MAXIMIZED_BOTH);
        produtoVisao.setVisible(true);
    }//GEN-LAST:event_btnGerenciarProdutosActionPerformed

    private void btnGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatorioActionPerformed
        RelatorioVisao relatorioVisao = new RelatorioVisao();
        relatorioVisao.setExtendedState(JFrame.MAXIMIZED_BOTH);
        relatorioVisao.setVisible(true);
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
            java.util.logging.Logger.getLogger(MenuVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuVisao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirCaixa;
    private javax.swing.JButton btnFecharCaixa;
    private javax.swing.JButton btnGerarRelatorio;
    private javax.swing.JButton btnGerenciarFuncionarios;
    private javax.swing.JButton btnGerenciarProdutos;
    private javax.swing.JButton btnGerenciarRefeicoes;
    private javax.swing.JButton btnRealizarPedido;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelCaixa;
    private javax.swing.JLabel labelCargo;
    private javax.swing.JLabel labelCargoFuncionario;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelDataAtual;
    private javax.swing.JLabel labelFuncionario;
    private javax.swing.JLabel labelIdCaixa;
    private javax.swing.JLabel labelNomeFuncionario;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JPanel painelInfoCaixaOperacao;
    private javax.swing.JPanel painelTitulo;
    // End of variables declaration//GEN-END:variables

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
        this.carregarPainelInformacoes();
        this.setVisibilidadeBotoes();
    }

    private void chamarRealizarPedido() {
        PedidoVisao pedidoVisao = new PedidoVisao();
        pedidoVisao.setExtendedState(JFrame.MAXIMIZED_BOTH);
        pedidoVisao.setInformacoes(this.funcionario, this.caixa);
        pedidoVisao.setVisible(true);
    }

    private void carregarPainelInformacoes() {
        if (this.caixa == null) {
            this.labelIdCaixa.setText("Caixa Fechado");
        } else {
            this.labelIdCaixa.setText(String.valueOf(this.caixa.getId()));
        }
        this.labelNomeFuncionario.setText(this.funcionario.getNome());
        this.labelCargoFuncionario.setText(this.funcionario.getCargo().toString());
        this.labelDataAtual.setText(this.sdf.format(dataAtual));
    }

    private void setVisibilidadeBotoes() {
        if (this.funcionario.getCargo().equals(Funcionario.Cargo.ATENDENTE)) {
            this.btnGerenciarRefeicoes.setVisible(false);
            this.btnGerenciarFuncionarios.setVisible(false);
            this.btnGerenciarProdutos.setVisible(false);
            this.btnGerarRelatorio.setVisible(false);
        }
    }
}
