package com.lucas.jdbc.test.infra.persistence.usuario.adapter;

import com.lucas.jdbc.test.infra.persistence.usuario.dao.UsuarioDao;
import com.lucas.jdbc.test.model.Usuario;
import com.lucas.jdbc.test.repository.UsuarioRepositorio;

public class UsuarioRepositorioAdapter implements UsuarioRepositorio {

    private final UsuarioDao usuarioDAO;

    public UsuarioRepositorioAdapter(UsuarioDao usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    @Override
    public void inserir(Usuario usuario){
        usuarioDAO.inserir(usuario);
    }

    @Override
    public void remover(Usuario usuario) {
        usuarioDAO.remover(usuario);
    }
}
