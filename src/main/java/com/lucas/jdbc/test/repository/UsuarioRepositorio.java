package com.lucas.jdbc.test.repository;

import com.lucas.jdbc.test.model.Usuario;

public interface UsuarioRepositorio {

    public void inserir(Usuario usuario);

    void remover(Usuario usuario);
}
