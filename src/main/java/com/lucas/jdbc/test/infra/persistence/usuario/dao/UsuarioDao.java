package com.lucas.jdbc.test.infra.persistence.usuario.dao;

import com.lucas.jdbc.test.infra.database.Conexao;
import com.lucas.jdbc.test.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public List<Usuario> pegarUsuarios() {
        String sql = "SELECT id,nome,email FROM usuarios";
        List<Usuario> usuarios = new ArrayList<>();
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");

                Usuario usuario = new Usuario(id, nome, email);
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    public Usuario buscarUsuarioPorId(Usuario usuario) {
        String sql = "SELECT id, nome, email FROM usuarios WHERE id = ?";
        long newId = 0;
        String nome = "";
        String email = "";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setLong(1, usuario.getId());

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                newId = rs.getLong("id");
                nome = rs.getString("nome");
                email = rs.getString("email");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new Usuario(newId, nome, email);
    }
}
