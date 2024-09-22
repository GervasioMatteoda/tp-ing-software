package dao;

import dto.UsuarioDTO;
import java.util.List;
import models.Usuario;

public interface UsuarioDAO {

    void altaUsuario (UsuarioDTO usuarioDTO);
    List<Usuario> buscarUsuario ();
    List<Usuario> buscarUsuarioLogin (UsuarioDTO usuarioDTO);
    void modificarUsuario (UsuarioDTO usuarioDTO, int id);
    void eliminarUsuario (int id);
}
