package util;

//@author LucasMarcuzo

import java.sql.PreparedStatement;
import java.sql.SQLException;


public final class Limpeza extends ConexaoSQLite {
    
    public boolean limparBD(){
        
        this.conectar();
        
        String sql1 = "DELETE FROM tbl_estoque";
        String sql2 = "DELETE FROM tbl_produto";
        String sql3 = "DELETE FROM tbl_usuario WHERE pk_usu_id > 1 ";
        String atzAutoIncremento1 = "UPDATE SQLITE_SEQUENCE SET SEQ=0 WHERE NAME='tbl_estoque' OR NAME='tbl_produto' ";
        String atzAutoIncremento2 = "UPDATE SQLITE_SEQUENCE SET SEQ=1 WHERE NAME='tbl_usuario' ";
        
        try
        {
            PreparedStatement ps1 = criarPreparedStatement(sql1);
            ps1.executeUpdate();
            PreparedStatement ps2 = criarPreparedStatement(sql2);
            ps2.executeUpdate();
            PreparedStatement ps3 = criarPreparedStatement(sql3);
            ps3.executeUpdate();
            PreparedStatement ai1 = criarPreparedStatement(atzAutoIncremento1);
            ai1.executeUpdate();
            PreparedStatement ai2 = criarPreparedStatement(atzAutoIncremento2);
            ai2.executeUpdate();
            return true;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return false;
        }
        finally
        {
            this.desconectar();
        }
    }
}
