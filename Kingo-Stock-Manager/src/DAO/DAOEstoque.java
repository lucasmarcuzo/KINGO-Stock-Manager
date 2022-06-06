package DAO;

import util.IReport;
import model.ModelEstoque;
import util.ConexaoSQLite;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static util.OpcoesRelatorios.caminhoAplicacao;

/**
*
* @author LucasMarcuzo
*/
public class DAOEstoque extends ConexaoSQLite {
    
    private static ArrayList<ModelEstoque> listamodelEstoque;
    
    /**
    * grava Estoque
    * @param pModelEstoque
    * @return int
    */
    public boolean salvarEstoqueDAO(ModelEstoque pModelEstoque){
        this.conectar();
        String sql = 
            "INSERT INTO tbl_estoque ("
                    + "est_responsavel,"
                    + "est_tipo_mov,"
                    + "est_descricao,"
                    + "est_quantidade,"
                    + "est_valor,"
                    + "fk_pro_id,"
                    + "fk_usu_id"
                + ") VALUES (?,?,?,?,?,?,?);"
            ;
        
        try (PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            preparedStatement.setString(1, pModelEstoque.getEstResponsavel());
            preparedStatement.setString(2, pModelEstoque.getEstTipoMov());
            preparedStatement.setString(3, pModelEstoque.getEstDescricao());
            preparedStatement.setInt(4, pModelEstoque.getEstQuantidade());
            preparedStatement.setString(5, pModelEstoque.getEstValor());
            preparedStatement.setInt(6, pModelEstoque.getFkProId());
            preparedStatement.setInt(7, pModelEstoque.getFkUsuId());
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
    * recupera Estoque
    * @param pEstId
    * @return ModelEstoque
    */
    public ModelEstoque getEstoqueDAO(int pEstId){
        ModelEstoque modelEstoque = null;

        String sql = "SELECT "
                    + "pk_est_id,"
                    + "est_responsavel,"
                    + "est_tipo_mov,"
                    + "est_descricao,"
                    + "est_quantidade,"
                    + "est_valor,"
                    + "fk_pro_id,"
                    + "fk_usu_id"
                 + " FROM"
                     + " tbl_estoque"
                 + " WHERE"
                     + " pk_est_id = ?"
                + ";"
            ;

        this.conectar();

        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){
            
            preparedStatement.setInt(1, pEstId);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {modelEstoque = new ModelEstoque();
                modelEstoque.setEstId(resultSet.getInt(1));
                modelEstoque.setEstResponsavel(resultSet.getString(2));
                modelEstoque.setEstTipoMov(resultSet.getString(3));
                modelEstoque.setEstDescricao(resultSet.getString(4));
                modelEstoque.setEstQuantidade(resultSet.getInt(5));
                modelEstoque.setEstValor(resultSet.getString(6));
                modelEstoque.setFkProId(resultSet.getInt(7));
                modelEstoque.setFkUsuId(resultSet.getInt(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.desconectar();
        }
        return modelEstoque;
    }

    /**
    * Recupera uma lista de dbEstoque.
    * @return ArrayList
    */
    public ArrayList<ModelEstoque> getListaEstoqueDAO(){
        listamodelEstoque = new ArrayList<>();
        ModelEstoque modelEstoque = null;

        String sql = "SELECT "
                    + "pk_est_id,"
                    + "est_responsavel,"
                    + "est_tipo_mov,"
                    + "est_descricao,"
                    + "est_quantidade,"
                    + "est_valor,"
                    + "fk_pro_id,"
                    + "fk_usu_id"
                 + " FROM"
                     + " tbl_estoque"
                + ";";

        this.conectar();

        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                modelEstoque = new ModelEstoque();
                modelEstoque.setEstId(resultSet.getInt(1));
                modelEstoque.setEstResponsavel(resultSet.getString(2));
                modelEstoque.setEstTipoMov(resultSet.getString(3));
                modelEstoque.setEstDescricao(resultSet.getString(4));
                modelEstoque.setEstQuantidade(resultSet.getInt(5));
                modelEstoque.setEstValor(resultSet.getString(6));
                modelEstoque.setFkProId(resultSet.getInt(7));
                modelEstoque.setFkUsuId(resultSet.getInt(8));
                listamodelEstoque.add(modelEstoque);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.desconectar();
        }
        return listamodelEstoque;
    }
    
    /**
    * Realiza uma pesquisa no dbEstoque
    * @param pesquisa
    * @param localPesquisa
    * @return ArrayList
    */
    public ArrayList<ModelEstoque> getListaEstoqueDAO(String pesquisa, String localPesquisa){
        listamodelEstoque = new ArrayList<>();
        ModelEstoque modelEstoque = null;
        
        switch(localPesquisa){
            case "CÓDIGO":
                localPesquisa = "pk_est_id";
                break;
            case "RESPONSÁVEL":
                localPesquisa = "est_responsavel";
                break;
            case "TIPO":
                localPesquisa = "est_tipo_mov";
                break;
            case "DESCRIÇÃO DO PRODUTO":
                localPesquisa = "est_descricao";
                break;
            case "QUANTIDADE":
                localPesquisa = "est_quantidade";
                break;
            case "VALOR":
                localPesquisa = "est_valor";
                break;
            default:
                return null;
        }
        
        String sql = "SELECT "
                    + "pk_est_id,"
                    + "est_responsavel,"
                    + "est_tipo_mov,"
                    + "est_descricao,"
                    + "est_quantidade,"
                    + "est_valor,"
                    + "fk_pro_id,"
                    + "fk_usu_id"
                 + " FROM"
                     + " tbl_estoque"
                + " WHERE "+ localPesquisa +" LIKE "+ pesquisa +" "
                + ";";

        this.conectar();

        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                modelEstoque = new ModelEstoque();
                modelEstoque.setEstId(resultSet.getInt(1));
                modelEstoque.setEstResponsavel(resultSet.getString(2));
                modelEstoque.setEstTipoMov(resultSet.getString(3));
                modelEstoque.setEstDescricao(resultSet.getString(4));
                modelEstoque.setEstQuantidade(resultSet.getInt(5));
                modelEstoque.setEstValor(resultSet.getString(6));
                modelEstoque.setFkProId(resultSet.getInt(7));
                modelEstoque.setFkUsuId(resultSet.getInt(8));
                listamodelEstoque.add(modelEstoque);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.desconectar();
        }
        return listamodelEstoque;
    }

    /**
    * atualiza Estoque
    * @param pModelEstoque
    * @return boolean
    */
    public boolean atualizarEstoqueDAO(ModelEstoque pModelEstoque){
        this.conectar();
        String sql = 
            "UPDATE tbl_estoque SET "
                    + "pk_est_id = ?,"
                    + "est_responsavel = ?,"
                    + "est_tipo_mov = ?,"
                    + "est_descricao = ?,"
                    + "est_quantidade = ?,"
                    + "est_valor = ?,"
                    + "fk_pro_id = ?,"
                    + "fk_usu_id = ?"
                + " WHERE pk_est_id = ? "
                +";"
            ;
        
        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){
            preparedStatement.setInt(1, pModelEstoque.getEstId());
            preparedStatement.setString(2, pModelEstoque.getEstResponsavel());
            preparedStatement.setString(3, pModelEstoque.getEstTipoMov());
            preparedStatement.setString(4, pModelEstoque.getEstDescricao());
            preparedStatement.setInt(5, pModelEstoque.getEstQuantidade());
            preparedStatement.setString(6, pModelEstoque.getEstValor());
            preparedStatement.setInt(7, pModelEstoque.getFkProId());
            preparedStatement.setInt(8, pModelEstoque.getFkUsuId());
            preparedStatement.setInt(9, pModelEstoque.getEstId());
            return preparedStatement.executeUpdate() > 0;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.desconectar();
        }

    }
    
    /**
    * exclui Estoque
    * @param pEstId
    * @return boolean
    */
    public boolean excluirEstoqueDAO(int pEstId){
        this.conectar();
        String sql = 
            "DELETE FROM tbl_estoque "
                + " WHERE pk_est_id = ? "
                +";"
            ;
        
        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){
            preparedStatement.setInt(1, pEstId);
            return preparedStatement.executeUpdate() > 0;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.desconectar();
        }
    }
    
    /**
    * Emite Relatorio Estoque
    * @param salvarImprimir
    */
    public void emitirRelatorioDAO(int salvarImprimir){         
        try
        {   
            if(this.conectar())
            {
                String reportName = caminhoAplicacao() + "\\Relatorios\\teste1.jrxml";
                IReport.viewReport(reportName, salvarImprimir);
                this.desconectar();
            }
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Erro!", JOptionPane.ERROR_MESSAGE);
        } 
    }
}