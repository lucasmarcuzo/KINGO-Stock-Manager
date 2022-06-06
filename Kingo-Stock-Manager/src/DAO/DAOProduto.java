package DAO;

import model.ModelProduto;
import util.ConexaoSQLite;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
/**
*
* @author Lucas Marcuzo
*/
public class DAOProduto extends ConexaoSQLite {

    /**
    * grava Produto
    * @param pModelProduto
    * @return int
    */
    public boolean salvarProdutoDAO(ModelProduto pModelProduto){
        this.conectar();
        String sql = 
            "INSERT INTO tbl_produto ("
                    + "pro_descricao,"
                    + "pro_quantidade,"
                    + "pro_valor"
                + ") VALUES (?,?,?);"
            ;
        
        try (PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            preparedStatement.setString(1, pModelProduto.getProDescricao());
            preparedStatement.setInt(2, pModelProduto.getProQuantidade());
            preparedStatement.setString(3, pModelProduto.getProValor());
            preparedStatement.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.desconectar();
        }
        return true;

    }
/**
    * recupera Produto
    * @param pProId
    * @return ModelProduto
    */
    public ModelProduto getProdutoDAO(int pProId){
        ModelProduto modelProduto = null;

        String sql = "SELECT "
                    + "pk_pro_id,"
                    + "pro_descricao,"
                    + "pro_quantidade,"
                    + "pro_valor"
                 + " FROM"
                     + " tbl_produto"
                 + " WHERE"
                     + " pk_pro_id = ?"
                + ";"
            ;

        this.conectar();

        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){
            
            preparedStatement.setInt(1, pProId);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {modelProduto = new ModelProduto();
                modelProduto.setProId(resultSet.getInt(1));
                modelProduto.setProDescricao(resultSet.getString(2));
                modelProduto.setProQuantidade(resultSet.getInt(3));
                modelProduto.setProValor(resultSet.getString(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.desconectar();
        }
        return modelProduto;
    }

    /**
    * recupera uma lista de Produto
        * @return ArrayList
    */
    public ArrayList<ModelProduto> getListaProdutoDAO(){
        ArrayList<ModelProduto> listamodelProduto = new ArrayList();
        ModelProduto modelProduto = null;

        String sql = "SELECT "
                    + "pk_pro_id,"
                    + "pro_descricao,"
                    + "pro_quantidade,"
                    + "pro_valor"
                 + " FROM"
                     + " tbl_produto"
                + ";";

        this.conectar();

        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                modelProduto = new ModelProduto();
                modelProduto.setProId(resultSet.getInt(1));
                modelProduto.setProDescricao(resultSet.getString(2));
                modelProduto.setProQuantidade(resultSet.getInt(3));
                modelProduto.setProValor(resultSet.getString(4));
                listamodelProduto.add(modelProduto);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.desconectar();
        }
        return listamodelProduto;
    }

    /**
    * atualiza Produto
    * @param pModelProduto
    * @return boolean
    */
    public boolean atualizarProdutoDAO(ModelProduto pModelProduto){
        this.conectar();
        String sql = 
            "UPDATE tbl_produto SET "
                    + "pk_pro_id = ?,"
                    + "pro_descricao = ?,"
                    + "pro_quantidade = ?,"
                    + "pro_valor = ?"
                + " WHERE pk_pro_id = ? "
                +";"
            ;
        
        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){
            preparedStatement.setInt(1, pModelProduto.getProId());
            preparedStatement.setString(2, pModelProduto.getProDescricao());
            preparedStatement.setInt(3, pModelProduto.getProQuantidade());
            preparedStatement.setString(4, pModelProduto.getProValor());
            preparedStatement.setInt(5, pModelProduto.getProId());
            return preparedStatement.executeUpdate() > 0;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.desconectar();
        }

    }
/**
    * exclui Produto
    * @param pProId
    * @return boolean
    */
    public boolean excluirProdutoDAO(int pProId){
        this.conectar();
        String sql = 
            "DELETE FROM tbl_produto "
                + " WHERE pk_pro_id = ? "
                +";"
            ;
        
        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){
            preparedStatement.setInt(1, pProId);
            return preparedStatement.executeUpdate() > 0;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.desconectar();
        }

    }

}