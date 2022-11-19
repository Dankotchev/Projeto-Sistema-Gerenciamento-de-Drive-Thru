package br.edu.ifsp.pep.projetointegrador.sgdt.visao;

import br.edu.ifsp.pep.projetointegrador.sgdt.controledao.FuncionarioDAO;
import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.Funcionario;
import br.edu.ifsp.pep.projetointegrador.utilitarios.Mensagem;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class FuncionarioVisao extends javax.swing.JDialog {

    private List<Funcionario> listagemDeFuncionarios;
    private Funcionario funcionarioGlobal;
    private final FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    public FuncionarioVisao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setEstadoBotoes(true);
        this.setEstadoCamposTexto(true);
        this.setVisibilidadeCamposTextos(false);
        this.carregarComboBox();
        this.btnOK.setVisible(false);
    }

    private void atualizarTabela() {
        if (this.listagemDeFuncionarios.isEmpty()) {
            Mensagem.mAviso("Não há Funcionários Cadastrados");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tabelaFuncionario.getModel();
            modelo.setNumRows(0);

            for (Funcionario funcionario : this.listagemDeFuncionarios) {
                modelo.addRow(new Object[]{funcionario.getNome(), funcionario.getCpf(),
                    funcionario.getDataNascimento(),
                    funcionario.getCargo(), funcionario.getEstadoCivil()
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
        labelDataNascimento = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelaFuncionario = new javax.swing.JTable();
        labelCPF = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnPesquisar = new javax.swing.JButton();
        labelCargo = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        labelEstadoCivil = new javax.swing.JLabel();
        dateDataNascimento = new com.toedter.calendar.JDateChooser();
        cbCargo = new javax.swing.JComboBox<>();
        cbEstadoCivil = new javax.swing.JComboBox<>();
        txtCPFFormated = new javax.swing.JFormattedTextField();
        labelSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manter Refeição");
        setMinimumSize(new java.awt.Dimension(854, 480));

        painelFundo.setBackground(new java.awt.Color(255, 202, 138));

        painelBotoes.setBackground(new java.awt.Color(255, 202, 138));
        painelBotoes.setLayout(new java.awt.GridLayout(1, 0));

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
        labelTitulo.setText("FUNCIONÁRIOS");
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

        labelDataNascimento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDataNascimento.setText("Data de Nascimento");

        tabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Data de Nascimento", "Cargo", "Estado Civil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaFuncionario.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane6.setViewportView(tabelaFuncionario);

        labelCPF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCPF.setText("CPF");

        btnPesquisar.setBackground(new java.awt.Color(243, 192, 32));
        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(217, 28, 38));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        labelCargo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCargo.setText("Cargo");

        btnOK.setBackground(new java.awt.Color(243, 192, 32));
        btnOK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnOK.setForeground(new java.awt.Color(217, 28, 38));
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        labelEstadoCivil.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelEstadoCivil.setText("Estado Civíl");

        try {
            txtCPFFormated.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPFFormated.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCPFFormated.setFont(new java.awt.Font("DejaVu Sans", 0, 16)); // NOI18N

        labelSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelSenha.setText("Senha");

        txtSenha.setFont(new java.awt.Font("DejaVu Sans", 0, 16)); // NOI18N
        txtSenha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSenha.setText("senhaexemplo");

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
                                    .addComponent(labelCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(labelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelFundoLayout.createSequentialGroup()
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelFundoLayout.createSequentialGroup()
                                        .addComponent(txtCPFFormated, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(371, 371, 371))))
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelFundoLayout.createSequentialGroup()
                                        .addComponent(labelCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelFundoLayout.createSequentialGroup()
                                        .addComponent(labelEstadoCivil)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
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
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(dateDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPFFormated, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
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
        this.listagemDeFuncionarios = funcionarioDAO.buscarPorNome(this.txtNome.getText());
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
        if (this.tabelaFuncionario.getSelectedRow() >= 0) {
            this.setVisivelVisualizar(false);
            this.setCampos(this.listagemDeFuncionarios
                    .get(this.tabelaFuncionario.getSelectedRow()));
            this.setVisibilidadeCamposTextos(true);
            this.setEstadoCamposTexto(false);
            this.tabelaFuncionario.setEnabled(false);
        } else {
            Mensagem.mAviso("Nenhum Funcionário selecionada.\nSelecione um funcionário");
        }
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        this.limparCampos();
        this.setEstadoCamposTexto(true);
        this.setVisibilidadeCamposTextos(false);
        this.tabelaFuncionario.setEnabled(true);
        this.setVisivelVisualizar(true);
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (this.tabelaFuncionario.getSelectedRow() >= 0) {
            this.tabelaFuncionario.setEnabled(false);
            this.funcionarioGlobal = this.listagemDeFuncionarios
                    .get(this.tabelaFuncionario.getSelectedRow());
            this.setCampos(this.funcionarioGlobal);
            this.setVisibilidadeCamposTextos(true);
            this.setEstadoCamposTexto(true);
            this.setEstadoBotoes(false);
        } else {
            Mensagem.mAviso("Nenhum Funcionário selecionada.\nSelecione um funcionário");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (this.tabelaFuncionario.getSelectedRow() >= 0) {
            this.tabelaFuncionario.setEnabled(false);
            this.funcionarioGlobal = this.listagemDeFuncionarios
                    .get(this.tabelaFuncionario.getSelectedRow());
            this.setCampos(this.funcionarioGlobal);
            this.setVisibilidadeCamposTextos(true);
            this.setEstadoCamposTexto(false);
            this.setEstadoBotoes(false);
            this.btnGravar.setText("Excluir");
        } else {
            Mensagem.mAviso("Nenhuma Refeição selecionada.\nSelecione uma refeição");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        String mensagem = "Funcionário cadastrado";
        boolean tudoOK = true;
        String cpf = this.txtCPFFormated.getText();
        String nome = this.txtNome.getText();
        String senha = new String(this.txtSenha.getPassword());

        if (nome.isEmpty()) {
            Mensagem.mAtencao("Nome não informado");
            this.txtNome.requestFocus();
            tudoOK = false;
        }

        if (cpf.isEmpty()) {
            Mensagem.mAtencao("CPF não informado");
            this.txtCPFFormated.requestFocus();
            tudoOK = false;
        }

        if (senha.isEmpty() || senha.equals("senhaexemplo")) {
            Mensagem.mAtencao("Senha não informada");
            this.txtNome.requestFocus();
            tudoOK = false;
        }

        if (this.dateDataNascimento.getDate() == null) {
            Mensagem.mAtencao("Data de Nascimento não informado");
            this.dateDataNascimento.requestFocus();
            tudoOK = false;
        }

        if (this.cbCargo.getSelectedIndex() < 0) {
            Mensagem.mAtencao("Cargo não selecionado");
            this.cbCargo.requestFocus();
            tudoOK = false;
        }

        if (this.cbEstadoCivil.getSelectedIndex() < 0) {
            Mensagem.mAtencao("Estado Civíl não selecionado");
            this.cbEstadoCivil.requestFocus();
            tudoOK = false;
        }

        if (tudoOK) {
            // Propagar no Banco de Dados se não houver informações faltantes ou incorretas

            // Verifica se está realizando uma exclusão, comparando o texto do botão
            if (this.btnGravar.getText().equals("Excluir")) {
                mensagem = "Funcionário excluído";
                this.funcionarioGlobal.setStatus(false);
                try {
                    funcionarioDAO.alterar(this.funcionarioGlobal);
                    this.aposGravar(mensagem, evt);
                } catch (Exception e) {
                    Mensagem.mErro(e.getMessage());
                } finally {
                    this.funcionarioGlobal = null;
                }

                // Se o texto não foi alterado, é uma inserção ou alteração
            } else {
                // Realizando uma inserção
                if (this.funcionarioGlobal == null) {
                    this.funcionarioGlobal = new Funcionario(
                            cpf,
                            nome,
                            senha,
                            this.dateDataNascimento.getDate(),
                            (Funcionario.Cargo) this.cbCargo.getSelectedItem(),
                            (Funcionario.EstadoCivil) this.cbEstadoCivil.getSelectedItem()
                    );

                } else {
                    // Realizando uma alteração
                    this.funcionarioGlobal.setNome(nome);
                    this.funcionarioGlobal.setCpf(cpf);
                    this.funcionarioGlobal.setSenha(senha);
                    this.funcionarioGlobal.setDataNascimento(this.dateDataNascimento.getDate());
                    this.funcionarioGlobal.setCargo(
                            (Funcionario.Cargo) this.cbCargo.getSelectedItem());
                    this.funcionarioGlobal.setEstadoCivil(
                            (Funcionario.EstadoCivil) this.cbEstadoCivil.getSelectedItem());
                    mensagem = "Funcionário alterado";
                }

                // Propagando no banco a alteração ou inserção
                try {
                    funcionarioDAO.alterar(this.funcionarioGlobal);
                    this.aposGravar(mensagem, evt);
                } catch (Exception e) {
                    Mensagem.mErro(e.getMessage());
                } finally {
                    this.funcionarioGlobal = null;
                }
            }
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void aposGravar(String mensagem, java.awt.event.ActionEvent evt) {
        Mensagem.mCorreto(mensagem);
        this.btnCancelarActionPerformed(evt);
        this.btnPesquisarActionPerformed(evt);
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.tabelaFuncionario.setEnabled(true);
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
            java.util.logging.Logger.getLogger(FuncionarioVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FuncionarioVisao dialog = new FuncionarioVisao(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cbCargo;
    private javax.swing.JComboBox<String> cbEstadoCivil;
    private com.toedter.calendar.JDateChooser dateDataNascimento;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelCargo;
    private javax.swing.JLabel labelDataNascimento;
    private javax.swing.JLabel labelEstadoCivil;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JPanel painelTitulo;
    private javax.swing.JTable tabelaFuncionario;
    private javax.swing.JFormattedTextField txtCPFFormated;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    private void setEstadoBotoes(boolean estado) {
        boolean subEstado;
        if (this.tabelaFuncionario.getRowCount() > 0) {
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

    private void setEstadoCamposTexto(boolean estado) {
        this.txtNome.setEnabled(estado);
        this.txtCPFFormated.setEnabled(estado);
        this.dateDataNascimento.setEnabled(estado);
        this.cbCargo.setEnabled(estado);
        this.cbEstadoCivil.setEnabled(estado);
        this.cbEstadoCivil.setEnabled(estado);
    }

    private void setVisibilidadeCamposTextos(boolean estado) {
        this.txtCPFFormated.setVisible(estado);
        this.dateDataNascimento.setVisible(estado);
        this.cbCargo.setVisible(estado);
        this.cbEstadoCivil.setVisible(estado);
        this.labelCPF.setVisible(estado);
        this.labelDataNascimento.setVisible(estado);
        this.labelCargo.setVisible(estado);
        this.labelEstadoCivil.setVisible(estado);
    }

    private void limparCampos() {
        this.txtNome.setText("");
        this.txtCPFFormated.setText("");
        this.dateDataNascimento.cleanup();
        this.cbCargo.setSelectedIndex(-1);
        this.cbEstadoCivil.setSelectedIndex(-1);
    }

    private void setCampos(Funcionario entity) {
        this.txtNome.setText(entity.getNome());
        this.txtCPFFormated.setText(entity.getCpf());
        this.dateDataNascimento.setDate(entity.getDataNascimento());
        this.cbCargo.setSelectedItem(entity.getCargo());
        this.cbEstadoCivil.setSelectedItem(entity.getEstadoCivil());
    }

    private void setVisivelVisualizar(boolean estado) {
        this.btnPesquisar.setVisible(estado);
        this.btnOK.setVisible(!estado);
        this.btnInserir.setVisible(estado);
        this.btnVisualizar.setVisible(estado);
        this.btnAlterar.setVisible(estado);
        this.btnExcluir.setVisible(estado);
    }

    private void carregarComboBox() {
        DefaultComboBoxModel comboBox = (DefaultComboBoxModel) this.cbCargo.getModel();
        Funcionario.Cargo[] cargos = Funcionario.Cargo.values();
        for (Funcionario.Cargo cargo : cargos) {
            comboBox.addElement(cargo);
        }

        comboBox = (DefaultComboBoxModel) this.cbEstadoCivil.getModel();
        Funcionario.EstadoCivil[] estadosCivis = Funcionario.EstadoCivil.values();
        for (Funcionario.EstadoCivil estadoCivil : estadosCivis) {
            comboBox.addElement(estadoCivil);
        }
    }
}
