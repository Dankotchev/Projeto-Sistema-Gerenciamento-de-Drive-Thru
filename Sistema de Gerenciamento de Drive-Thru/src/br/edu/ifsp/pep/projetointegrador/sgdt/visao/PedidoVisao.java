package br.edu.ifsp.pep.projetointegrador.sgdt.visao;

import br.edu.ifsp.pep.projetointegrador.sgdt.controledao.PedidoDAO;
import br.edu.ifsp.pep.projetointegrador.sgdt.controledao.ProdutoDAO;
import br.edu.ifsp.pep.projetointegrador.sgdt.controledao.RefeicaoDAO;
import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.Caixa;
import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.Funcionario;
import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.ItemPedido;
import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.Pedido;
import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.PedidoProduto;
import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.PedidoRefeicao;
import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.Produto;
import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.Refeicao;
import br.edu.ifsp.pep.projetointegrador.utilitarios.Mensagem;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class PedidoVisao extends javax.swing.JFrame {

    private List<Produto> listagemDeProdutos;
    private List<Refeicao> listagemDeRefeicoes;
    private List<ItemPedido> listagemItensPedido = new ArrayList<>();
    private Pedido pedidoGlobal;
    private Funcionario funcionario;
    private Caixa caixa;
    private BigDecimal valorTotalPedido;
    private final ProdutoDAO produtoDAO = new ProdutoDAO();
    private final RefeicaoDAO refeicaoDAO = new RefeicaoDAO();
    private final PedidoDAO pedidoDAO = new PedidoDAO();
    private final Date dataAtual = new Date();
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private final NumberFormat nf = NumberFormat.getCurrencyInstance();

    public PedidoVisao() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.carregarComboBox();
        this.carregarTabelas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFundo = new javax.swing.JPanel();
        painelBotoes = new javax.swing.JPanel();
        btnFinalizarPedido = new javax.swing.JButton();
        btnExcluirItem = new javax.swing.JButton();
        painelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelVeiculo = new javax.swing.JLabel();
        labelTotalPedido = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelaResumo = new javax.swing.JTable();
        labelFormaDePagamento = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnPesquisarItem = new javax.swing.JButton();
        labelAdicionar = new javax.swing.JLabel();
        spinnerAdicionar = new javax.swing.JSpinner();
        painelInfoCaixaOperacao = new javax.swing.JPanel();
        labelFuncionario = new javax.swing.JLabel();
        labelNomeFuncionario = new javax.swing.JLabel();
        labelCaixa = new javax.swing.JLabel();
        labelIdCaixa = new javax.swing.JLabel();
        labelData = new javax.swing.JLabel();
        labelDataAtual = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtPlacaFormated = new javax.swing.JFormattedTextField();
        labelVisualizarTotalPedido = new javax.swing.JLabel();
        cbFormaPagamento = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        txtPesquisarProduto = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabelaRefeicao = new javax.swing.JTable();
        txtPesquisarRefeicao = new javax.swing.JTextField();
        btnAdicionarItem = new javax.swing.JButton();

        setTitle("Realizar Pedido");
        setName("realizarpedido"); // NOI18N

        painelFundo.setBackground(new java.awt.Color(255, 202, 138));

        painelBotoes.setBackground(new java.awt.Color(255, 202, 138));
        painelBotoes.setLayout(new java.awt.GridLayout(1, 0));

        btnFinalizarPedido.setBackground(new java.awt.Color(243, 192, 32));
        btnFinalizarPedido.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        btnFinalizarPedido.setForeground(new java.awt.Color(217, 28, 38));
        btnFinalizarPedido.setText("Finalizar Pedido");
        btnFinalizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarPedidoActionPerformed(evt);
            }
        });
        painelBotoes.add(btnFinalizarPedido);

        btnExcluirItem.setBackground(new java.awt.Color(243, 192, 32));
        btnExcluirItem.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        btnExcluirItem.setForeground(new java.awt.Color(217, 28, 38));
        btnExcluirItem.setText("Excluir Item");
        btnExcluirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirItemActionPerformed(evt);
            }
        });
        painelBotoes.add(btnExcluirItem);

        painelTitulo.setBackground(new java.awt.Color(243, 192, 32));

        labelTitulo.setFont(new java.awt.Font("Liberation Serif", 1, 48)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(217, 28, 38));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("REALIZAR PEDIDO");
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

        labelVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelVeiculo.setText("Veículo");

        labelTotalPedido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTotalPedido.setText("Total do Pedido: ");

        tabelaResumo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tabelaResumo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantidade", "Valor Unit.", "SubTotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tabelaResumo);
        if (tabelaResumo.getColumnModel().getColumnCount() > 0) {
            tabelaResumo.getColumnModel().getColumn(0).setResizable(false);
            tabelaResumo.getColumnModel().getColumn(1).setResizable(false);
            tabelaResumo.getColumnModel().getColumn(3).setResizable(false);
        }

        labelFormaDePagamento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelFormaDePagamento.setText("Forma de Pagamento");

        btnPesquisarItem.setBackground(new java.awt.Color(243, 192, 32));
        btnPesquisarItem.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        btnPesquisarItem.setForeground(new java.awt.Color(217, 28, 38));
        btnPesquisarItem.setText("Pesquisar Item");
        btnPesquisarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarItemActionPerformed(evt);
            }
        });

        labelAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelAdicionar.setText("Adicionar");

        spinnerAdicionar.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        labelFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelFuncionario.setText("Funcionário: ");

        labelNomeFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNomeFuncionario.setText("Giovana Perreira Dassie");

        labelCaixa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCaixa.setText("Caixa: ");

        labelIdCaixa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelIdCaixa.setText("0001");

        labelData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelData.setText("Data: ");

        labelDataAtual.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDataAtual.setText("12/11/2022");

        javax.swing.GroupLayout painelInfoCaixaOperacaoLayout = new javax.swing.GroupLayout(painelInfoCaixaOperacao);
        painelInfoCaixaOperacao.setLayout(painelInfoCaixaOperacaoLayout);
        painelInfoCaixaOperacaoLayout.setHorizontalGroup(
            painelInfoCaixaOperacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInfoCaixaOperacaoLayout.createSequentialGroup()
                .addComponent(labelFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNomeFuncionario)
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
                .addComponent(labelData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(labelDataAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(painelInfoCaixaOperacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(labelIdCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(painelInfoCaixaOperacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(labelNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        try {
            txtPlacaFormated.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AAA-AAAA")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtPlacaFormated.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPlacaFormated.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N

        labelVisualizarTotalPedido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelVisualizarTotalPedido.setText("R$ 150,00");

        cbFormaPagamento.setFont(new java.awt.Font("DejaVu Sans", 0, 16)); // NOI18N

        tabelaProduto.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Descriçao", "Preço Unit."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProduto.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane7.setViewportView(tabelaProduto);

        txtPesquisarProduto.setText("PRODUTO");
        txtPesquisarProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPesquisarProdutoFocusGained(evt);
            }
        });

        tabelaRefeicao.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tabelaRefeicao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Descriçao", "Preço Unit."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaRefeicao.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane8.setViewportView(tabelaRefeicao);

        txtPesquisarRefeicao.setText("REFEIÇÃO");
        txtPesquisarRefeicao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPesquisarRefeicaoFocusGained(evt);
            }
        });

        btnAdicionarItem.setBackground(new java.awt.Color(243, 192, 32));
        btnAdicionarItem.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        btnAdicionarItem.setForeground(new java.awt.Color(217, 28, 38));
        btnAdicionarItem.setText("Adicionar Item");
        btnAdicionarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelInfoCaixaOperacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addComponent(labelVeiculo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPlacaFormated, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelTotalPedido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelVisualizarTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelFormaDePagamento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane7)
                                    .addComponent(txtPesquisarProduto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(painelFundoLayout.createSequentialGroup()
                                            .addComponent(labelAdicionar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spinnerAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                                            .addComponent(btnPesquisarItem)
                                            .addGap(53, 53, 53)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                                        .addComponent(btnAdicionarItem)
                                        .addGap(55, 55, 55)))
                                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane8)
                                    .addComponent(txtPesquisarRefeicao))))
                        .addContainerGap())))
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addComponent(jSeparator1)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlacaFormated, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(labelVisualizarTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFormaDePagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addComponent(txtPesquisarRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addComponent(txtPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addComponent(btnPesquisarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdicionarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarPedidoActionPerformed
        boolean tudoOK = true;
        Pedido pedido = new Pedido();

        String placa = this.txtPlacaFormated.getText().toUpperCase();
        Pedido.FormaPagamento formaPagamento = (Pedido.FormaPagamento) this.cbFormaPagamento.getSelectedItem();

        if (this.valorTotalPedido.equals(BigDecimal.ZERO)) {
            Mensagem.mAviso("Valor total do pedido Zerado");
            tudoOK = false;
        }

        if (placa.equals("   -    ")) {
            Mensagem.mAtencao("Placa não informado");
            this.txtPlacaFormated.requestFocus();
            tudoOK = false;
        }

        if (formaPagamento == null) {
            Mensagem.mAtencao("Informe uma Forma de Pagamento");
            this.cbFormaPagamento.requestFocus();
            tudoOK = false;
        }

        if (this.listagemDeProdutos.isEmpty() && this.listagemDeRefeicoes.isEmpty()) {
            Mensagem.mAtencao("Selecione itens para o pedido");
            tudoOK = false;
        }

        if (tudoOK) {
            PedidoProduto pedidoProduto = new PedidoProduto();
            PedidoRefeicao pedidoRefeicao = new PedidoRefeicao();
            List<PedidoProduto> listaPedidoProdutos = new ArrayList<>();
            List<PedidoRefeicao> listaPedidoRefeicao = new ArrayList<>();

            // Coloca dados Básicos do Pedido
            pedido.setStatus(true);
            pedido.setVeiculo(placa);
            pedido.setCaixa(caixa);
            pedido.setTotalPedido(this.valorTotalPedido);
            pedido.setFormaPagamento(formaPagamento);
            pedido.setEstadoPedido(Pedido.EstadoPedido.ABERTO);

            try {
                // Coloca o pedido no banco de Dados
                pedidoDAO.inserir(pedido);
                // Retorna o último pedido
                pedido = pedidoDAO.buscarUltimoPedido();
            } catch (Exception ex) {
                Mensagem.mErro(ex.getMessage());
            }

            // Colocado os Produtos e Refeições em suas próprias listas
            for (ItemPedido itemPedido : this.listagemItensPedido) {

                // Caso seja um Produto
                if (itemPedido instanceof Produto) {
                    pedidoProduto = new PedidoProduto(
                            pedido, (Produto) itemPedido, itemPedido.getQuantidade(), itemPedido.getPrecoUnitario());
                    pedidoProduto.setStatus(true);
                    listaPedidoProdutos.add(pedidoProduto);
                } // Caso seja uma Refeição
                else {
                    pedidoRefeicao = new PedidoRefeicao(
                            pedido, (Refeicao) itemPedido,
                            itemPedido.getQuantidade(), itemPedido.getPrecoUnitario());
                    pedidoRefeicao.setStatus(true);
                    listaPedidoRefeicao.add(pedidoRefeicao);
                }
            }

            // Atualiza algumas informações do pedido
            pedido.setListaPedidoProdutos(listaPedidoProdutos);
            pedido.setListaPedidoRefeicao(listaPedidoRefeicao);
            pedido.setEstadoPedido(Pedido.EstadoPedido.EM_FILA);

            try {
                // Consolida no banco o pedido finalizado;
                pedidoDAO.alterar(pedido);
            } catch (Exception ex) {
                Mensagem.mAviso("Ocorreu um erro durante a operação.\nContate o suporte");
            }
            String mensagem = "Pedido realizado";
            this.aposGravar(mensagem, evt);

        }

    }//GEN-LAST:event_btnFinalizarPedidoActionPerformed

    private void btnExcluirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirItemActionPerformed
        if (this.tabelaResumo.getSelectedRow() >= 0) {
            if (Mensagem.mConfimarCancelar("Confimar Operação?")) {
                this.listagemItensPedido.remove(
                        this.tabelaResumo.getSelectedRow());
            }
        }
        this.tabelaResumo.clearSelection();
        this.atualizarTabelaResumo();
    }//GEN-LAST:event_btnExcluirItemActionPerformed

    private void btnPesquisarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarItemActionPerformed
        if (!(this.txtPesquisarProduto.equals(""))) {
            this.listagemDeProdutos = produtoDAO.buscarPorNome(this.txtPesquisarProduto.getText());
            this.atualizarTabelaProduto();
        }
        if (!(this.txtPesquisarRefeicao.equals(""))) {
            this.listagemDeRefeicoes = refeicaoDAO.buscarPorNome(this.txtPesquisarRefeicao.getName());
            this.atualizarTabelaRefeicao();
        }

        this.txtPesquisarProduto.setText("PRODUTO");
        this.txtPesquisarRefeicao.setText("REFEIÇÃO");
    }//GEN-LAST:event_btnPesquisarItemActionPerformed

    private void txtPesquisarProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPesquisarProdutoFocusGained
        this.txtPesquisarProduto.setText("");
    }//GEN-LAST:event_txtPesquisarProdutoFocusGained

    private void txtPesquisarRefeicaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPesquisarRefeicaoFocusGained
        this.txtPesquisarRefeicao.setText("");
    }//GEN-LAST:event_txtPesquisarRefeicaoFocusGained

    private void btnAdicionarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarItemActionPerformed
        ItemPedido itemPedido = new ItemPedido();
        boolean tudoOK = true;
        int selecionadoProduto = this.tabelaProduto.getSelectedRow();
        int selecionadoRefeicao = this.tabelaRefeicao.getSelectedRow();
        int quantidade = (int) this.spinnerAdicionar.getValue();

        // Verifica se selecionou uma quantidade
        if (quantidade <= 0) {
            Mensagem.mErro("Informe um valor Positivo para Quantidade");
            this.spinnerAdicionar.requestFocus();
            tudoOK = false;
        }

        // Não selecionou nem um produto nem uma refeição
        if (selecionadoProduto < 0 && selecionadoRefeicao < 0) {
            Mensagem.mErro("Selecione UM Produto ou Refeição para adicionar");
            tudoOK = false;
        }

        // Se selecionado um Produto
        if (selecionadoProduto >= 0 && selecionadoRefeicao < 0) {
            itemPedido = this.listagemDeProdutos
                    .get(this.tabelaProduto.getSelectedRow());
            itemPedido.setQuantidade(quantidade);
        }

        // Se selecionado uma Refeição
        if (selecionadoRefeicao >= 0 && selecionadoProduto < 0) {
            itemPedido = this.listagemDeRefeicoes
                    .get(this.tabelaRefeicao.getSelectedRow());
            itemPedido.setQuantidade(quantidade);
        }

        if (tudoOK) {
            this.listagemItensPedido.add(itemPedido);
            this.atualizarTabelaResumo();
        }
        this.tabelaProduto.clearSelection();
        this.tabelaRefeicao.clearSelection();
    }//GEN-LAST:event_btnAdicionarItemActionPerformed

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
            java.util.logging.Logger.getLogger(PedidoVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidoVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidoVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidoVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidoVisao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarItem;
    private javax.swing.JButton btnExcluirItem;
    private javax.swing.JButton btnFinalizarPedido;
    private javax.swing.JButton btnPesquisarItem;
    private javax.swing.JComboBox<String> cbFormaPagamento;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelAdicionar;
    private javax.swing.JLabel labelCaixa;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelDataAtual;
    private javax.swing.JLabel labelFormaDePagamento;
    private javax.swing.JLabel labelFuncionario;
    private javax.swing.JLabel labelIdCaixa;
    private javax.swing.JLabel labelNomeFuncionario;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTotalPedido;
    private javax.swing.JLabel labelVeiculo;
    private javax.swing.JLabel labelVisualizarTotalPedido;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JPanel painelInfoCaixaOperacao;
    private javax.swing.JPanel painelTitulo;
    private javax.swing.JSpinner spinnerAdicionar;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JTable tabelaRefeicao;
    private javax.swing.JTable tabelaResumo;
    private javax.swing.JTextField txtPesquisarProduto;
    private javax.swing.JTextField txtPesquisarRefeicao;
    private javax.swing.JFormattedTextField txtPlacaFormated;
    // End of variables declaration//GEN-END:variables

    public void setInformacoes(Funcionario funcionario, Caixa caixa) {
        this.funcionario = funcionario;
        this.caixa = caixa;
        this.carregarPainelInformacoes();
    }

    private void carregarPainelInformacoes() {
        this.labelNomeFuncionario.setText(this.funcionario.getNome());
        this.labelVisualizarTotalPedido.setText("R$ 0,00");
        this.labelIdCaixa.setText(String.valueOf(this.caixa.getId()));
        this.labelDataAtual.setText(
                this.sdf.format(dataAtual));
    }

    private void atualizarTabelaResumo() {
        this.valorTotalPedido = BigDecimal.ZERO;
        BigDecimal subtotal;

        if (this.listagemItensPedido.isEmpty()) {
            Mensagem.mAviso("------");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tabelaResumo.getModel();
            modelo.setNumRows(0);

            for (ItemPedido itemPedido : this.listagemItensPedido) {
                subtotal = itemPedido.getPrecoUnitario()
                        .multiply(BigDecimal.valueOf(itemPedido.getQuantidade()));

                modelo.addRow(new Object[]{
                    itemPedido.getNome(),
                    itemPedido.getQuantidade(),
                    nf.format(itemPedido.getPrecoUnitario()),
                    nf.format(subtotal)

                });
                this.valorTotalPedido = this.valorTotalPedido.add(subtotal);
            }
            this.labelVisualizarTotalPedido.setText(
                    nf.format(valorTotalPedido));
        }
    }

    private void atualizarTabelaProduto() {
        if (this.listagemDeProdutos.isEmpty()) {
            Mensagem.mAviso("Não há Produtos cadastrados");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tabelaProduto.getModel();
            modelo.setNumRows(0);

            for (Produto produto : this.listagemDeProdutos) {
                modelo.addRow(new Object[]{
                    produto.getNome(),
                    produto.getDescricao(),
                    nf.format(produto.getPrecoUnitario())
                });
            }
        }
    }

    private void atualizarTabelaRefeicao() {
        if (this.listagemDeProdutos.isEmpty()) {
            Mensagem.mAviso("Não há Refeiçoes cadastradas");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tabelaRefeicao.getModel();
            modelo.setNumRows(0);

            for (Refeicao refeicao : this.listagemDeRefeicoes) {
                modelo.addRow(new Object[]{
                    refeicao.getNome(),
                    refeicao.getDescricao(),
                    nf.format(refeicao.getPrecoUnitario())
                });
            }
        }
    }

    private void carregarComboBox() {
        DefaultComboBoxModel comboBox = (DefaultComboBoxModel) this.cbFormaPagamento.getModel();
        Pedido.FormaPagamento[] formasDePagamento = Pedido.FormaPagamento.values();
        for (Pedido.FormaPagamento forma : formasDePagamento) {
            comboBox.addElement(forma);
        }
    }

    private void carregarTabelas() {
        this.listagemDeProdutos = this.produtoDAO.buscarTodos();
        this.listagemDeRefeicoes = this.refeicaoDAO.buscarTodos();
        this.atualizarTabelaProduto();
        this.atualizarTabelaRefeicao();
    }

    private void aposGravar(String mensagem, java.awt.event.ActionEvent evt) {
        Mensagem.mCorreto(mensagem);
        this.carregarPainelInformacoes();
        this.carregarTabelas();
        this.listagemItensPedido = null;
    }
}
