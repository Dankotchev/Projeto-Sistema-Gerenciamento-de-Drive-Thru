package br.edu.ifsp.pep.projetointegrador.sgdt.visao;

import br.edu.ifsp.pep.projetointegrador.sgdt.controledao.FuncionarioDAO;
import br.edu.ifsp.pep.projetointegrador.sgdt.modelo.Funcionario;
import br.edu.ifsp.pep.projetointegrador.utilitarios.Mensagem;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.NoResultException;

public class LoginVisao extends javax.swing.JDialog {

    private final FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    public LoginVisao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
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
        painelLogin = new javax.swing.JPanel();
        painelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        txtCPFFormatted = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(500, 544));

        painelFundo.setBackground(new java.awt.Color(254, 164, 6));

        painelLogin.setBackground(new java.awt.Color(204, 204, 204));
        painelLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        painelTitulo.setBackground(new java.awt.Color(243, 192, 32));

        labelTitulo.setFont(new java.awt.Font("Liberation Serif", 1, 48)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(217, 28, 38));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("LOGIN");
        labelTitulo.setToolTipText("");

        javax.swing.GroupLayout painelTituloLayout = new javax.swing.GroupLayout(painelTitulo);
        painelTitulo.setLayout(painelTituloLayout);
        painelTituloLayout.setHorizontalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTituloLayout.createSequentialGroup()
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

        labelSenha.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        labelSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSenha.setText("Senha");

        labelUsuario.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        labelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUsuario.setText("Usuário - CPF");

        txtSenha.setText("senhaexemplo");
        txtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaFocusGained(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(243, 192, 32));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(217, 28, 38));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        try {
            txtCPFFormatted.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPFFormatted.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCPFFormatted.setFont(new java.awt.Font("DejaVu Sans", 0, 16)); // NOI18N

        javax.swing.GroupLayout painelLoginLayout = new javax.swing.GroupLayout(painelLogin);
        painelLogin.setLayout(painelLoginLayout);
        painelLoginLayout.setHorizontalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(labelSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                        .addComponent(labelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtCPFFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCPFFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void txtSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusGained
        this.txtSenha.setText("");
    }//GEN-LAST:event_txtSenhaFocusGained

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        boolean tudoOK = true;
        String cpf = this.txtCPFFormatted.getText();
        String senha = new String(this.txtSenha.getPassword());
        Funcionario.Cargo cozinha = Funcionario.Cargo.COZINHEIRO;

        System.out.println(cpf);
        System.out.println(senha);

        if (cpf.isEmpty()) {
            Mensagem.mAtencao("Usuário não informado");
            this.txtCPFFormatted.requestFocus();
            tudoOK = false;
        }

        if (senha.isEmpty() || senha.equals("senhaexemplo")) {
            Mensagem.mAtencao("Senha não informada");
            this.txtSenha.requestFocus();
            tudoOK = false;
        }

        if (tudoOK) {
            Funcionario funcionario = null;
            try {
                funcionario = funcionarioDAO.buscarPorCPF(cpf);
                
                if (funcionario.getSenha().equals(senha)) {
                    Mensagem.mCorreto("Bem vindo " + funcionario.getNome());
                    System.out.println(funcionario.getCargo());

                    if (funcionario.getCargo() != cozinha) {
                        MenuVisao menuVisao = new MenuVisao(null, false);
                        menuVisao.setModal(true);
                        menuVisao.setFuncionario(funcionario);
                        menuVisao.setVisible(true);
                        this.dispose();
                    } else {
                        CozinhaVisao cozinhaVisao = new CozinhaVisao(null, false);
                        cozinhaVisao.setVisible(true);
                        this.dispose();
                    }
                } else {
                    Mensagem.mErro("Senha incorreta");
                }
            } catch (NoResultException nre) {
                Mensagem.mAviso("Usuário não cadastrado ou incorreto");
            } catch (Exception ex) {
                Mensagem.mAviso(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(LoginVisao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginVisao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginVisao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginVisao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginVisao dialog = new LoginVisao(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JPanel painelTitulo;
    private javax.swing.JFormattedTextField txtCPFFormatted;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
