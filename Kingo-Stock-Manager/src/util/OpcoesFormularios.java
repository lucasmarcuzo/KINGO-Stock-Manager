package util;

import javax.swing.JOptionPane;

/**
 *
 * @author LucasMarcuzo
 */
public class OpcoesFormularios {
    
    public boolean sairFormulario(){
        Object[] options = { "Sim", "Não" };
        int dialogResult = JOptionPane.showOptionDialog(
                null,
                "Tem certeza que deseja Sair?", 
                "Atenção!", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null,
                options, 
                options[0]);
        return dialogResult == JOptionPane.YES_OPTION;
    }
    
    public boolean confirmarLimpezaBD(){
        Object[] options = { "Sim", "Não" };
        int dialogResult = JOptionPane.showOptionDialog(
                null,
                "Tem certeza que deseja apagar todo o banco de dados?", 
                "Atenção!", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null,
                options, 
                options[0]);
        return dialogResult == JOptionPane.YES_OPTION;
    }
    
    public int ImprimirSalvarRelatorio(){
        Object[] options = { "Salvar em PDF", "Imprimir" };
        int dialogResult = JOptionPane.showOptionDialog(
                null,
                "O relatório foi criado com sucesso!\n\nO que deseja fazer?", 
                "Atenção!", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null,
                options, 
                options[0]);
        return dialogResult;
    }
}
