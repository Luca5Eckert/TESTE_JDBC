package com.lucas.jdbc.test.infra.persistence.usuario.adapter;

import com.lucas.jdbc.test.infra.persistence.usuario.dao.UsuarioDAO;
import com.lucas.jdbc.test.model.Usuario;
import com.lucas.jdbc.test.repository.UsuarioRepositorio;

public class UsuarioRepositorioAdapter implements UsuarioRepositorio {

    private final UsuarioDAO usuarioDAO;

    public UsuarioRepositorioAdapter(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    @Override
    public void inserirUsuario(Usuario usuario){
        usuarioDAO.inserirUsuario(usuario);
    }
}
