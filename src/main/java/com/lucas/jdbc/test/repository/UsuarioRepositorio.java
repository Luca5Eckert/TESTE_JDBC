package com.lucas.jdbc.test.repository;

import com.lucas.jdbc.test.dto.usuario.UsuarioBuscarPorIdRequest;
import com.lucas.jdbc.test.dto.usuario.UsuarioGetResponse;
import com.lucas.jdbc.test.model.Usuario;

import java.util.List;

public interface UsuarioRepositorio {

    public void inserir(Usuario usuario);

    void remover(Usuario usuario);

    void editarEmail(Usuario usuario, String antigoEmail);

    List<Usuario> pegarUsuarios();

    Usuario buscarUsuarioPorId(Usuario usuario);
}
