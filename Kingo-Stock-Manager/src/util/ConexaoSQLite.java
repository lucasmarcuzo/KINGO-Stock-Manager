package util;

//@author LucasMarcuzo

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexaoSQLite {
    
    public static Connection conexao;
    
    //Conecta a um BD (Cria um novo caso não exista).
    public boolean conectar(){
        try 
        {
            String url = "jdbc:sqlite:db/dbestoque.db";              
            this.conexao = DriverManager.getConnection(url);
            
            System.out.println("Conectado ao BD!");
        
        } catch (SQLException ex) 
        {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex, "Erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;         
    }
    
    //Desconecta de um BD.
    public boolean desconectar(){
        try 
        {
            if(this.conexao.isClosed() == false)
            {
                this.conexao.close();
            }
            System.out.println("Desconectado do BD!");
        } 
        catch (SQLException ex) 
        {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex, "Erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;         
    }
     
    //Criando Statements para os sqls serem executados.
    public Statement criarStatement(){
        try
        {
            return this.conexao.createStatement();
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Erro!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public PreparedStatement criarPreparedStatement(String pSQL, int RETURN_GENERATED_KEYS){
        try 
        {
            return conexao.prepareStatement(pSQL, RETURN_GENERATED_KEYS);
        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex, "Erro!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public PreparedStatement criarPreparedStatement(String sql){
        try
        {
            return this.conexao.prepareStatement(sql);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Erro!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public Connection getConexao(){
        return this.conexao;
    }
}
