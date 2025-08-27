package com.lucas.jdbc.test.infra.persistence.usuario.mapper;

import com.lucas.jdbc.test.dto.usuario.UsuarioRequest;
import com.lucas.jdbc.test.model.Usuario;

public class UsuarioMapper {

    public Usuario toEntity(UsuarioRequest usuarioRequest){
        Usuario usuario = new Usuario();

        usuario.setNome(usuarioRequest.nome());
        usuario.setEmail(usuarioRequest.email());

        return usuario;
    }
}
