package view;

// @author LucasMarcuzo
import controller.ControllerEstoque;
import controller.ControllerProduto;
import controller.ControllerUsuario;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelEstoque;
import model.ModelProduto;
import model.ModelUsuario;
import net.sf.jasperreports.engine.JRException;
import util.Formatacao;
import util.OpcoesFormularios;

public class ViewEstoque extends javax.swing.JFrame implements IIconePadrao{
    ModelEstoque modelEstoque = new ModelEstoque();
    ControllerEstoque controllerEstoque = new ControllerEstoque();
    List<ModelEstoque> listaEstoque = new ArrayList<>();
    
    ControllerProduto controllerProduto = new ControllerProduto();
    List<ModelProduto> listaDescProdutos = new ArrayList<>();
    
    ControllerUsuario controllerUsuario = new ControllerUsuario();
    List<ModelUsuario> listaUsuarios = new ArrayList<>();
    
    String cadastrarAlterar = "cad"; 
    private static String nomeUsuario = "";

    public ViewEstoque(String nomeUsuario) {
        initComponents();
        inserirIconePadrao(this);
        ListarEstoqueTabela();
        listarDescricaoProdutos();
        this.nomeUsuario = nomeUsuario;
        limparFormulario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlTipoMovimentacaoEstoque = new javax.swing.JLabel();
        jlQuantidadeEstoque = new javax.swing.JLabel();
        jlDescricaoProdutoEstoque = new javax.swing.JLabel();
        jlValorEstoque = new javax.swing.JLabel();
        jlProcurarEstoque = new javax.swing.JLabel();
        jlProdurarPorEstoque = new javax.swing.JLabel();
        jcbTipoMovimentacaoEstoque = new javax.swing.JComboBox<>();
        jcbDescricaoProdutoEstoque = new javax.swing.JComboBox<>();
        jsQuantidadeEstoque = new javax.swing.JSpinner();
        jcbProcurarPorEstoque = new javax.swing.JComboBox<>();
        jtfValorEstoque = new javax.swing.JTextField();
        jtfProcurarEstoque = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEstoque = new javax.swing.JTable();
        jbPesquisarEstoque = new javax.swing.JButton();
        jbLimparEstoque = new javax.swing.JButton();
        jbGerarRelatorioEstoque = new javax.swing.JButton();
        jbSalvarEstoque = new javax.swing.JButton();
        jtfCodigoEstoque = new javax.swing.JTextField();
        jlCodigoEstoque = new javax.swing.JLabel();
        jtfResponsavelEstoque = new javax.swing.JTextField();
        jlResponsavelEstoque = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("KINGO - Estoque");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 600));

        jlTipoMovimentacaoEstoque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlTipoMovimentacaoEstoque.setText("Tipo:");

        jlQuantidadeEstoque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlQuantidadeEstoque.setText("Quantidade:");

        jlDescricaoProdutoEstoque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDescricaoProdutoEstoque.setText("Descrição do produto:");

        jlValorEstoque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlValorEstoque.setText("Valor (R$):");

        jlProcurarEstoque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlProcurarEstoque.setText("Procurar:");

        jlProdurarPorEstoque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlProdurarPorEstoque.setText("Procurar por:");

        jcbTipoMovimentacaoEstoque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENTRADA", "SAÍDA" }));

        jsQuantidadeEstoque.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jcbProcurarPorEstoque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CÓDIGO", "RESPONSÁVEL", "TIPO", "DESCRIÇÃO DO PRODUTO", "QUANTIDADE", "VALOR" }));

        jtEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Responsável", "Tipo", "Descrição do Produto", "Quantidade", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtEstoque.setRowHeight(20);
        jScrollPane1.setViewportView(jtEstoque);
        if (jtEstoque.getColumnModel().getColumnCount() > 0) {
            jtEstoque.getColumnModel().getColumn(0).setMinWidth(80);
            jtEstoque.getColumnModel().getColumn(0).setPreferredWidth(80);
            jtEstoque.getColumnModel().getColumn(0).setMaxWidth(80);
            jtEstoque.getColumnModel().getColumn(2).setMinWidth(80);
            jtEstoque.getColumnModel().getColumn(2).setPreferredWidth(80);
            jtEstoque.getColumnModel().getColumn(2).setMaxWidth(80);
            jtEstoque.getColumnModel().getColumn(4).setMinWidth(80);
            jtEstoque.getColumnModel().getColumn(4).setPreferredWidth(80);
            jtEstoque.getColumnModel().getColumn(4).setMaxWidth(80);
            jtEstoque.getColumnModel().getColumn(5).setMinWidth(80);
            jtEstoque.getColumnModel().getColumn(5).setPreferredWidth(80);
            jtEstoque.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        jbPesquisarEstoque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbPesquisarEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/pesquisar-48.png"))); // NOI18N
        jbPesquisarEstoque.setText("Pesquisar");
        jbPesquisarEstoque.setAutoscrolls(true);
        jbPesquisarEstoque.setBorder(null);
        jbPesquisarEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbPesquisarEstoque.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbPesquisarEstoque.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbPesquisarEstoque.setIconTextGap(10);
        jbPesquisarEstoque.setPreferredSize(new java.awt.Dimension(155, 57));
        jbPesquisarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarEstoqueActionPerformed(evt);
            }
        });

        jbLimparEstoque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbLimparEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/limpar-48.png"))); // NOI18N
        jbLimparEstoque.setText("Limpar");
        jbLimparEstoque.setAutoscrolls(true);
        jbLimparEstoque.setBorder(null);
        jbLimparEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbLimparEstoque.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbLimparEstoque.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbLimparEstoque.setIconTextGap(20);
        jbLimparEstoque.setPreferredSize(new java.awt.Dimension(155, 57));
        jbLimparEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparEstoqueActionPerformed(evt);
            }
        });

        jbGerarRelatorioEstoque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbGerarRelatorioEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/emitirRelatorio-48.png"))); // NOI18N
        jbGerarRelatorioEstoque.setText("<html> Gerar  Relatório");
        jbGerarRelatorioEstoque.setAutoscrolls(true);
        jbGerarRelatorioEstoque.setBorder(null);
        jbGerarRelatorioEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbGerarRelatorioEstoque.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbGerarRelatorioEstoque.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbGerarRelatorioEstoque.setIconTextGap(15);
        jbGerarRelatorioEstoque.setPreferredSize(new java.awt.Dimension(155, 57));
        jbGerarRelatorioEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGerarRelatorioEstoqueActionPerformed(evt);
            }
        });

        jbSalvarEstoque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbSalvarEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/salvar-48.png"))); // NOI18N
        jbSalvarEstoque.setText("Salvar");
        jbSalvarEstoque.setAutoscrolls(true);
        jbSalvarEstoque.setBorder(null);
        jbSalvarEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSalvarEstoque.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbSalvarEstoque.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbSalvarEstoque.setIconTextGap(25);
        jbSalvarEstoque.setPreferredSize(new java.awt.Dimension(155, 57));
        jbSalvarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarEstoqueActionPerformed(evt);
            }
        });

        jtfCodigoEstoque.setEditable(false);
        jtfCodigoEstoque.setFocusable(false);

        jlCodigoEstoque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlCodigoEstoque.setText("Código:");

        jtfResponsavelEstoque.setEditable(false);
        jtfResponsavelEstoque.setFocusable(false);

        jlResponsavelEstoque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlResponsavelEstoque.setText("Responsável:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlCodigoEstoque)
                        .addGap(28, 28, 28)
                        .addComponent(jlResponsavelEstoque)
                        .addGap(68, 68, 68)
                        .addComponent(jlTipoMovimentacaoEstoque)
                        .addGap(90, 90, 90)
                        .addComponent(jlDescricaoProdutoEstoque)
                        .addGap(240, 240, 240)
                        .addComponent(jlQuantidadeEstoque)
                        .addGap(27, 27, 27)
                        .addComponent(jlValorEstoque))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfCodigoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jtfResponsavelEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jcbTipoMovimentacaoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jcbDescricaoProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jsQuantidadeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jtfValorEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlProcurarEstoque)
                            .addComponent(jtfProcurarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlProdurarPorEstoque)
                            .addComponent(jcbProcurarPorEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(jbPesquisarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbLimparEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(290, 290, 290)
                        .addComponent(jbGerarRelatorioEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(290, 290, 290)
                        .addComponent(jbSalvarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCodigoEstoque)
                    .addComponent(jlResponsavelEstoque)
                    .addComponent(jlTipoMovimentacaoEstoque)
                    .addComponent(jlDescricaoProdutoEstoque)
                    .addComponent(jlQuantidadeEstoque)
                    .addComponent(jlValorEstoque))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfCodigoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfResponsavelEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTipoMovimentacaoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbDescricaoProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsQuantidadeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfValorEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbPesquisarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlProcurarEstoque)
                                .addGap(7, 7, 7)
                                .addComponent(jtfProcurarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlProdurarPorEstoque)
                                .addGap(7, 7, 7)
                                .addComponent(jcbProcurarPorEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbLimparEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGerarRelatorioEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalvarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //Botão salvar Estoque
    private void jbSalvarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarEstoqueActionPerformed
        //Cadastrar Estoque.
        modelEstoque = new ModelEstoque();
        modelEstoque.setEstResponsavel(jtfResponsavelEstoque.getText());
        modelEstoque.setEstTipoMov(jcbTipoMovimentacaoEstoque.getSelectedItem().toString());
        modelEstoque.setEstDescricao(jcbDescricaoProdutoEstoque.getSelectedItem().toString());
        modelEstoque.setEstQuantidade(Integer.parseInt(jsQuantidadeEstoque.getValue().toString()));
        modelEstoque.setEstValor(new Formatacao().converterVirgulaParaPonto(jtfValorEstoque.getText()));
        //Fks IDs Usuario & Produto
        modelEstoque.setFkProId(localizarProduto(jcbDescricaoProdutoEstoque.getSelectedItem().toString()));
        modelEstoque.setFkUsuId(localizarUsuario(jtfResponsavelEstoque.getText()));
        
        if(cadastrarAlterar.equals("cad"))
        {   
            //Salvar Estoque.
            if(controllerEstoque.salvarEstoqueController(modelEstoque))
            {   //Estoque cadastrado com sucesso.
                JOptionPane.showMessageDialog(this, "Estoque cadastrado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                limparFormulario();
                ListarEstoqueTabela();
            }
            else 
            {   //Erro ao cadastrar Estoque.
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar estoque!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {   
            int dialogResult = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja salvar as alterações?", "Atenção!", JOptionPane.YES_NO_OPTION);
            if(dialogResult == 0) 
            {
                modelEstoque.setEstId(Integer.parseInt(jtfCodigoEstoque.getText()));
                //Alterar Estoque.
                if(controllerEstoque.atualizarEstoqueController(modelEstoque))
                {   //Estoque alterado com sucesso.
                    JOptionPane.showMessageDialog(this, "Estoque atualizado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                    limparFormulario();
                    ListarEstoqueTabela();
                }
                else 
                {   //Erro ao alterar Estoque.
                    JOptionPane.showMessageDialog(this, "Erro ao alterar estoque!", "Erro!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jbSalvarEstoqueActionPerformed
    
    //Confirmar Saída.
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(new OpcoesFormularios().sairFormulario()) formWindowClosed(evt);
    }//GEN-LAST:event_formWindowClosing
    
    //Sair de ViewEstoque para ViewPrincipal.
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.setVisible(false);
        new ViewPrincipal(nomeUsuario).setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    //Colocar nome do usuario logado no campo Responsavel.
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        jtfResponsavelEstoque.setText(nomeUsuario);
    }//GEN-LAST:event_formWindowActivated
    
    //Botão Limpar Formulario.
    private void jbLimparEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparEstoqueActionPerformed
        limparFormulario();
    }//GEN-LAST:event_jbLimparEstoqueActionPerformed
    
    //Botao Gerar Relatório.
    private void jbGerarRelatorioEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGerarRelatorioEstoqueActionPerformed
        try {
            //Se: -1 Cancela / 0 = Salva / 1 = Imprime.
            controllerEstoque.gerarRelatorioController(new OpcoesFormularios().ImprimirSalvarRelatorio());
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbGerarRelatorioEstoqueActionPerformed
    
    //Botão Pesquisar um valor no BD do Estoque.
    private void jbPesquisarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarEstoqueActionPerformed
        pesquisarListarEstoqueTabela(jtfProcurarEstoque.getText(), jcbProcurarPorEstoque.getSelectedItem().toString());
    }//GEN-LAST:event_jbPesquisarEstoqueActionPerformed
    
    //Preenche o Estoque do BD na tabela de Estoque.
    private void ListarEstoqueTabela(){
        listaEstoque = controllerEstoque.getListaEstoqueController();
        DefaultTableModel tabelaUsuarioModel = (DefaultTableModel) jtEstoque.getModel();
        tabelaUsuarioModel.setNumRows(0);
        
        for (int i = 0; i < listaEstoque.size(); i++) 
        {
            tabelaUsuarioModel.addRow(new Object[]{
                listaEstoque.get(i).getEstId(),
                listaEstoque.get(i).getEstResponsavel(),
                listaEstoque.get(i).getEstTipoMov(),
                listaEstoque.get(i).getEstDescricao(),
                listaEstoque.get(i).getEstQuantidade(),
                listaEstoque.get(i).getEstValor()
            });
        }
    }
    
    //Realiza uma pesquisa no Estoque do BD e Preenche a tabela do View Estoque.
    private void pesquisarListarEstoqueTabela(String pesquisa, String localPesquisa){
        listaEstoque = controllerEstoque.realizarPesquisaController(pesquisa, localPesquisa);
        
        if(listaEstoque.isEmpty())
        {
            //Erro ao localizar busca.
            JOptionPane.showMessageDialog(this, "Sua pesquisa \"" + pesquisa + "\" não encontrou nenhum valor correspondente no Estoque!", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            DefaultTableModel tabelaUsuarioModel = (DefaultTableModel) jtEstoque.getModel();
            tabelaUsuarioModel.setNumRows(0);

            for (int i = 0; i < listaEstoque.size(); i++) 
            {
                tabelaUsuarioModel.addRow(new Object[]{
                    listaEstoque.get(i).getEstId(),
                    listaEstoque.get(i).getEstResponsavel(),
                    listaEstoque.get(i).getEstTipoMov(),
                    listaEstoque.get(i).getEstDescricao(),
                    listaEstoque.get(i).getEstQuantidade(),
                    listaEstoque.get(i).getEstValor()
                });
            }
        }
    }
    
    //Limpar Formulario
    private void limparFormulario(){
        jtfCodigoEstoque.setText("");
        jcbTipoMovimentacaoEstoque.setSelectedIndex(-1);
        jcbDescricaoProdutoEstoque.setSelectedIndex(-1);
        jsQuantidadeEstoque.setValue(1);
        jtfValorEstoque.setText("");
        jtfProcurarEstoque.setText("");
        jcbProcurarPorEstoque.setSelectedIndex(-1);
        ListarEstoqueTabela();
    }
    
    //Preenche jcbDescricaoProdutoEstoque com os Produtos cadastrados.
    private void listarDescricaoProdutos(){
        listaDescProdutos = controllerProduto.getListaProdutoController();
        
        for (int i = 0; i < listaDescProdutos.size(); i++) 
        {
            jcbDescricaoProdutoEstoque.addItem(listaDescProdutos.get(i).getProDescricao());
        }
    }
    
    //Localiza e preenche fk_usu_id com o Id do usuário que foi feito o login.
    private int localizarUsuario(String usuario){
        listaUsuarios = controllerUsuario.getListaUsuariosController();
        
        for (int i = 0; i < listaUsuarios.size(); i++) 
        {
            if(usuario.equalsIgnoreCase(listaUsuarios.get(i).getUsuNome()))
            {
                return listaUsuarios.get(i).getUsuId();
            }
        }
        return 0;
    }
    
    //Localiza e preenche fk_pro_id com o Id do Produto que foi slecionado no jcbDescricaoProdutoEstoque.
    private int localizarProduto(String produto){
        listaDescProdutos = controllerProduto.getListaProdutoController();

        for (int i = 0; i < listaDescProdutos.size(); i++) 
        {
            if(produto.equals(listaDescProdutos.get(i).getProDescricao()))
            {
                return listaDescProdutos.get(i).getProId();
            }
        }
        return 0;
    }

    //main
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
            java.util.logging.Logger.getLogger(ViewEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEstoque(nomeUsuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGerarRelatorioEstoque;
    private javax.swing.JButton jbLimparEstoque;
    private javax.swing.JButton jbPesquisarEstoque;
    private javax.swing.JButton jbSalvarEstoque;
    private javax.swing.JComboBox<String> jcbDescricaoProdutoEstoque;
    private javax.swing.JComboBox<String> jcbProcurarPorEstoque;
    private javax.swing.JComboBox<String> jcbTipoMovimentacaoEstoque;
    private javax.swing.JLabel jlCodigoEstoque;
    private javax.swing.JLabel jlDescricaoProdutoEstoque;
    private javax.swing.JLabel jlProcurarEstoque;
    private javax.swing.JLabel jlProdurarPorEstoque;
    private javax.swing.JLabel jlQuantidadeEstoque;
    private javax.swing.JLabel jlResponsavelEstoque;
    private javax.swing.JLabel jlTipoMovimentacaoEstoque;
    private javax.swing.JLabel jlValorEstoque;
    private javax.swing.JSpinner jsQuantidadeEstoque;
    private javax.swing.JTable jtEstoque;
    private javax.swing.JTextField jtfCodigoEstoque;
    private javax.swing.JTextField jtfProcurarEstoque;
    private javax.swing.JTextField jtfResponsavelEstoque;
    private javax.swing.JTextField jtfValorEstoque;
    // End of variables declaration//GEN-END:variables
}
