package DAO;

//@author LucasMarcuzo

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ModelUsuario;
import util.ConexaoSQLite;

public class DAOUsuario extends ConexaoSQLite{
    
    //Salvar um novo usuário no BD.
    public boolean salvarUsuarioDAO(ModelUsuario pModelUsuario){
        conectar();
        String sql = "INSERT INTO tbl_usuario("
                + "usu_nome, "
                + "usu_login, "
                + "usu_senha) "
                + "VALUES (?,?,?)";
        
        PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        try 
        {
            preparedStatement.setString(1, pModelUsuario.getUsuNome());
            preparedStatement.setString(2, pModelUsuario.getUsuLogin());
            preparedStatement.setString(3, pModelUsuario.getUsuSenha());
            preparedStatement.executeUpdate();
        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        desconectar();
        return true;
    }
    
    //Retorna a Lista de Usuários cadastrados no BD.
    public List<ModelUsuario> getListaUsuarioDAO(){
        
        ModelUsuario modelUsuario = new ModelUsuario();
        List<ModelUsuario> listaUsuario = new ArrayList<>();
        conectar();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        String sql = "SELECT pk_usu_id,"
                + "usu_nome, "
                + "usu_login, "
                + "usu_senha "
                + "FROM tbl_usuario";
        try 
        {
            preparedStatement = criarPreparedStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next())
            {
                modelUsuario = new ModelUsuario();
                modelUsuario.setUsuId(resultSet.getInt(1));
                modelUsuario.setUsuNome(resultSet.getString(2));
                modelUsuario.setUsuLogin(resultSet.getString(3));
                modelUsuario.setUsuSenha(resultSet.getString(4));
                listaUsuario.add(modelUsuario);
            }
            
        } 
        catch (SQLException ex) 
        {   
            ex.printStackTrace();
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            desconectar();
        }
        return listaUsuario;
    }
    
    //Excluir um Usuário no BD.
    public boolean excluirUsuarioDAO(int pCodigo){
        conectar();
        PreparedStatement preparedStatement;
        String sql = "DELETE FROM tbl_usuario WHERE pk_usu_id = '" + pCodigo + "' ";
        preparedStatement = this.criarPreparedStatement(sql);
        try 
        {
            preparedStatement.executeUpdate();
        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        finally
        {
            if(preparedStatement != null)
            {
                try 
                {
                    preparedStatement.close();
                } 
                catch (SQLException ex) 
                {
                    ex.printStackTrace();
                    Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            this.desconectar();
        }
        return true;
    }
    
    //Alterar um Usuário no BD.
    public ModelUsuario getUsuarioDAO(int pCodigoUsuario){
        ModelUsuario modelUsuario = new ModelUsuario();
        conectar();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        String sql = "SELECT pk_usu_id,"
                    + "usu_nome, "
                    + "usu_login, "
                    + "usu_senha "
                    + "FROM tbl_usuario "
                    + "WHERE pk_usu_id = '"+ pCodigoUsuario +"'";
        
        preparedStatement = criarPreparedStatement(sql);
        try 
        {
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next())
            {
                modelUsuario = new ModelUsuario();
                modelUsuario.setUsuId(resultSet.getInt(1));
                modelUsuario.setUsuNome(resultSet.getString(2));
                modelUsuario.setUsuLogin(resultSet.getString(3));
                modelUsuario.setUsuSenha(resultSet.getString(4));
            }
        } catch (SQLException ex) 
        {
            ex.printStackTrace();
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            desconectar();
        }
        return modelUsuario;
    }
    
    //Atualizar um Usuário no BD.
    public boolean atualizarUsuario(ModelUsuario modelUsuario){
        this.conectar();
        String sql = "UPDATE tbl_usuario SET "
                    + "usu_nome = ?, "
                    + "usu_login = ?, "
                    + "usu_senha = ? "
                    + "WHERE pk_usu_id = '"+ modelUsuario.getUsuId() +"'";
        PreparedStatement preparedStatement = this.criarPreparedStatement(sql);
        try 
        {
            preparedStatement.setString(1, modelUsuario.getUsuNome());
            preparedStatement.setString(2, modelUsuario.getUsuLogin());
            preparedStatement.setString(3, modelUsuario.getUsuSenha());
            preparedStatement.executeUpdate();
        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        finally
        {
            if(preparedStatement != null)
            {
                try 
                {
                    preparedStatement.close();
                } 
                catch (SQLException ex) 
                {
                    ex.printStackTrace();
                    Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            this.desconectar();
        }
        return true;
    }
    
    //Verificando se Usuário existe no BD para fazer Login.
    public boolean validarUsuario(ModelUsuario modelUsuario){
        conectar();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        String sql = "SELECT "
                    + "pk_usu_id,"
                    + "usu_nome, "
                    + "usu_login, "
                    + "usu_senha "
                    + " FROM tbl_usuario "
                    + "WHERE usu_login = '" + modelUsuario.getUsuLogin() + "' AND "
                    + "usu_senha = '" + modelUsuario.getUsuSenha() + "'";
        
        preparedStatement = criarPreparedStatement(sql);
        try 
        {
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
            {
                return true;
            }
            else
            {
                return false;
            }
        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        finally
        {
            try 
            {
                resultSet.close();
                preparedStatement.close();
                this.desconectar();
            } 
            catch (SQLException ex) 
            {
                ex.printStackTrace();
                Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
