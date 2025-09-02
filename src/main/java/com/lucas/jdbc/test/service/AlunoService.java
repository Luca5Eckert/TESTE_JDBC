package com.lucas.jdbc.test.service;

import com.lucas.jdbc.test.dto.aluno.*;
import com.lucas.jdbc.test.dto.usuario.*;
import com.lucas.jdbc.test.infra.persistence.aluno.mapper.AlunoMapper;
import com.lucas.jdbc.test.model.Aluno;
import com.lucas.jdbc.test.model.Usuario;
import com.lucas.jdbc.test.repository.AlunoRepositorio;

import java.util.List;
import java.util.stream.Collectors;

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

    public void remover(AlunoRemoverRequest alunoRemoverRequest){
        alunoRepositorio.remover(alunoRemoverRequest.matricula());
    }


    public void editar(AlunoEditarCursoRequest alunoEditarCursoRequest) {
        Aluno aluno = alunoMapper.toEntity(alunoEditarCursoRequest);

        alunoRepositorio.editar(aluno, alunoEditarCursoRequest.matricula());
    }

    public List<AlunoResponse> listarUsuarios() {
        return alunoRepositorio.pegarAlunos().stream().map(alunoMapper::toResponse).collect(Collectors.toList());
    }

    public AlunoResponse buscarUsuario(AlunoBuscarRequest alunoBuscarRequest) {
        Aluno aluno = alunoMapper.toEntity(alunoBuscarRequest);

        Aluno alunoBuscado = alunoRepositorio.buscar(aluno);

        return alunoMapper.toResponse(alunoBuscado);
    }

}
