package com.lucas.jdbc.test.dto.usuario;

public record UsuarioGetResponse(long id, String nome, String email) {

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Email: " + email ;
    }
}
