package com.lucas.jdbc.test.infra.persistence.aluno.mapper;


import com.lucas.jdbc.test.dto.aluno.AlunoBuscarRequest;
import com.lucas.jdbc.test.dto.aluno.AlunoEditarCursoRequest;
import com.lucas.jdbc.test.dto.aluno.AlunoRequest;
import com.lucas.jdbc.test.dto.aluno.AlunoResponse;
import com.lucas.jdbc.test.model.Aluno;

public class AlunoMapper {

    public Aluno toEntity(AlunoRequest alunoRequest){
        Aluno aluno = new Aluno();

        aluno.setNome(alunoRequest.nome());
        aluno.setCurso(alunoRequest.curso());
        aluno.setMatricula(alunoRequest.matricula());

        return aluno;
    }

    public Aluno toEntity(AlunoEditarCursoRequest alunoEditarCursoRequest){
        Aluno aluno = new Aluno();

        aluno.setCurso(alunoEditarCursoRequest.cursoNovo());
        aluno.setMatricula(alunoEditarCursoRequest.matricula());

        return aluno;
    }

    public AlunoResponse toResponse(Aluno aluno) {
        return new AlunoResponse(aluno.getId(), aluno.getNome(), aluno.getMatricula(), aluno.getCurso());
    }

    public Aluno toEntity(AlunoBuscarRequest alunoBuscarRequest) {
        Aluno aluno = new Aluno();
        aluno.setMatricula(alunoBuscarRequest.matricula());
        return aluno;
    }

}
