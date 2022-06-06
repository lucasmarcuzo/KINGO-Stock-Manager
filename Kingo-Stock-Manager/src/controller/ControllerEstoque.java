package controller;

import model.ModelEstoque;
import DAO.DAOEstoque;
import java.util.ArrayList;
import net.sf.jasperreports.engine.JRException;

/**
*
* @author LucasMarcuzo
*/
public class ControllerEstoque {

    private DAOEstoque daoEstoque = new DAOEstoque();

    /**
    * grava Estoque
    * @param pModelEstoque
    * @return int
    */
    public boolean salvarEstoqueController(ModelEstoque pModelEstoque){
        return this.daoEstoque.salvarEstoqueDAO(pModelEstoque);
    }

    /**
    * recupera Estoque
    * @param pEstId
    * @return ModelEstoque
    */
    public ModelEstoque getEstoqueController(int pEstId){
        return this.daoEstoque.getEstoqueDAO(pEstId);
    }

    /**
    * Recupera a lista dbEstoque
    * @return ArrayList
    */
    public ArrayList<ModelEstoque> getListaEstoqueController(){
        return this.daoEstoque.getListaEstoqueDAO();
    }
    
    /**
    * Faz pesquisa no Estoque
    * @param pesquisa
    * @param localPesquisa
    * @return ArrayList
    */
    public ArrayList<ModelEstoque> realizarPesquisaController(String pesquisa, String localPesquisa){
        return this.daoEstoque.getListaEstoqueDAO(pesquisa, localPesquisa);
    }

    /**
    * atualiza Estoque
    * @param pModelEstoque
    * @return boolean
    */
    public boolean atualizarEstoqueController(ModelEstoque pModelEstoque){
        return this.daoEstoque.atualizarEstoqueDAO(pModelEstoque);
    }

    /**
    * exclui Estoque
    * @param pEstId
    * @return boolean
    */
    public boolean excluirEstoqueController(int pEstId){
        return this.daoEstoque.excluirEstoqueDAO(pEstId);
    }
    
    /**
    * Cria Relatorio Estoque
    * @param salvarImprimir
    * @throws net.sf.jasperreports.engine.JRException
    */
    public void gerarRelatorioController(int salvarImprimir) throws JRException{
        this.daoEstoque.emitirRelatorioDAO(salvarImprimir);
    }
    
}