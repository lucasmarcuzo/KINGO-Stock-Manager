package view;

//@author LucasMarcuzo

import controller.ControllerProduto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelProduto;
import util.Formatacao;
import util.OpcoesFormularios;

public class ViewProduto extends javax.swing.JFrame implements IIconePadrao{
    ModelProduto modelProduto = new ModelProduto();
    ControllerProduto controllerProduto = new ControllerProduto();
    List<ModelProduto> listaProduto = new ArrayList<>();
    
    String cadastrarAlterar = "cad"; 
    private static String nomeUsuario = "";
    
    public ViewProduto(String nomeUsuario) {
        initComponents();
        inserirIconePadrao(this);
        listarProdutosTabela();
        this.nomeUsuario = nomeUsuario;
        limparFormulario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlCodigoProduto = new javax.swing.JLabel();
        jlDescricaoProduto = new javax.swing.JLabel();
        jlQuantidadeProduto = new javax.swing.JLabel();
        jlValorProduto = new javax.swing.JLabel();
        jtfCodigoProduto = new javax.swing.JTextField();
        jtfDescricaoProduto = new javax.swing.JTextField();
        jtfValorProduto = new javax.swing.JTextField();
        jsQuantidadeProduto = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProduto = new javax.swing.JTable();
        jbLimparProduto = new javax.swing.JButton();
        jbExcluirProduto = new javax.swing.JButton();
        jbAlterarProduto = new javax.swing.JButton();
        jbSalvarProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("KINGO - Produtos");
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

        jlCodigoProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlCodigoProduto.setText("Código:");

        jlDescricaoProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDescricaoProduto.setText("Descrição do Produto:");

        jlQuantidadeProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlQuantidadeProduto.setText("Quantidade:");

        jlValorProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlValorProduto.setText("Valor (R$):");

        jtfCodigoProduto.setEditable(false);
        jtfCodigoProduto.setFocusable(false);

        jtfValorProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfValorProdutoFocusLost(evt);
            }
        });

        jsQuantidadeProduto.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jtProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Quantidade", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProduto.setRowHeight(20);
        jScrollPane1.setViewportView(jtProduto);
        if (jtProduto.getColumnModel().getColumnCount() > 0) {
            jtProduto.getColumnModel().getColumn(0).setMinWidth(80);
            jtProduto.getColumnModel().getColumn(0).setPreferredWidth(80);
            jtProduto.getColumnModel().getColumn(0).setMaxWidth(80);
            jtProduto.getColumnModel().getColumn(2).setMinWidth(100);
            jtProduto.getColumnModel().getColumn(2).setPreferredWidth(100);
            jtProduto.getColumnModel().getColumn(2).setMaxWidth(100);
            jtProduto.getColumnModel().getColumn(3).setMinWidth(100);
            jtProduto.getColumnModel().getColumn(3).setPreferredWidth(100);
            jtProduto.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        jbLimparProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbLimparProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/limpar-48.png"))); // NOI18N
        jbLimparProduto.setText("Limpar");
        jbLimparProduto.setAutoscrolls(true);
        jbLimparProduto.setBorder(null);
        jbLimparProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbLimparProduto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbLimparProduto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbLimparProduto.setIconTextGap(20);
        jbLimparProduto.setPreferredSize(new java.awt.Dimension(155, 57));
        jbLimparProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparProdutoActionPerformed(evt);
            }
        });

        jbExcluirProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbExcluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/apagar-48.png"))); // NOI18N
        jbExcluirProduto.setText("Excluir");
        jbExcluirProduto.setAutoscrolls(true);
        jbExcluirProduto.setBorder(null);
        jbExcluirProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbExcluirProduto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbExcluirProduto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbExcluirProduto.setIconTextGap(20);
        jbExcluirProduto.setPreferredSize(new java.awt.Dimension(155, 57));
        jbExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirProdutoActionPerformed(evt);
            }
        });

        jbAlterarProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbAlterarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/editar-48.png"))); // NOI18N
        jbAlterarProduto.setText("Alterar");
        jbAlterarProduto.setAutoscrolls(true);
        jbAlterarProduto.setBorder(null);
        jbAlterarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAlterarProduto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbAlterarProduto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbAlterarProduto.setIconTextGap(20);
        jbAlterarProduto.setPreferredSize(new java.awt.Dimension(155, 57));
        jbAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarProdutoActionPerformed(evt);
            }
        });

        jbSalvarProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbSalvarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/salvar-48.png"))); // NOI18N
        jbSalvarProduto.setText("Salvar");
        jbSalvarProduto.setAutoscrolls(true);
        jbSalvarProduto.setBorder(null);
        jbSalvarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSalvarProduto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbSalvarProduto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbSalvarProduto.setIconTextGap(25);
        jbSalvarProduto.setPreferredSize(new java.awt.Dimension(155, 57));
        jbSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)
                        .addComponent(jbLimparProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)
                        .addComponent(jbAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCodigoProduto)
                            .addComponent(jtfCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDescricaoProduto)
                            .addComponent(jtfDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jsQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlQuantidadeProduto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlValorProduto)
                            .addComponent(jtfValorProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCodigoProduto)
                    .addComponent(jlDescricaoProduto)
                    .addComponent(jlQuantidadeProduto)
                    .addComponent(jlValorProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jsQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimparProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Botão Salvar Produto.
    private void jbSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarProdutoActionPerformed
        //Cadastrar Produto.
        modelProduto = new ModelProduto();
        modelProduto.setProDescricao(jtfDescricaoProduto.getText());
        modelProduto.setProQuantidade(Integer.parseInt(jsQuantidadeProduto.getValue().toString()));
        modelProduto.setProValor(new Formatacao().converterVirgulaParaPonto(jtfValorProduto.getText()));
       
        if(cadastrarAlterar.equals("cad"))
        {   
            //Salvar Produto.
            if(controllerProduto.salvarProdutoController(modelProduto))
            {   //Produto cadastrado com sucesso.
                JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                limparFormulario();
                listarProdutosTabela();
            }
            else 
            {   //Erro ao cadastrar Produto.
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar produto!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {   
            int dialogResult = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja salvar as alterações?", "Atenção!", JOptionPane.YES_NO_OPTION);
            if(dialogResult == 0) 
            {
                modelProduto.setProId(Integer.parseInt(jtfCodigoProduto.getText()));
                //Alterar Produto.
                if(controllerProduto.atualizarProdutoController(modelProduto))
                {   //Produto alterado com sucesso.
                    JOptionPane.showMessageDialog(this, "Produto atualizado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                    limparFormulario();
                    listarProdutosTabela();
                }
                else 
                {   //Erro ao alterar Produto.
                    JOptionPane.showMessageDialog(this, "Erro ao alterar produto!", "Erro!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jbSalvarProdutoActionPerformed

    //Botão Alterar Produto
    private void jbAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarProdutoActionPerformed
        cadastrarAlterar = "alt";
        modelProduto = new ModelProduto();
        int linha = jtProduto.getSelectedRow();
        if(linha < 0)
        {
            JOptionPane.showMessageDialog(this, "Nenhum produto foi selecionado!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        else
        {   
            int codigo = (int) jtProduto.getValueAt(linha, 0);
            modelProduto = controllerProduto.getProdutoController(codigo);
            jtfCodigoProduto.setText(String.valueOf(modelProduto.getProId()));
            jtfDescricaoProduto.setText(modelProduto.getProDescricao());
            jsQuantidadeProduto.setValue(modelProduto.getProQuantidade());
            jtfValorProduto.setText(modelProduto.getProValor());
            jbSalvarProduto.setText("<html>\nSalvar\nAlteração");
            jbSalvarProduto.setIconTextGap(20);
        }
    }//GEN-LAST:event_jbAlterarProdutoActionPerformed
    
    //Botão Limpar Produto
    private void jbLimparProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparProdutoActionPerformed
        limparFormulario();
    }//GEN-LAST:event_jbLimparProdutoActionPerformed

    //Botão Excluir Produto
    private void jbExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirProdutoActionPerformed
        int linha = jtProduto.getSelectedRow();
        if(linha < 0)
        {
            JOptionPane.showMessageDialog(this, "Nenhum produto foi selecionado!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        else
        {   
            int dialogResult = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir este produto?", "Atenção!", JOptionPane.YES_NO_OPTION);
            if(dialogResult == 0) 
            {
                int codigo = (int) jtProduto.getValueAt(linha, 0);
                if(controllerProduto.excluirProdutoController(codigo))
                {
                    listarProdutosTabela();
                    limparFormulario();
                    JOptionPane.showMessageDialog(this, "Produto excluído com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Erro ao excluir produto!", "Erro!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jbExcluirProdutoActionPerformed
    
    //Fomatar valor monetario do campo valor.
    private void jtfValorProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfValorProdutoFocusLost
        jtfValorProduto.setText(new Formatacao().converterVirgulaParaPonto(jtfValorProduto.getText()));
    }//GEN-LAST:event_jtfValorProdutoFocusLost
    
    //Confirmar Saída.
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(new OpcoesFormularios().sairFormulario()) formWindowClosed(evt);
    }//GEN-LAST:event_formWindowClosing
    
    //Sair de ViewProduto para ViewPrincipal.
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.setVisible(false);
        new ViewPrincipal(nomeUsuario).setVisible(true);
    }//GEN-LAST:event_formWindowClosed
    
    //Preenche os Usuários do BD na tabela de Usuários.
    private void listarProdutosTabela(){
        listaProduto = controllerProduto.getListaProdutoController();
        DefaultTableModel tabelaUsuarioModel = (DefaultTableModel) jtProduto.getModel();
        tabelaUsuarioModel.setNumRows(0);
        
        for (int i = 0; i < listaProduto.size(); i++) {
            tabelaUsuarioModel.addRow(new Object[]{
                listaProduto.get(i).getProId(),
                listaProduto.get(i).getProDescricao(),
                listaProduto.get(i).getProQuantidade(),
                listaProduto.get(i).getProValor()
            });
        }
    }
    
    //Limpar Formulario
    private void limparFormulario(){
        jtfCodigoProduto.setText("");
        jtfDescricaoProduto.setText("");
        jsQuantidadeProduto.setValue(1);
        jtfValorProduto.setText("");
        jbSalvarProduto.setText("Salvar");
        jbSalvarProduto.setIconTextGap(25);
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
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProduto(nomeUsuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterarProduto;
    private javax.swing.JButton jbExcluirProduto;
    private javax.swing.JButton jbLimparProduto;
    private javax.swing.JButton jbSalvarProduto;
    private javax.swing.JLabel jlCodigoProduto;
    private javax.swing.JLabel jlDescricaoProduto;
    private javax.swing.JLabel jlQuantidadeProduto;
    private javax.swing.JLabel jlValorProduto;
    private javax.swing.JSpinner jsQuantidadeProduto;
    private javax.swing.JTable jtProduto;
    private javax.swing.JTextField jtfCodigoProduto;
    private javax.swing.JTextField jtfDescricaoProduto;
    private javax.swing.JTextField jtfValorProduto;
    // End of variables declaration//GEN-END:variables
}
