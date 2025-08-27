package com.lucas.jdbc.test.service;

import com.lucas.jdbc.test.dto.usuario.UsuarioRequest;
import com.lucas.jdbc.test.infra.persistence.usuario.mapper.UsuarioMapper;
import com.lucas.jdbc.test.model.Usuario;
import com.lucas.jdbc.test.repository.UsuarioRepositorio;

public class UsuarioService {

    private final UsuarioRepositorio usuarioRepositorio;
    private final UsuarioMapper usuarioMapper;

    public UsuarioService(UsuarioRepositorio usuarioRepositorio, UsuarioMapper usuarioMapper) {
        this.usuarioRepositorio = usuarioRepositorio;
        this.usuarioMapper = usuarioMapper;
    }

    public void inserir(UsuarioRequest usuarioRequest){
        Usuario usuario = usuarioMapper.toEntity(usuarioRequest);
        usuarioRepositorio.inserir(usuario);
    }

}
