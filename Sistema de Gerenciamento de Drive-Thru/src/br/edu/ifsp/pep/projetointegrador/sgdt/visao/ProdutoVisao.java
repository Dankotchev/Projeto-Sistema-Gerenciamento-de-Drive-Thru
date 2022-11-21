package br.edu.ifsp.pep.projetointegrador.sgdt.visao;

import br.edu.ifsp.pep.projetointegrador.sgdt.controledao.ProdutoDAO;
import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.Produto;
import br.edu.ifsp.pep.projetointegrador.utilitarios.Mensagem;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ProdutoVisao extends javax.swing.JFrame {

    private List<Produto> listagemDeProdutos;
    private Produto produtoGlobal;
    private final ProdutoDAO produtoDAO = new ProdutoDAO();
    private final NumberFormat nf = NumberFormat.getCurrencyInstance();

    public ProdutoVisao() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setEstadoBotoes(true);
        this.setEstadoCamposTexto(true);
        this.setVisibilidadeCamposTextos(false);
        this.btnOK.setVisible(false);
        this.labelAdicionar.setVisible(false);
        this.spinnerAdicionar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        painelFundo = new javax.swing.JPanel();
        painelBotoes = new javax.swing.JPanel();
        btnComprar = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        painelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        painelVisualizar = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        txtDescricao = new javax.swing.JTextField();
        labelDescricao = new javax.swing.JLabel();
        labelQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        labelAdicionar = new javax.swing.JLabel();
        spinnerAdicionar = new javax.swing.JSpinner();
        txtPreco = new javax.swing.JTextField();
        labelPreco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manter Produto");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("produto"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 720));

        painelFundo.setBackground(new java.awt.Color(255, 202, 138));

        painelBotoes.setBackground(new java.awt.Color(255, 202, 138));
        painelBotoes.setLayout(new java.awt.GridLayout(1, 0));

        btnComprar.setBackground(new java.awt.Color(243, 192, 32));
        btnComprar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnComprar.setForeground(new java.awt.Color(217, 28, 38));
        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        painelBotoes.add(btnComprar);

        btnVisualizar.setBackground(new java.awt.Color(243, 192, 32));
        btnVisualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVisualizar.setForeground(new java.awt.Color(217, 28, 38));
        btnVisualizar.setText("Visualizar");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });
        painelBotoes.add(btnVisualizar);

        btnGravar.setBackground(new java.awt.Color(243, 192, 32));
        btnGravar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGravar.setForeground(new java.awt.Color(217, 28, 38));
        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });
        painelBotoes.add(btnGravar);

        btnCancelar.setBackground(new java.awt.Color(243, 192, 32));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(217, 28, 38));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        painelBotoes.add(btnCancelar);

        btnAlterar.setBackground(new java.awt.Color(243, 192, 32));
        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(217, 28, 38));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        painelBotoes.add(btnAlterar);

        btnExcluir.setBackground(new java.awt.Color(243, 192, 32));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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
        labelTitulo.setText("PRODUTO");
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

        tabelaProduto.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Descriçao", "Quantidade", "Preço Unit."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProduto.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane6.setViewportView(tabelaProduto);

        painelVisualizar.setBackground(new java.awt.Color(255, 202, 138));
        painelVisualizar.setLayout(new java.awt.GridBagLayout());

        labelNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelNome.setText("Nome: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 144;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        painelVisualizar.add(labelNome, gridBagConstraints);

        txtNome.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 352;
        gridBagConstraints.ipady = 32;
        gridBagConstraints.insets = new java.awt.Insets(7, 6, 0, 0);
        painelVisualizar.add(txtNome, gridBagConstraints);

        btnOK.setBackground(new java.awt.Color(243, 192, 32));
        btnOK.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnOK.setForeground(new java.awt.Color(217, 28, 38));
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 72;
        gridBagConstraints.ipady = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 9, 0, 0);
        painelVisualizar.add(btnOK, gridBagConstraints);

        btnPesquisar.setBackground(new java.awt.Color(243, 192, 32));
        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(217, 28, 38));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        painelVisualizar.add(btnPesquisar, gridBagConstraints);

        txtDescricao.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 352;
        gridBagConstraints.ipady = 32;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        painelVisualizar.add(txtDescricao, gridBagConstraints);

        labelDescricao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDescricao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelDescricao.setText("Descrição: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 118;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        painelVisualizar.add(labelDescricao, gridBagConstraints);

        labelQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelQuantidade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelQuantidade.setText("Quantidade: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        painelVisualizar.add(labelQuantidade, gridBagConstraints);

        txtQuantidade.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 137;
        gridBagConstraints.ipady = 32;
        gridBagConstraints.insets = new java.awt.Insets(9, 6, 0, 0);
        painelVisualizar.add(txtQuantidade, gridBagConstraints);

        labelAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelAdicionar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelAdicionar.setText("Adicionar: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 118;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        painelVisualizar.add(labelAdicionar, gridBagConstraints);

        spinnerAdicionar.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 107;
        gridBagConstraints.ipady = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 6, 0, 0);
        painelVisualizar.add(spinnerAdicionar, gridBagConstraints);

        txtPreco.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 352;
        gridBagConstraints.ipady = 32;
        gridBagConstraints.insets = new java.awt.Insets(9, 6, 6, 0);
        painelVisualizar.add(txtPreco, gridBagConstraints);

        labelPreco.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelPreco.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPreco.setText("Preço: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 147;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        painelVisualizar.add(labelPreco, gridBagConstraints);

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
                            .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(painelVisualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        boolean escolha = false;
        this.btnGravar.setText("Comprar");
        if (this.tabelaProduto.getSelectedRow() >= 0) {
            this.tabelaProduto.setEnabled(false);
            this.produtoGlobal = this.listagemDeProdutos
                    .get(this.tabelaProduto.getSelectedRow());
            this.setCampos(this.produtoGlobal);

            this.compraSetCampos();

            this.setEstadoCamposTexto(false);
            this.txtPreco.setEnabled(true);
        } else {
            escolha = Mensagem.mSimNao("Nenhum Produto selecionada.\nComprar um Produto Novo?");
            if (escolha) {
                this.compraSetCampos();
                this.produtoGlobal = null;

                this.limparCampos();
                this.setEstadoCamposTexto(true);
                this.txtQuantidade.setVisible(false);
                this.labelQuantidade.setVisible(false);
                this.txtNome.requestFocus();
            }
        }
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        if (this.tabelaProduto.getSelectedRow() >= 0) {
            this.setVisivelVisualizar(false);
            this.setCampos(this.listagemDeProdutos
                    .get(this.tabelaProduto.getSelectedRow()));
            this.setVisibilidadeCamposTextos(true);
            this.setEstadoCamposTexto(false);
            this.tabelaProduto.setEnabled(false);
        } else {
            Mensagem.mAviso("Nenhum Produto selecionada.\nSelecione um Produto");
        }
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        String mensagem = "Produto cadastrado";
        String textoBotao = this.btnGravar.getText();
        boolean tudoOK = true;
        BigDecimal precoNumerico = null;
        Integer quantidadeNumerico = null;
        Integer quantidadeComprada = (Integer) this.spinnerAdicionar.getValue();

        if (this.txtNome.getText().isEmpty()) {
            Mensagem.mAtencao("Nome não informado");
            this.txtNome.requestFocus();
            tudoOK = false;
        }

        if (this.txtDescricao.getText().isEmpty()) {
            Mensagem.mAtencao("Descrição não informado");
            this.txtDescricao.requestFocus();
            tudoOK = false;
        }

        if (this.txtQuantidade.getText().isEmpty() && this.txtQuantidade.isVisible()) {
            Mensagem.mAtencao("Quantidade não informado");
            this.txtQuantidade.requestFocus();
            tudoOK = false;
        }

        if (this.txtQuantidade.isVisible()) {
            try {
                quantidadeNumerico = Integer.valueOf(this.txtQuantidade.getText());
            } catch (NumberFormatException nfe) {
                Mensagem.mErro("Informe um valor numérico para o Quantidade");
                this.txtQuantidade.requestFocus();
                tudoOK = false;
            }
        }

        if ((quantidadeComprada == 0) && (textoBotao.equals("Comprar"))) {
            Mensagem.mAtencao("Quantidade Comprada não informado");
            this.spinnerAdicionar.requestFocus();
            tudoOK = false;
        }

        if (this.txtPreco.getText().isEmpty()) {
            Mensagem.mAtencao("Preço não informado");
            this.txtPreco.requestFocus();
            tudoOK = false;
        }

        try {
            precoNumerico = new BigDecimal(this.txtPreco.getText());
        } catch (NumberFormatException nfe) {
            Mensagem.mErro("Informe um valor numérico para o Preço");
            this.txtPreco.requestFocus();
            tudoOK = false;
        }

        if (tudoOK) {
            // Propagar no Banco de Dados se não houver informações faltantes ou incorretas
            // Verifica se está realizando uma exclusão, comparando o texto do botão
            switch (textoBotao) {
                case "Excluir":
                    mensagem = "Produto excluído";
                    this.produtoGlobal.setStatus(false);
                    this.consolidarGravacao(false, mensagem, evt);
                    break;
                case "Comprar":
                    // Produto Existente
                    if (this.produtoGlobal != null) {

                        this.produtoGlobal.setNome(this.txtNome.getText());
                        this.produtoGlobal.setPrecoUnitario(precoNumerico);
                        this.produtoGlobal.setDescricao(this.txtDescricao.getText());
                        this.produtoGlobal.setQuantidade(
                                this.produtoGlobal.getQuantidade()
                                + quantidadeNumerico);
                        mensagem = "Produto comprado";
                        this.consolidarGravacao(false, mensagem, evt);
                    } else {
                        // Produto novo
                        this.produtoGlobal = new Produto(
                                this.txtNome.getText(),
                                precoNumerico,
                                this.txtDescricao.getText(),
                                quantidadeComprada
                        );
                        mensagem = "Produto Novo adquirido";
                        this.consolidarGravacao(true, mensagem, evt);
                    }
                    break;
                case "Alterar":
                    // Alterando um produto
                    this.produtoGlobal.setNome(this.txtNome.getText());
                    this.produtoGlobal.setPrecoUnitario(precoNumerico);
                    this.produtoGlobal.setDescricao(this.txtDescricao.getText());
                    this.produtoGlobal.setQuantidade(quantidadeNumerico);
                    mensagem = "Produto alterado";
                    this.consolidarGravacao(false, mensagem, evt);
                default:
                    break;
            }
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.tabelaProduto.setEnabled(true);
        this.setEstadoBotoes(true);
        this.setEstadoCamposTexto(true);
        this.setVisibilidadeCamposTextos(false);
        this.labelAdicionar.setVisible(false);
        this.spinnerAdicionar.setVisible(false);
        this.btnOK.setVisible(false);
        this.limparCampos();
        this.tabelaProduto.clearSelection();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (this.tabelaProduto.getSelectedRow() >= 0) {
            this.tabelaProduto.setEnabled(false);
            this.produtoGlobal = this.listagemDeProdutos
                    .get(this.tabelaProduto.getSelectedRow());
            this.setCampos(this.produtoGlobal);
            this.setVisibilidadeCamposTextos(true);
            this.setEstadoCamposTexto(true);
            this.setEstadoBotoes(false);
            this.txtQuantidade.setEnabled(false);
            this.btnGravar.setText("Alterar");
        } else {
            Mensagem.mAviso("Nenhum Produto selecionada.\nSelecione um Produto");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (this.tabelaProduto.getSelectedRow() >= 0) {
            this.tabelaProduto.setEnabled(false);
            this.produtoGlobal = this.listagemDeProdutos
                    .get(this.tabelaProduto.getSelectedRow());
            this.setCampos(this.produtoGlobal);
            this.setVisibilidadeCamposTextos(true);
            this.setEstadoCamposTexto(false);
            this.setEstadoBotoes(false);
            this.btnGravar.setText("Excluir");
        } else {
            Mensagem.mAviso("Nenhum Produto selecionada.\nSelecione um Produto");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        this.limparCampos();
        this.setEstadoCamposTexto(true);
        this.setVisibilidadeCamposTextos(false);
        this.tabelaProduto.setEnabled(true);
        this.tabelaProduto.clearSelection();
        this.setVisivelVisualizar(true);
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        this.listagemDeProdutos = produtoDAO.buscarPorNome(this.txtNome.getText());
        this.atualizarTabela();
        this.setEstadoBotoes(true);
    }//GEN-LAST:event_btnPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(ProdutoVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } //</editor-fold>    

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoVisao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelAdicionar;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JPanel painelTitulo;
    private javax.swing.JPanel painelVisualizar;
    private javax.swing.JSpinner spinnerAdicionar;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables

    private void setEstadoBotoes(boolean estado) {
        boolean subEstado;
        if (this.tabelaProduto.getRowCount() > 0) {
            subEstado = estado;
        } else {
            if (!estado) {
                subEstado = estado;
            } else {
                subEstado = !estado;
            }
        }
        this.btnPesquisar.setVisible(estado);
        this.btnComprar.setVisible(estado);
        this.btnVisualizar.setVisible(subEstado);
        this.btnAlterar.setVisible(subEstado);
        this.btnExcluir.setVisible(subEstado);
        this.btnGravar.setVisible(!estado);
        this.btnCancelar.setVisible(!estado);
    }

    private void setEstadoCamposTexto(boolean estado) {
        this.txtNome.setEnabled(estado);
        this.txtDescricao.setEnabled(estado);
        this.txtQuantidade.setEnabled(estado);
        this.txtPreco.setEnabled(estado);
    }

    private void setVisibilidadeCamposTextos(boolean estado) {
        this.txtDescricao.setVisible(estado);
        this.txtQuantidade.setVisible(estado);
        this.txtPreco.setVisible(estado);
        this.labelDescricao.setVisible(estado);
        this.labelQuantidade.setVisible(estado);
        this.labelPreco.setVisible(estado);
    }

    private void limparCampos() {
        this.txtNome.setText("");
        this.txtDescricao.setText("");
        this.txtQuantidade.setText("");
        this.txtPreco.setText("");
    }

    private void setCampos(Produto entity) {
        this.txtNome.setText(entity.getNome());
        this.txtDescricao.setText(entity.getDescricao());
        this.txtQuantidade.setText(String.valueOf(entity.getQuantidade()));
        this.txtPreco.setText(String.valueOf(entity.getPrecoUnitario()));
    }

    private void setVisivelVisualizar(boolean estado) {
        this.btnPesquisar.setVisible(estado);
        this.btnOK.setVisible(!estado);
        this.btnComprar.setVisible(estado);
        this.btnVisualizar.setVisible(estado);
        this.btnAlterar.setVisible(estado);
        this.btnExcluir.setVisible(estado);
    }

    private void atualizarTabela() {
        if (this.listagemDeProdutos.isEmpty()) {
            Mensagem.mAviso("Não há Refeições cadastradas");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tabelaProduto.getModel();
            modelo.setNumRows(0);

            for (Produto produto : this.listagemDeProdutos) {
                modelo.addRow(new Object[]{
                    produto.getNome(),
                    produto.getDescricao(),
                    produto.getQuantidade(),
                    nf.format(produto.getPrecoUnitario())
                });
            }
        }
    }

    private void compraSetCampos() {
        this.setEstadoBotoes(false);
        this.setVisibilidadeCamposTextos(true);
        this.labelAdicionar.setVisible(true);
        this.spinnerAdicionar.setVisible(true);
        this.tabelaProduto.setEnabled(false);
    }
    
    private void consolidarGravacao(boolean metodo, String mensagem, java.awt.event.ActionEvent evt) {
        try {
            if (metodo) {
                // Inserir no Banco
                produtoDAO.inserir(this.produtoGlobal);
            } else {
                // Alterar no
                produtoDAO.alterar(this.produtoGlobal);
            }
            this.aposGravar(mensagem, evt);

        } catch (Exception e) {
            Mensagem.mErro(e.getMessage());
        } finally {
            this.produtoGlobal = null;
        }
    }

    private void aposGravar(String mensagem, java.awt.event.ActionEvent evt) {
        Mensagem.mCorreto(mensagem);
        this.btnCancelarActionPerformed(evt);
        this.btnPesquisarActionPerformed(evt);
    }
}
