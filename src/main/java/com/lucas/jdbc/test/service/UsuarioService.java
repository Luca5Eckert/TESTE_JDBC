package com.lucas.jdbc.test.service;

import com.lucas.jdbc.test.dto.usuario.*;
import com.lucas.jdbc.test.infra.persistence.usuario.mapper.UsuarioMapper;
import com.lucas.jdbc.test.model.Usuario;
import com.lucas.jdbc.test.repository.UsuarioRepositorio;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioService {

    private final UsuarioRepositorio usuarioRepositorio;
    private final UsuarioMapper usuarioMapper;

    public UsuarioService(UsuarioRepositorio usuarioRepositorio, UsuarioMapper usuarioMapper) {
        this.usuarioRepositorio = usuarioRepositorio;
        this.usuarioMapper = usuarioMapper;
    }

    public void inserir(UsuarioAdicionarRequest usuarioRequest){
        Usuario usuario = usuarioMapper.toEntity(usuarioRequest);
        usuarioRepositorio.inserir(usuario);
    }

    public void remover(UsuarioRemoverRequest usuarioRemoverRequest) {
        Usuario usuario = usuarioMapper.toEntity(usuarioRemoverRequest);

        usuarioRepositorio.remover(usuario);
    }

    public void editarEmail(UsuarioEditarEmailRequest usuarioEditarEmailRequest) {
        Usuario usuario = usuarioMapper.toEntity(usuarioEditarEmailRequest);

        usuarioRepositorio.editarEmail(usuario, usuarioEditarEmailRequest.antigoEmail());
    }

    public List<UsuarioGetResponse> listarUsuarios() {
        return usuarioRepositorio.pegarUsuarios().stream().map(usuarioMapper::toResponse).collect(Collectors.toList());
    }

    public UsuarioGetResponse buscarUsuario(UsuarioBuscarPorIdRequest usuarioBuscarPorIdRequest) {
        Usuario usuario = usuarioRepositorio.buscarUsuarioPorId(usuarioMapper.toEntity(usuarioBuscarPorIdRequest));
        return usuarioMapper.toResponse(usuario);
    }
}
