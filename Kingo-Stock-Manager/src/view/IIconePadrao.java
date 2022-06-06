package view;

//@author LucasMarcuzo

import java.awt.Toolkit;
import javax.swing.JFrame;

public interface IIconePadrao {
    
    //Insere icone Padrão no Fomulário passado.
    default public void inserirIconePadrao(JFrame frm){
        frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src\\view\\imagens\\iconGerenciador-60.png"));
    }
    
}
