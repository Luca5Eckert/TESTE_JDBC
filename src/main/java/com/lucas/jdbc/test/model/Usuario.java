package com.lucas.jdbc.test.model;

public class Usuario {

    private final long id;
    private String nome;
    private String email;

    public Usuario(long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Usuario() {
        this.id = -1;
        this.nome = null;
        this.email = null;
    }

    public Usuario(long id) {
        this.id = id;
        this.nome = null;
        this.email = null;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
