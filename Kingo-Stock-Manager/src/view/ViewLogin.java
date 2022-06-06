package view;

//@author LucasMarcuzo

import controller.ControllerUsuario;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.ModelUsuario;

public class ViewLogin extends javax.swing.JFrame implements IIconePadrao{
    
    ModelUsuario modelUsuario = new ModelUsuario();
    ControllerUsuario controllerUsuario = new ControllerUsuario();
    
    private String nomeUsuario = "";

    public ViewLogin() {
        initComponents();
        inserirIconePadrao(this);
        //jbEntrarLogin.setToolTipText("Mensagem qualquer");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jlTituloLogin = new javax.swing.JLabel();
        jlLogin = new javax.swing.JLabel();
        jlSenhaLogin = new javax.swing.JLabel();
        jtfLogin = new javax.swing.JTextField();
        jpfSenhaLogin = new javax.swing.JPasswordField();
        jbSairLogin = new javax.swing.JButton();
        jbEntrarLogin = new javax.swing.JButton();
        jlNovoCadastro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KINGO - Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jlTituloLogin.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jlTituloLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Zevko.jpg"))); // NOI18N

        jlLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlLogin.setText("Login:");

        jlSenhaLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlSenhaLogin.setText("Senha:");

        jtfLogin.setToolTipText("Digite o Login do Usuário.");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jpfSenhaLogin, org.jdesktop.beansbinding.ObjectProperty.create(), jtfLogin, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        jtfLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfLoginKeyPressed(evt);
            }
        });

        jpfSenhaLogin.setToolTipText("Digite a Senha do Usuário.");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jbEntrarLogin, org.jdesktop.beansbinding.ObjectProperty.create(), jpfSenhaLogin, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        jpfSenhaLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpfSenhaLoginKeyPressed(evt);
            }
        });

        jbSairLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbSairLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/sair-48.png"))); // NOI18N
        jbSairLogin.setText("Sair");
        jbSairLogin.setToolTipText("Clique para Sair");
        jbSairLogin.setAutoscrolls(true);
        jbSairLogin.setBorder(null);
        jbSairLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSairLogin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbSairLogin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbSairLogin.setIconTextGap(25);
        jbSairLogin.setPreferredSize(new java.awt.Dimension(155, 57));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jtfLogin, org.jdesktop.beansbinding.ObjectProperty.create(), jbSairLogin, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        jbSairLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairLoginActionPerformed(evt);
            }
        });

        jbEntrarLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbEntrarLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/entrar-48.png"))); // NOI18N
        jbEntrarLogin.setText("Entrar");
        jbEntrarLogin.setToolTipText("Clique para Entrar");
        jbEntrarLogin.setAutoscrolls(true);
        jbEntrarLogin.setBorder(null);
        jbEntrarLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEntrarLogin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbEntrarLogin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbEntrarLogin.setIconTextGap(20);
        jbEntrarLogin.setPreferredSize(new java.awt.Dimension(155, 57));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jbSairLogin, org.jdesktop.beansbinding.ObjectProperty.create(), jbEntrarLogin, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        jbEntrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntrarLoginActionPerformed(evt);
            }
        });
        jbEntrarLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbEntrarLoginKeyPressed(evt);
            }
        });

        jlNovoCadastro.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jlNovoCadastro.setForeground(new java.awt.Color(51, 51, 255));
        jlNovoCadastro.setText("<html><a href=''>Não tenho cadastro.</a></html>");
        jlNovoCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlNovoCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlNovoCadastroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTituloLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlNovoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlLogin)
                            .addComponent(jlSenhaLogin))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbSairLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbEntrarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jpfSenhaLogin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlTituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLogin)
                    .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpfSenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jlNovoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEntrarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSairLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Botão Entrar
    private void jbEntrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntrarLoginActionPerformed
       this.realizarLogin();
    }//GEN-LAST:event_jbEntrarLoginActionPerformed
    
    //Botão Sair.
    private void jbSairLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairLoginActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbSairLoginActionPerformed
    
    //Eventos Clique Enter para fazer Login.
    private void jtfLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfLoginKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) this.realizarLogin();
    }//GEN-LAST:event_jtfLoginKeyPressed

    private void jpfSenhaLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpfSenhaLoginKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER)  this.realizarLogin();
    }//GEN-LAST:event_jpfSenhaLoginKeyPressed

    private void jbEntrarLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbEntrarLoginKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) this.realizarLogin();
    }//GEN-LAST:event_jbEntrarLoginKeyPressed
    
    //Evento Clique em "não tenho cadastro".
    private void jlNovoCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlNovoCadastroMouseClicked
        JOptionPane.showMessageDialog(null, "Login Padrão: \n\nLOGIN: adm\nSENHA: adm", "Login Padrão", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jlNovoCadastroMouseClicked

    
    //Método para realização de Login
    private void realizarLogin(){
        modelUsuario.setUsuLogin(jtfLogin.getText());
        modelUsuario.setUsuSenha(String.valueOf(jpfSenhaLogin.getPassword()));
        
        if(controllerUsuario.validarUsuarioController(modelUsuario))
        {
            this.nomeUsuario = jtfLogin.getText();
            this.setVisible(false);
            new ViewPrincipal(nomeUsuario).setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Usuário e/ou Senha estão incorretos!");
        }
    }

    //Main
    public static void main(String args[]) throws ClassNotFoundException {
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
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbEntrarLogin;
    private javax.swing.JButton jbSairLogin;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlNovoCadastro;
    private javax.swing.JLabel jlSenhaLogin;
    private javax.swing.JLabel jlTituloLogin;
    private javax.swing.JPasswordField jpfSenhaLogin;
    private javax.swing.JTextField jtfLogin;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
