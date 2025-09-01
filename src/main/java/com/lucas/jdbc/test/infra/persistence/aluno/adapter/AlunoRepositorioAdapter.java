package com.lucas.jdbc.test.infra.persistence.aluno.adapter;

import com.lucas.jdbc.test.infra.persistence.aluno.dao.AlunoDao;
import com.lucas.jdbc.test.model.Aluno;
import com.lucas.jdbc.test.repository.AlunoRepositorio;

public class AlunoRepositorioAdapter implements AlunoRepositorio {

    private final AlunoDao alunoDao;

    public AlunoRepositorioAdapter(AlunoDao alunoDao) {
        this.alunoDao = alunoDao;
    }

    @Override
    public void inserir(Aluno aluno) {
        alunoDao.inserir(aluno);
    }

    @Override
    public void remover(String matricula) {

    }
}
