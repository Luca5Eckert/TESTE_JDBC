package com.lucas.jdbc.test.infra.persistence.aluno.adapter;

import com.lucas.jdbc.test.infra.persistence.aluno.dao.AlunoDao;
import com.lucas.jdbc.test.model.Aluno;
import com.lucas.jdbc.test.repository.AlunoRepositorio;

import java.util.List;

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
        alunoDao.remover(matricula);
    }

    @Override
    public Aluno buscar(Aluno aluno) {
        return alunoDao.buscarAluno(aluno);
    }

    @Override
    public List<Aluno> pegarAlunos() {
        return alunoDao.pegarAlunos();
    }

    @Override
    public void editar(Aluno aluno, String matricula) {
        alunoDao.atualizar(aluno, matricula);
    }
}
