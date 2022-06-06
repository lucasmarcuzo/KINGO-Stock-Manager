package view;

//@author LucasMarcuzo

import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import util.Limpeza;
import util.OpcoesFormularios;

public class ViewPrincipal extends javax.swing.JFrame implements IIconePadrao{
    
    private static String nomeUsuario = "";

    public ViewPrincipal(String nomeUsuario) {
        initComponents();
        inserirIconePadrao(this);
        this.jlBemVindo.setText("\n" + nomeUsuario);
        this.nomeUsuario = nomeUsuario;
        if(nomeUsuario.equals("adm")) jmiLimparBDPrincipal.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jbUsuarioPrincipal = new javax.swing.JButton();
        jbProdutoPrincipal = new javax.swing.JButton();
        jbEstoquePrincipal = new javax.swing.JButton();
        jbSobrePrincipal = new javax.swing.JButton();
        jbSairPrincipal = new javax.swing.JButton();
        jlNomeUsuario = new javax.swing.JLabel();
        jlBemVindo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiUsuarioPrincipal = new javax.swing.JMenuItem();
        jmiProdutoPrincipal = new javax.swing.JMenuItem();
        jmiEstoquePrincipal = new javax.swing.JMenuItem();
        jmiLimparBDPrincipal = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiSairPrincipal = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("KINGO - Menu Principal");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jbUsuarioPrincipal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbUsuarioPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/usuarios-96.png"))); // NOI18N
        jbUsuarioPrincipal.setText("Usuário");
        jbUsuarioPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbUsuarioPrincipal.setPreferredSize(new java.awt.Dimension(189, 105));
        jbUsuarioPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUsuarioPrincipalActionPerformed(evt);
            }
        });
        jPanel2.add(jbUsuarioPrincipal);

        jbProdutoPrincipal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbProdutoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/produtos-96.png"))); // NOI18N
        jbProdutoPrincipal.setText("Produto");
        jbProdutoPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbProdutoPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProdutoPrincipalActionPerformed(evt);
            }
        });
        jPanel2.add(jbProdutoPrincipal);

        jbEstoquePrincipal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbEstoquePrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/armazem-96.png"))); // NOI18N
        jbEstoquePrincipal.setText("Estoque");
        jbEstoquePrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEstoquePrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEstoquePrincipalActionPerformed(evt);
            }
        });
        jPanel2.add(jbEstoquePrincipal);

        jbSobrePrincipal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbSobrePrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/sobre-96.png"))); // NOI18N
        jbSobrePrincipal.setText("Sobre");
        jbSobrePrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSobrePrincipal.setPreferredSize(new java.awt.Dimension(189, 105));
        jbSobrePrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSobrePrincipalActionPerformed(evt);
            }
        });
        jPanel2.add(jbSobrePrincipal);

        jbSairPrincipal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbSairPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/sair-96.png"))); // NOI18N
        jbSairPrincipal.setText("Sair");
        jbSairPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSairPrincipal.setPreferredSize(new java.awt.Dimension(189, 105));
        jbSairPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairPrincipalActionPerformed(evt);
            }
        });
        jPanel2.add(jbSairPrincipal);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 990, 120));

        jlNomeUsuario.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jlNomeUsuario.setText("Bem-Vindo:  ");
        getContentPane().add(jlNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 120, 20));

        jlBemVindo.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jlBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlBemVindo, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, 130, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Zevko.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setText("Menu");

        jmiUsuarioPrincipal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jmiUsuarioPrincipal.setText("Usuário");
        jmiUsuarioPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUsuarioPrincipalActionPerformed(evt);
            }
        });
        jMenu1.add(jmiUsuarioPrincipal);

        jmiProdutoPrincipal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jmiProdutoPrincipal.setText("Produto");
        jmiProdutoPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProdutoPrincipalActionPerformed(evt);
            }
        });
        jMenu1.add(jmiProdutoPrincipal);

        jmiEstoquePrincipal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jmiEstoquePrincipal.setText("Estoque");
        jmiEstoquePrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEstoquePrincipalActionPerformed(evt);
            }
        });
        jMenu1.add(jmiEstoquePrincipal);

        jmiLimparBDPrincipal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jmiLimparBDPrincipal.setText("Limpar BD");
        jmiLimparBDPrincipal.setEnabled(false);
        jmiLimparBDPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiLimparBDPrincipalActionPerformed(evt);
            }
        });
        jMenu1.add(jmiLimparBDPrincipal);
        jMenu1.add(jSeparator1);

        jmiSairPrincipal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jmiSairPrincipal.setText("Sair");
        jmiSairPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairPrincipalActionPerformed(evt);
            }
        });
        jMenu1.add(jmiSairPrincipal);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Botoes Menu Principal
    private void jbUsuarioPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUsuarioPrincipalActionPerformed
        this.setVisible(false);
        new ViewUsuario(nomeUsuario).setVisible(true);
    }//GEN-LAST:event_jbUsuarioPrincipalActionPerformed

    private void jbProdutoPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProdutoPrincipalActionPerformed
        this.setVisible(false);
        new ViewProduto(nomeUsuario).setVisible(true);
    }//GEN-LAST:event_jbProdutoPrincipalActionPerformed

    private void jbEstoquePrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEstoquePrincipalActionPerformed
        this.setVisible(false);
        new ViewEstoque(nomeUsuario).setVisible(true);
    }//GEN-LAST:event_jbEstoquePrincipalActionPerformed

    private void jbSobrePrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSobrePrincipalActionPerformed
       JOptionPane.showMessageDialog(null, "VERSÃO: 1.0 \n\nDESENVOLVIDO POR: LUCAS MARCUZO", "Sobre", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jbSobrePrincipalActionPerformed
    private void jbSairPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairPrincipalActionPerformed
        formWindowClosing(new WindowEvent(this, WIDTH));
    }//GEN-LAST:event_jbSairPrincipalActionPerformed

    //Botoes Menu-Bar
    private void jmiUsuarioPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUsuarioPrincipalActionPerformed
        jbUsuarioPrincipalActionPerformed(evt);
    }//GEN-LAST:event_jmiUsuarioPrincipalActionPerformed

    private void jmiProdutoPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProdutoPrincipalActionPerformed
        jbProdutoPrincipalActionPerformed(evt);
    }//GEN-LAST:event_jmiProdutoPrincipalActionPerformed

    private void jmiEstoquePrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEstoquePrincipalActionPerformed
        jbEstoquePrincipalActionPerformed(evt);
    }//GEN-LAST:event_jmiEstoquePrincipalActionPerformed

    private void jmiSairPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairPrincipalActionPerformed
        jbSairPrincipalActionPerformed(evt);
    }//GEN-LAST:event_jmiSairPrincipalActionPerformed
    
    //Sair de ViewPrincipal para ViewLogin.
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.setVisible(false);
        new ViewLogin().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    //Confirmar Saída.
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(new OpcoesFormularios().sairFormulario()) formWindowClosed(evt);
    }//GEN-LAST:event_formWindowClosing
    
    //Apagar BD.
    private void jmiLimparBDPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLimparBDPrincipalActionPerformed
        
        if(new OpcoesFormularios().confirmarLimpezaBD()){
            if(new Limpeza().limparBD()) 
            {
                JOptionPane.showMessageDialog(this, "BD apagado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                 JOptionPane.showMessageDialog(this, "Não foi possivel apagar o BD, tente novamente!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        }     
    }//GEN-LAST:event_jmiLimparBDPrincipalActionPerformed
    
    //Main
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
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal(nomeUsuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton jbEstoquePrincipal;
    private javax.swing.JButton jbProdutoPrincipal;
    private javax.swing.JButton jbSairPrincipal;
    private javax.swing.JButton jbSobrePrincipal;
    private javax.swing.JButton jbUsuarioPrincipal;
    private javax.swing.JLabel jlBemVindo;
    private javax.swing.JLabel jlNomeUsuario;
    private javax.swing.JMenuItem jmiEstoquePrincipal;
    private javax.swing.JMenuItem jmiLimparBDPrincipal;
    private javax.swing.JMenuItem jmiProdutoPrincipal;
    private javax.swing.JMenuItem jmiSairPrincipal;
    private javax.swing.JMenuItem jmiUsuarioPrincipal;
    // End of variables declaration//GEN-END:variables
}
