package br.edu.ifsp.pep.projetointegrador.sgdt.visao;

import br.edu.ifsp.pep.projetointegrador.sgdt.controledao.FuncionarioDAO;
import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.Funcionario;
import br.edu.ifsp.pep.projetointegrador.utilitarios.Mensagem;
import java.sql.SQLIntegrityConstraintViolationException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class FuncionarioVisao extends javax.swing.JFrame {

    private List<Funcionario> listagemDeFuncionarios;
    private Funcionario funcionarioGlobal;
    private final FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd / MM / yyyy");

    public FuncionarioVisao() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setEstadoBotoes(true);
        this.setEstadoCamposTexto(true);
        this.setVisibilidadeCamposTextos(false);
        this.carregarComboBox();
        this.btnOK.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

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
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelaFuncionario = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        painelVizualizar = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        labelSenha = new javax.swing.JLabel();
        txtCPFFormated = new javax.swing.JFormattedTextField();
        labelCPF = new javax.swing.JLabel();
        labelDataNascimento = new javax.swing.JLabel();
        dateDataNascimento = new com.toedter.calendar.JDateChooser();
        cbEstadoCivil = new javax.swing.JComboBox<>();
        labelEstadoCivil = new javax.swing.JLabel();
        cbCargo = new javax.swing.JComboBox<>();
        labelCargo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manter Funcionários");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("funcionario"); // NOI18N

        painelFundo.setBackground(new java.awt.Color(255, 202, 138));

        painelBotoes.setBackground(new java.awt.Color(255, 202, 138));
        painelBotoes.setLayout(new java.awt.GridLayout(1, 0));

        btnInserir.setBackground(new java.awt.Color(243, 192, 32));
        btnInserir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInserir.setForeground(new java.awt.Color(217, 28, 38));
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        painelBotoes.add(btnInserir);

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
        tabelaFuncionario.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane6.setViewportView(tabelaFuncionario);

        painelVizualizar.setBackground(new java.awt.Color(255, 202, 138));
        painelVizualizar.setLayout(new java.awt.GridBagLayout());

        labelNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelNome.setText("Nome: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 145, 0, 0);
        painelVizualizar.add(labelNome, gridBagConstraints);

        txtNome.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 644;
        gridBagConstraints.ipady = 32;
        gridBagConstraints.insets = new java.awt.Insets(9, 6, 0, 0);
        painelVizualizar.add(txtNome, gridBagConstraints);

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
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 66;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        painelVizualizar.add(btnOK, gridBagConstraints);

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
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 145);
        painelVizualizar.add(btnPesquisar, gridBagConstraints);

        txtSenha.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        txtSenha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSenha.setText("senhaexemplo");
        txtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 137;
        gridBagConstraints.ipady = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 0, 0);
        painelVizualizar.add(txtSenha, gridBagConstraints);

        labelSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelSenha.setText("Senha: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 48;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 106, 0, 0);
        painelVizualizar.add(labelSenha, gridBagConstraints);

        try {
            txtCPFFormated.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPFFormated.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCPFFormated.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 134;
        gridBagConstraints.ipady = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 6, 0, 0);
        painelVizualizar.add(txtCPFFormated, gridBagConstraints);

        labelCPF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCPF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCPF.setText("CPF: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 44;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 145, 0, 0);
        painelVizualizar.add(labelCPF, gridBagConstraints);

        labelDataNascimento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDataNascimento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelDataNascimento.setText("Data de Nascimento: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 56;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 145, 0, 0);
        painelVizualizar.add(labelDataNascimento, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 193;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        painelVizualizar.add(dateDataNascimento, gridBagConstraints);

        cbEstadoCivil.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 155;
        gridBagConstraints.ipady = 34;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 6, 6, 0);
        painelVizualizar.add(cbEstadoCivil, gridBagConstraints);

        labelEstadoCivil.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelEstadoCivil.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelEstadoCivil.setText("Estado Civil:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        painelVizualizar.add(labelEstadoCivil, gridBagConstraints);

        cbCargo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 155;
        gridBagConstraints.ipady = 34;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 6, 6, 0);
        painelVizualizar.add(cbCargo, gridBagConstraints);

        labelCargo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCargo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCargo.setText("Cargo: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 145, 0, 0);
        painelVizualizar.add(labelCargo, gridBagConstraints);

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
                            .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 1268, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(painelVizualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelVizualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
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

//        if (tudoOK) {
//            Funcionario funcionarioVerificarDuplicidade = null;
//            try {
//                funcionarioVerificarDuplicidade = funcionarioDAO.buscarPorCPF(cpf);
//                if (funcionarioVerificarDuplicidade != null) {
//                    Mensagem.mAviso("Funcionário já cadastrado.\nVerifique as informações e tente novamente");
//                    tudoOK = false;
//                    this.txtCPFFormated.requestFocus();
//                }
//            } catch (Exception ex) {
//                System.out.println("Funcionário não existe no banco, tudo ok");
//            }
//        }

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
                } catch (SQLIntegrityConstraintViolationException icve){
                    Mensagem.mErro("Nome e/ou CPf já cadastrados.\nVerifique as informações e tente novamente");
                }
                catch (Exception e) {
                    Mensagem.mErro(e.getMessage());
                } finally {
                    this.funcionarioGlobal = null;
                }
            }
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.tabelaFuncionario.setEnabled(true);
        this.setEstadoBotoes(true);
        this.setEstadoCamposTexto(true);
        this.setVisibilidadeCamposTextos(false);
        this.limparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

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

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        this.limparCampos();
        this.setEstadoCamposTexto(true);
        this.setVisibilidadeCamposTextos(false);
        this.tabelaFuncionario.setEnabled(true);
        this.setVisivelVisualizar(true);
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        this.listagemDeFuncionarios = funcionarioDAO.buscarPorNome(this.txtNome.getText());
        this.atualizarTabela();
        this.setEstadoBotoes(true);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusGained
        this.txtSenha.setText("");
    }//GEN-LAST:event_txtSenhaFocusGained

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


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioVisao().setVisible(true);
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
    private javax.swing.JPanel painelVizualizar;
    private javax.swing.JTable tabelaFuncionario;
    private javax.swing.JFormattedTextField txtCPFFormated;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    private void atualizarTabela() {
        if (this.listagemDeFuncionarios.isEmpty()) {
            Mensagem.mAviso("Não há Funcionários Cadastrados");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tabelaFuncionario.getModel();
            modelo.setNumRows(0);

            for (Funcionario funcionario : this.listagemDeFuncionarios) {
                modelo.addRow(new Object[]{funcionario.getNome(), funcionario.getCpf(),
                    sdf.format(funcionario.getDataNascimento()),
                    funcionario.getCargo(), funcionario.getEstadoCivil()
                });
            }
        }
    }

    private void aposGravar(String mensagem, java.awt.event.ActionEvent evt) {
        Mensagem.mCorreto(mensagem);
        this.btnCancelarActionPerformed(evt);
        this.btnPesquisarActionPerformed(evt);
    }

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
        this.txtSenha.setEnabled(estado);
        this.dateDataNascimento.setEnabled(estado);
        this.cbCargo.setEnabled(estado);
        this.cbEstadoCivil.setEnabled(estado);
        this.cbEstadoCivil.setEnabled(estado);
    }

    private void setVisibilidadeCamposTextos(boolean estado) {
        this.txtCPFFormated.setVisible(estado);
        this.txtSenha.setVisible(estado);
        this.dateDataNascimento.setVisible(estado);
        this.cbCargo.setVisible(estado);
        this.cbEstadoCivil.setVisible(estado);
        this.labelCPF.setVisible(estado);
        this.labelSenha.setVisible(estado);
        this.labelDataNascimento.setVisible(estado);
        this.labelCargo.setVisible(estado);
        this.labelEstadoCivil.setVisible(estado);
    }

    private void limparCampos() {
        this.txtNome.setText("");
        this.txtCPFFormated.setText("");
        this.txtSenha.setText("senhaexemplo");
        this.dateDataNascimento.cleanup();
        this.cbCargo.setSelectedIndex(-1);
        this.cbEstadoCivil.setSelectedIndex(-1);
    }

    private void setCampos(Funcionario entity) {
        this.txtNome.setText(entity.getNome());
        this.txtCPFFormated.setText(entity.getCpf());
        this.txtSenha.setText(entity.getSenha());
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
