package controller;

//@author LucasMarcuzo

import DAO.DAOUsuario;
import java.util.List;
import model.ModelUsuario;

public class ControllerUsuario {
    
    DAOUsuario daoUsuario = new DAOUsuario();
    
    //Salvar um usuário no BD. (DAOUsuario)
    public boolean salvarUsuarioController(ModelUsuario modelUsuario) {
        return this.daoUsuario.salvarUsuarioDAO(modelUsuario);
    }
    
    //Retornar Lista de Usuários. (DAOUsuario)
    public List<ModelUsuario> getListaUsuariosController() {
        return this.daoUsuario.getListaUsuarioDAO();
    }

    //Exclui Usuário do BD. (DAOUsuario)
    public boolean excluirUsuarioController(int pcodigo) {
        return this.daoUsuario.excluirUsuarioDAO(pcodigo);
    }
    
    //Alterar Usuário do BD. (DAOUsuario)
    public ModelUsuario getUsuarioController(int pcodigo) {
        return this.daoUsuario.getUsuarioDAO(pcodigo);
    }
    
    //Atualizar Usuário do BD (DAOUsuario)
    public boolean atualizarUsuarioController(ModelUsuario modelUsuario) {
        return this.daoUsuario.atualizarUsuario(modelUsuario);
    }
    
    //Validar Usuário do Login no BD (ViewLogin)
    public boolean validarUsuarioController(ModelUsuario modelUsuario) {
        return this.daoUsuario.validarUsuario(modelUsuario);
    }
    
}
