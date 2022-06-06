package controller;

import model.ModelProduto;
import DAO.DAOProduto;
import java.util.ArrayList;

/**
*
* @author Lucas Marcuzo
*/
public class ControllerProduto {

    private DAOProduto daoProduto = new DAOProduto();

    /**
    * grava Produto
    * @param pModelProduto
    * @return int
    */
    public boolean salvarProdutoController(ModelProduto pModelProduto){
        return this.daoProduto.salvarProdutoDAO(pModelProduto);
    }

    /**
    * recupera Produto
    * @param pProId
    * @return ModelProduto
    */
    public ModelProduto getProdutoController(int pProId){
        return this.daoProduto.getProdutoDAO(pProId);
    }

    /**
    * recupera uma lista deProduto
    * @param pProId
    * @return ArrayList
    */
    public ArrayList<ModelProduto> getListaProdutoController(){
        return this.daoProduto.getListaProdutoDAO();
    }

    /**
    * atualiza Produto
    * @param pModelProduto
    * @return boolean
    */
    public boolean atualizarProdutoController(ModelProduto pModelProduto){
        return this.daoProduto.atualizarProdutoDAO(pModelProduto);
    }

    /**
    * exclui Produto
    * @param pProId
    * @return boolean
    */
    public boolean excluirProdutoController(int pProId){
        return this.daoProduto.excluirProdutoDAO(pProId);
    }
}