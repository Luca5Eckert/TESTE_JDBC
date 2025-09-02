package com.lucas.jdbc.test.dto.aluno;

public record AlunoResponse(long id, String nome, String matricula, String curso) {

    @Override
    public String toString() {
        return "Id: " + id + " | Nome: " + nome + " | Matricula: " + matricula + " | Curso: " + curso;
    }
}
