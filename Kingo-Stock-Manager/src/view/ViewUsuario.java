package view;

//@author LucasMarcuzo

import controller.ControllerUsuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelUsuario;
import util.OpcoesFormularios;

public class ViewUsuario extends javax.swing.JFrame implements IIconePadrao{
    ModelUsuario modelUsuario = new ModelUsuario();
    ControllerUsuario controllerUsuario = new ControllerUsuario();
    List<ModelUsuario> listaUsuario = new ArrayList();

    String cadastrarAlterar = "cad"; 
    private static String nomeUsuario = "";
    
    public ViewUsuario(String nomeUsuario) {
        initComponents();
        inserirIconePadrao(this);
        listarUsuariosTabela();
        this.nomeUsuario = nomeUsuario;
        limparFormulario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jlCodigoUsuario = new javax.swing.JLabel();
        jlNomeUsuario = new javax.swing.JLabel();
        jlLoginUsuario = new javax.swing.JLabel();
        jlSenhaUsuario = new javax.swing.JLabel();
        jtfCodigoUsuario = new javax.swing.JTextField();
        jtfNomeUsuario = new javax.swing.JTextField();
        jtfLoginUsuario = new javax.swing.JTextField();
        jpfSenhaUsuario = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtUsuario = new javax.swing.JTable();
        jbLimparUsuario = new javax.swing.JButton();
        jbExcluirUsuario = new javax.swing.JButton();
        jbAlterarUsuario = new javax.swing.JButton();
        jbSalvarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("KINGO - Usuários");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 600));

        jlCodigoUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlCodigoUsuario.setText("Código:");

        jlNomeUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlNomeUsuario.setText("Nome:");

        jlLoginUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlLoginUsuario.setText("Login:");

        jlSenhaUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlSenhaUsuario.setText("Senha:");

        jtfCodigoUsuario.setEditable(false);
        jtfCodigoUsuario.setFocusable(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jtfNomeUsuario, org.jdesktop.beansbinding.ObjectProperty.create(), jtfCodigoUsuario, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jtfLoginUsuario, org.jdesktop.beansbinding.ObjectProperty.create(), jtfNomeUsuario, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jpfSenhaUsuario, org.jdesktop.beansbinding.ObjectProperty.create(), jtfLoginUsuario, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jbSalvarUsuario, org.jdesktop.beansbinding.ObjectProperty.create(), jpfSenhaUsuario, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        jtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Login"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtUsuario.setRowHeight(20);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jtfCodigoUsuario, org.jdesktop.beansbinding.ObjectProperty.create(), jtUsuario, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(jtUsuario);
        if (jtUsuario.getColumnModel().getColumnCount() > 0) {
            jtUsuario.getColumnModel().getColumn(0).setMinWidth(80);
            jtUsuario.getColumnModel().getColumn(0).setPreferredWidth(80);
            jtUsuario.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        jbLimparUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbLimparUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/limpar-48.png"))); // NOI18N
        jbLimparUsuario.setText("Limpar");
        jbLimparUsuario.setAutoscrolls(true);
        jbLimparUsuario.setBorder(null);
        jbLimparUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbLimparUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbLimparUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbLimparUsuario.setIconTextGap(20);
        jbLimparUsuario.setPreferredSize(new java.awt.Dimension(155, 57));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jbExcluirUsuario, org.jdesktop.beansbinding.ObjectProperty.create(), jbLimparUsuario, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        jbLimparUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparUsuarioActionPerformed(evt);
            }
        });

        jbExcluirUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbExcluirUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/apagar-48.png"))); // NOI18N
        jbExcluirUsuario.setText("Excluir");
        jbExcluirUsuario.setAutoscrolls(true);
        jbExcluirUsuario.setBorder(null);
        jbExcluirUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbExcluirUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbExcluirUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbExcluirUsuario.setIconTextGap(20);
        jbExcluirUsuario.setPreferredSize(new java.awt.Dimension(155, 57));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jtUsuario, org.jdesktop.beansbinding.ObjectProperty.create(), jbExcluirUsuario, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        jbExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirUsuarioActionPerformed(evt);
            }
        });

        jbAlterarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbAlterarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/editar-48.png"))); // NOI18N
        jbAlterarUsuario.setText("Alterar");
        jbAlterarUsuario.setAutoscrolls(true);
        jbAlterarUsuario.setBorder(null);
        jbAlterarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAlterarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbAlterarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbAlterarUsuario.setIconTextGap(20);
        jbAlterarUsuario.setPreferredSize(new java.awt.Dimension(155, 57));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jbLimparUsuario, org.jdesktop.beansbinding.ObjectProperty.create(), jbAlterarUsuario, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        jbAlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarUsuarioActionPerformed(evt);
            }
        });

        jbSalvarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbSalvarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/salvar-48.png"))); // NOI18N
        jbSalvarUsuario.setText("Salvar");
        jbSalvarUsuario.setAutoscrolls(true);
        jbSalvarUsuario.setBorder(null);
        jbSalvarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSalvarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbSalvarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbSalvarUsuario.setIconTextGap(25);
        jbSalvarUsuario.setPreferredSize(new java.awt.Dimension(155, 57));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jbAlterarUsuario, org.jdesktop.beansbinding.ObjectProperty.create(), jbSalvarUsuario, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        jbSalvarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCodigoUsuario)
                            .addComponent(jtfCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlNomeUsuario)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtfNomeUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlLoginUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlSenhaUsuario)
                            .addComponent(jpfSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbExcluirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)
                        .addComponent(jbLimparUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)
                        .addComponent(jbAlterarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)
                        .addComponent(jbSalvarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCodigoUsuario)
                    .addComponent(jlNomeUsuario)
                    .addComponent(jlLoginUsuario)
                    .addComponent(jlSenhaUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpfSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbAlterarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbExcluirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbLimparUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jbSalvarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //Botão Salvar Usuário.
    private void jbSalvarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarUsuarioActionPerformed
        //Cadastrar usuário
        modelUsuario = new ModelUsuario();
        modelUsuario.setUsuNome(jtfNomeUsuario.getText());
        modelUsuario.setUsuLogin(jtfLoginUsuario.getText());
        modelUsuario.setUsuSenha(String.valueOf(jpfSenhaUsuario.getPassword()));
        
        if(cadastrarAlterar.equals("cad"))
        {   
            //Salvar Usuário.
            if(controllerUsuario.salvarUsuarioController(modelUsuario))
            {   //Usuário cadastrado com sucesso.
                JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                limparFormulario();
                listarUsuariosTabela();
            }
            else 
            {   //Erro ao cadastrar usuário.
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar usuário!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {   
            int dialogResult = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja salvar as alterações?", "Atenção!", JOptionPane.YES_NO_OPTION);
            if(dialogResult == 0) 
            {
                modelUsuario.setUsuId(Integer.parseInt(jtfCodigoUsuario.getText()));
                //Alterar Usuário.
                if(controllerUsuario.atualizarUsuarioController(modelUsuario))
                {   //Usuário alterado com sucesso.
                    JOptionPane.showMessageDialog(this, "Usuário atualizado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                    limparFormulario();
                    listarUsuariosTabela();
                }
                else 
                {   //Erro ao alterar usuário.
                    JOptionPane.showMessageDialog(this, "Erro ao alterar usuário!", "Erro!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jbSalvarUsuarioActionPerformed
    
    //Botão Alterar Usuário.
    private void jbAlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarUsuarioActionPerformed
        cadastrarAlterar = "alt";
        modelUsuario = new ModelUsuario();
        int linha = jtUsuario.getSelectedRow();
        if(linha < 0)
        {
            JOptionPane.showMessageDialog(this, "Nenhum usuário foi selecionado!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        else
        {   
            int codigo = (int) jtUsuario.getValueAt(linha, 0);
            modelUsuario = controllerUsuario.getUsuarioController(codigo);
            jtfCodigoUsuario.setText(String.valueOf(modelUsuario.getUsuId()));
            jtfLoginUsuario.setText(modelUsuario.getUsuLogin());
            jtfNomeUsuario.setText(modelUsuario.getUsuNome());
            jpfSenhaUsuario.setText(modelUsuario.getUsuSenha());
            jbSalvarUsuario.setText("<html>\nSalvar\nAlteração");
            jbSalvarUsuario.setIconTextGap(20);
        }
    }//GEN-LAST:event_jbAlterarUsuarioActionPerformed
    
    //Botão Limpar Usuário.
    private void jbLimparUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparUsuarioActionPerformed
        limparFormulario();
    }//GEN-LAST:event_jbLimparUsuarioActionPerformed
    
    //Botão Excluir Usuário.
    private void jbExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirUsuarioActionPerformed
        int linha = jtUsuario.getSelectedRow();
        if(linha < 0)
        {
            JOptionPane.showMessageDialog(this, "Nenhum usuário foi selecionado!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        else
        {   
            int dialogResult = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir este usuário?", "Atenção!", JOptionPane.YES_NO_OPTION);
            if(dialogResult == 0) 
            {
                int codigo = (int) jtUsuario.getValueAt(linha, 0);
                if(controllerUsuario.excluirUsuarioController(codigo))
                {
                    listarUsuariosTabela();
                    limparFormulario();
                    JOptionPane.showMessageDialog(this, "Usuário excluído com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Erro ao excluir usuário!", "Erro!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jbExcluirUsuarioActionPerformed
    
    //Confirmar Saída
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(new OpcoesFormularios().sairFormulario()) formWindowClosed(evt);
    }//GEN-LAST:event_formWindowClosing
    
    //Sair de ViewUsuario para ViewPrincipal.
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.setVisible(false);
        new ViewPrincipal(nomeUsuario).setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    //Preenche os Usuários do BD na tabela de Usuários.
    private void listarUsuariosTabela(){
        listaUsuario = controllerUsuario.getListaUsuariosController();
        DefaultTableModel tabelaUsuarioModel = (DefaultTableModel) jtUsuario.getModel();
        tabelaUsuarioModel.setNumRows(0);
        
        for (int i = 0; i < listaUsuario.size(); i++) {
            tabelaUsuarioModel.addRow(new Object[]{
                listaUsuario.get(i).getUsuId(),
                listaUsuario.get(i).getUsuNome(),
                listaUsuario.get(i).getUsuLogin()
            });
        }
    }
    
    //Limpar Formulário.
    private void limparFormulario(){
        jtfCodigoUsuario.setText("");
        jtfNomeUsuario.setText("");
        jtfLoginUsuario.setText("");
        jpfSenhaUsuario.setText("");
        cadastrarAlterar = "cad";
        jbSalvarUsuario.setText("Salvar");
        jbSalvarUsuario.setIconTextGap(25);
    }
    
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
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUsuario(nomeUsuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterarUsuario;
    private javax.swing.JButton jbExcluirUsuario;
    private javax.swing.JButton jbLimparUsuario;
    private javax.swing.JButton jbSalvarUsuario;
    private javax.swing.JLabel jlCodigoUsuario;
    private javax.swing.JLabel jlLoginUsuario;
    private javax.swing.JLabel jlNomeUsuario;
    private javax.swing.JLabel jlSenhaUsuario;
    private javax.swing.JPasswordField jpfSenhaUsuario;
    private javax.swing.JTable jtUsuario;
    private javax.swing.JTextField jtfCodigoUsuario;
    private javax.swing.JTextField jtfLoginUsuario;
    private javax.swing.JTextField jtfNomeUsuario;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

   
}
