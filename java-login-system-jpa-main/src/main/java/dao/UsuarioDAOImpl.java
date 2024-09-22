package dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import dto.UsuarioDTO;
import java.util.Collections;
import java.util.List;
import javax.persistence.NoResultException;
import models.Usuario;
import util.DAOException;

public class UsuarioDAOImpl implements UsuarioDAO{

    private final EntityManager entityManager;
    
    public UsuarioDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    @Override
    public void altaUsuario(UsuarioDTO usuarioDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> buscarUsuario() {
        try{
            String consulta = "SELECT c FROM Cliente c";
            TypedQuery<Usuario> query = (TypedQuery<Usuario>) entityManager.createQuery(consulta);
            return query.getResultList();
        } catch (NoResultException e) {
            return Collections.emptyList();
        } catch (Exception e) {
            throw new DAOException("Error: Buscar Usuario", e);
        }
    }

    @Override
    public List<Usuario> buscarUsuarioLogin(UsuarioDTO usuarioDTO) {
        try{
            String consulta = "SELECT u FROM Usuario u WHERE u.id = :id AND u.clave = :clave";
            TypedQuery<Usuario> query = (TypedQuery<Usuario>) entityManager.createQuery(consulta);
            query.setParameter("id", usuarioDTO.getId());
            query.setParameter("clave", usuarioDTO.getClave());
            return query.getResultList();
        } catch (NoResultException e) {
            return Collections.emptyList();
        } catch (Exception e) {
            throw new DAOException("Error: Buscat Usuario p/Login", e);
        }
    }

    @Override
    public void modificarUsuario(UsuarioDTO usuarioDTO, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarUsuario(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}