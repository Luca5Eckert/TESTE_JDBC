package com.lucas.jdbc.test.infra.persistence.aluno.mapper;


import com.lucas.jdbc.test.dto.aluno.AlunoRequest;
import com.lucas.jdbc.test.model.Aluno;

public class AlunoMapper {

    public Aluno toEntity(AlunoRequest alunoRequest){
        Aluno aluno = new Aluno();

        aluno.setNome(alunoRequest.nome());
        aluno.setCurso(alunoRequest.curso());
        aluno.setMatricula(alunoRequest.matricula());

        return aluno;
    }
}
