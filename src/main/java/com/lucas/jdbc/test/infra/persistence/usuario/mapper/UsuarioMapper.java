package com.lucas.jdbc.test.infra.persistence.usuario.mapper;

import com.lucas.jdbc.test.dto.usuario.*;
import com.lucas.jdbc.test.model.Usuario;

import java.util.function.Function;

public class UsuarioMapper {


    public Usuario toEntity(UsuarioAdicionarRequest usuarioRequest){
        Usuario usuario = new Usuario();

        usuario.setNome(usuarioRequest.nome());
        usuario.setEmail(usuarioRequest.email());

        return usuario;
    }

    public UsuarioGetResponse toResponse(Usuario usuario){
        return new UsuarioGetResponse(usuario.getId(), usuario.getNome(), usuario.getEmail());
    }

    public Usuario toEntity(UsuarioRemoverRequest usuarioRequest){
        Usuario usuario = new Usuario();

        usuario.setEmail(usuarioRequest.email());

        return usuario;
    }

    public Usuario toEntity(UsuarioEditarEmailRequest usuarioEditarEmailRequest) {
        Usuario usuario = new Usuario();

        usuario.setEmail(usuarioEditarEmailRequest.novoEmail());

        return usuario;
    }

    public Usuario toEntity(UsuarioBuscarPorIdRequest usuarioBuscarPorIdRequest) {
        return new Usuario(usuarioBuscarPorIdRequest.id());
    }

}
