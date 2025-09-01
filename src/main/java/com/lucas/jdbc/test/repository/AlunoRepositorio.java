package com.lucas.jdbc.test.repository;

import com.lucas.jdbc.test.model.Aluno;

public interface AlunoRepositorio {

    public void inserir(Aluno aluno);

    void remover(String matricula);
}
