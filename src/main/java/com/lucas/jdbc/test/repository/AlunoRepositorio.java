package com.lucas.jdbc.test.repository;

import com.lucas.jdbc.test.model.Aluno;

import java.util.List;

public interface AlunoRepositorio {

    public void inserir(Aluno aluno);

    void remover(String matricula);

    Aluno buscar(Aluno aluno);

    List<Aluno> pegarAlunos();

    void editar(Aluno aluno, String matricula);

}
