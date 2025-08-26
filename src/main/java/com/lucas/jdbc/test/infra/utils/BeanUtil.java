package com.lucas.jdbc.test.infra.utils;

import com.lucas.jdbc.test.infra.persistence.usuario.dao.UsuarioDAO;
import com.lucas.jdbc.test.infra.persistence.usuario.adapter.UsuarioRepositorioAdapter;
import com.lucas.jdbc.test.infra.persistence.usuario.mapper.UsuarioMapper;
import com.lucas.jdbc.test.repository.UsuarioRepositorio;
import com.lucas.jdbc.test.service.UsuarioService;

public class BeanUtil {
    private final static UsuarioDAO USUARIO_DAO = new UsuarioDAO();
    private final static UsuarioRepositorio USUARIO_REPOSITORIO = new UsuarioRepositorioAdapter(USUARIO_DAO);
    private final static UsuarioMapper USUARIO_MAPPER = new UsuarioMapper();
    private final static UsuarioService USUARIO_SERVICE = new UsuarioService(USUARIO_REPOSITORIO, USUARIO_MAPPER);

    public static UsuarioService instanceUsuarioService(){
        return USUARIO_SERVICE;
    }
}
