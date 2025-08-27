package com.lucas.jdbc.test.infra.utils;

import com.lucas.jdbc.test.infra.persistence.aluno.adapter.AlunoRepositorioAdapter;
import com.lucas.jdbc.test.infra.persistence.aluno.dao.AlunoDao;
import com.lucas.jdbc.test.infra.persistence.aluno.mapper.AlunoMapper;
import com.lucas.jdbc.test.infra.persistence.usuario.dao.UsuarioDao;
import com.lucas.jdbc.test.infra.persistence.usuario.adapter.UsuarioRepositorioAdapter;
import com.lucas.jdbc.test.infra.persistence.usuario.mapper.UsuarioMapper;
import com.lucas.jdbc.test.repository.AlunoRepositorio;
import com.lucas.jdbc.test.repository.UsuarioRepositorio;
import com.lucas.jdbc.test.service.AlunoService;
import com.lucas.jdbc.test.service.UsuarioService;

public class BeanUtil {

    private final static UsuarioDao USUARIO_DAO = new UsuarioDao();
    private final static UsuarioRepositorio USUARIO_REPOSITORIO = new UsuarioRepositorioAdapter(USUARIO_DAO);
    private final static UsuarioMapper USUARIO_MAPPER = new UsuarioMapper();
    private final static UsuarioService USUARIO_SERVICE = new UsuarioService(USUARIO_REPOSITORIO, USUARIO_MAPPER);

    private final static AlunoDao ALUNO_DAO = new AlunoDao();
    private final static AlunoRepositorio ALUNO_REPOSITORIO = new AlunoRepositorioAdapter(ALUNO_DAO);
    private final static AlunoMapper ALUNO_MAPPER = new AlunoMapper();
    private final static AlunoService ALUNO_SERVICE = new AlunoService(ALUNO_REPOSITORIO, ALUNO_MAPPER);




    public static UsuarioService instanceUsuarioService(){
        return USUARIO_SERVICE;
    }

    public static AlunoService instanceAlunoService(){
        return ALUNO_SERVICE;
    }
}
