package controllers;

import dto.UsuarioDTO;
import dao.UsuarioDAOImpl;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import util.GestorException;

public class GestorUsuario {

    EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("com.sistema-login");
    EntityManager manager = managerFactory.createEntityManager();
    
    private UsuarioDAOImpl usuarioImpl;
    
    public boolean validacionUsuario (String id, String clave) {
        try {
            usuarioImpl = new UsuarioDAOImpl(manager);
            UsuarioDTO usuarioDTO = new UsuarioDTO(Integer.parseInt(id), clave);
            return !usuarioImpl.buscarUsuarioLogin(usuarioDTO).isEmpty();
        } catch (Exception e) {
            throw new GestorException("Error: Validar Usuario", e);
        }
    }
}
