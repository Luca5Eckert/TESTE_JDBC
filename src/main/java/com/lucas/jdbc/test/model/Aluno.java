package com.lucas.jdbc.test.model;

public class Aluno {

    private final long id;
    private String nome;
    private String matricula;
    private String curso;


    public Aluno() {
        this.id = -1;
    }

    public Aluno(long id, String nome, String matricula, String curso) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
