package com.lucas.jdbc.test.service;

import com.lucas.jdbc.test.dto.aluno.AlunoRequest;
import com.lucas.jdbc.test.infra.persistence.aluno.mapper.AlunoMapper;
import com.lucas.jdbc.test.model.Aluno;
import com.lucas.jdbc.test.repository.AlunoRepositorio;

public class AlunoService {

    private final AlunoRepositorio alunoRepositorio;
    private final AlunoMapper alunoMapper;

    public AlunoService(AlunoRepositorio alunoRepositorio, AlunoMapper alunoMapper) {
        this.alunoRepositorio = alunoRepositorio;
        this.alunoMapper = alunoMapper;
    }

    public void inserir(AlunoRequest alunoRequest) {
        Aluno aluno = alunoMapper.toEntity(alunoRequest);
        alunoRepositorio.inserir(aluno);
    }

}
