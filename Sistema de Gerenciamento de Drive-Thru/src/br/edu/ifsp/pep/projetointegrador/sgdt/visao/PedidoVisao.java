package br.edu.ifsp.pep.projetointegrador.sgdt.visao;

import br.edu.ifsp.pep.projetointegrador.sgdt.controledao.PedidoDAO;
import br.edu.ifsp.pep.projetointegrador.sgdt.controledao.ProdutoDAO;
import br.edu.ifsp.pep.projetointegrador.sgdt.controledao.RefeicaoDAO;
import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.Pedido;
import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.Produto;
import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.Refeicao;
import br.edu.ifsp.pep.projetointegrador.utilitarios.Mensagem;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class PedidoVisao extends javax.swing.JDialog {

    private List<Produto> listagemDeProdutos;
    private List<Refeicao> listagemDeRefeicoes;
    private Pedido pedidoGlobal;
    private Produto produtoGlobal;
    private Refeicao refeicaoGlobal;
    private final ProdutoDAO produtoDAO = new ProdutoDAO();
    private final RefeicaoDAO refeicaoDAO = new RefeicaoDAO();
    private final PedidoDAO pedidoDAO = new PedidoDAO();

    public PedidoVisao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.carregarComboBox();
        this.carregarTabelas();

    }

    private void atualizarTabelaResumo() {
        if (this.listagemDeProdutos.isEmpty()) {
            Mensagem.mAviso("Não há Refeições cadastradas");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tabelaResumo.getModel();
            modelo.setNumRows(0);

            for (Produto produto : this.listagemDeProdutos) {
                modelo.addRow(new Object[]{
                    produto.getNomeProduto(), produto.getDescricaoProduto(),
                    produto.getQuantidadeProduto(), produto.getPrecoUnitarioProduto()
                });
            }
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
                    produto.getNomeProduto(), produto.getDescricaoProduto(), produto.getPrecoUnitarioProduto()
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
                    refeicao.getNomeRefeicao(), refeicao.getDescricaoRefeicao(), refeicao.getPrecoUnitarioRefeicao()
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
        labelProduto = new javax.swing.JLabel();
        labelRefeicao = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Realizar Pedido");
        setMinimumSize(new java.awt.Dimension(854, 480));

        painelFundo.setBackground(new java.awt.Color(255, 202, 138));

        painelBotoes.setBackground(new java.awt.Color(255, 202, 138));
        painelBotoes.setLayout(new java.awt.GridLayout(1, 0));

        btnFinalizarPedido.setBackground(new java.awt.Color(243, 192, 32));
        btnFinalizarPedido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFinalizarPedido.setForeground(new java.awt.Color(217, 28, 38));
        btnFinalizarPedido.setText("Finalizar Pedido");
        btnFinalizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarPedidoActionPerformed(evt);
            }
        });
        painelBotoes.add(btnFinalizarPedido);

        btnExcluirItem.setBackground(new java.awt.Color(243, 192, 32));
        btnExcluirItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
        labelTitulo.setText("PEDIDO");
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

        tabelaResumo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantidade", "Valor Unitário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaResumo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane6.setViewportView(tabelaResumo);
        if (tabelaResumo.getColumnModel().getColumnCount() > 0) {
            tabelaResumo.getColumnModel().getColumn(0).setResizable(false);
            tabelaResumo.getColumnModel().getColumn(1).setResizable(false);
            tabelaResumo.getColumnModel().getColumn(2).setResizable(false);
        }

        labelFormaDePagamento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelFormaDePagamento.setText("Forma de Pagamento");

        btnPesquisarItem.setBackground(new java.awt.Color(243, 192, 32));
        btnPesquisarItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
                .addComponent(labelFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(labelNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(painelInfoCaixaOperacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIdCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelInfoCaixaOperacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelDataAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
        tabelaProduto.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane7.setViewportView(tabelaProduto);
        if (tabelaProduto.getColumnModel().getColumnCount() > 0) {
            tabelaProduto.getColumnModel().getColumn(0).setResizable(false);
            tabelaProduto.getColumnModel().getColumn(2).setResizable(false);
        }

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
        tabelaRefeicao.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane8.setViewportView(tabelaRefeicao);
        if (tabelaRefeicao.getColumnModel().getColumnCount() > 0) {
            tabelaRefeicao.getColumnModel().getColumn(1).setResizable(false);
        }

        labelProduto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelProduto.setText("Produto: ");

        labelRefeicao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelRefeicao.setText("Refeição:");

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
                        .addComponent(labelVeiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlacaFormated, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelTotalPedido)
                        .addGap(70, 70, 70)
                        .addComponent(labelVisualizarTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelFormaDePagamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addComponent(labelProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPesquisarProduto)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPesquisarItem)
                            .addComponent(spinnerAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                                .addComponent(labelRefeicao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPesquisarRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addComponent(jSeparator3)
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
                    .addComponent(labelTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelVisualizarTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFormaDePagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(txtPesquisarRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelFundoLayout.createSequentialGroup()
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(btnPesquisarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spinnerAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelFundoLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(labelProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelFundoLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(txtPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarItemActionPerformed
        if (!(this.txtPesquisarProduto.equals(""))) {
            this.listagemDeProdutos = produtoDAO.buscarPorNome(this.txtPesquisarProduto.getText());
            this.atualizarTabelaProduto();
        }
        if (!(this.txtPesquisarRefeicao.equals(""))) {
            this.listagemDeRefeicoes = refeicaoDAO.buscarPorNome(this.txtPesquisarRefeicao.getName());
            this.atualizarTabelaRefeicao();
        }

        this.txtPesquisarProduto.setText("");
        this.txtPesquisarRefeicao.setText("");
    }//GEN-LAST:event_btnPesquisarItemActionPerformed

    private void btnExcluirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirItemActionPerformed
        // Todo
    }//GEN-LAST:event_btnExcluirItemActionPerformed

    private void aposGravar(String mensagem, java.awt.event.ActionEvent evt) {
        Mensagem.mCorreto(mensagem);
//        this.btnCancelarActionPerformed(evt);
        this.carregarTabelas();
    }

    private void btnFinalizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarPedidoActionPerformed
        // Todo
        String mensagem = "Pedido realizado";
        this.aposGravar(mensagem, evt);
    }//GEN-LAST:event_btnFinalizarPedidoActionPerformed

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PedidoVisao dialog = new PedidoVisao(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnExcluirItem;
    private javax.swing.JButton btnFinalizarPedido;
    private javax.swing.JButton btnPesquisarItem;
    private javax.swing.JComboBox<String> cbFormaPagamento;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelAdicionar;
    private javax.swing.JLabel labelCaixa;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelDataAtual;
    private javax.swing.JLabel labelFormaDePagamento;
    private javax.swing.JLabel labelFuncionario;
    private javax.swing.JLabel labelIdCaixa;
    private javax.swing.JLabel labelNomeFuncionario;
    private javax.swing.JLabel labelProduto;
    private javax.swing.JLabel labelRefeicao;
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

    private void carregarComboBox() {
        DefaultComboBoxModel comboBox = (DefaultComboBoxModel) this.cbFormaPagamento.getModel();
        Pedido.FormaPagamento[] formasDePagamento = Pedido.FormaPagamento.values();
        for (Pedido.FormaPagamento forma : formasDePagamento) {
            comboBox.addElement(forma);
        }

    }

    private void carregarTabelas() {
        java.awt.event.ActionEvent evt = null;
        this.txtPesquisarProduto.setText(" ");
        this.txtPesquisarRefeicao.setText(" ");
        this.btnPesquisarItemActionPerformed(evt);
    }
}
