package com.lucas.jdbc.test.infra.persistence.usuario.dao;

import com.lucas.jdbc.test.infra.database.Conexao;
import com.lucas.jdbc.test.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDao {

    public void inserir(Usuario usuario){
        String sql = "INSERT INTO usuarios (nome, email) VALUES (?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.executeUpdate();

            System.out.println("Usuário inserido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void remover(Usuario usuario) {
        String sql = "DELETE FROM usuarios WHERE email = (?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getEmail());

            stmt.executeUpdate();

            System.out.println("Usuário deletado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void editarEmail(Usuario usuario, String antigoEmail) {
        String sql = "UPDATE usuarios SET email = ? WHERE email = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getEmail());
            stmt.setString(2, antigoEmail);
            stmt.executeUpdate();

            System.out.println("Email atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
