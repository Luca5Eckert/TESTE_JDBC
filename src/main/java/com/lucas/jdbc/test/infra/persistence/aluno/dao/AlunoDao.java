package com.lucas.jdbc.test.infra.persistence.aluno.dao;

import com.lucas.jdbc.test.infra.database.Conexao;
import com.lucas.jdbc.test.model.Aluno;
import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDao {

    public void inserir(Aluno aluno){
        String sql = "INSERT INTO alunos (nome, matricula, curso) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getMatricula());
            stmt.setString(3, aluno.getCurso());
            stmt.executeUpdate();

            System.out.println("Aluno inserido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void remover(String matricula) {
        String sql = "DELETE FROM alunos WHERE matricula = (?)";

        try (Connection connection = Conexao.conectar();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, matricula);
            preparedStatement.executeUpdate();

            System.out.println("Aluno deletado com sucesso");

        } catch (SQLException e) {
            throw new RuntimeException("Aluno não encontrado");
        }

    }

    public void atualizar(Aluno aluno, String novoMatricula) {
        String sql = "UPDATE alunos SET curso = (?) WHERE matricula = (?)";

        try(Connection connection = Conexao.conectar();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setString(1, aluno.getCurso());
            preparedStatement.setString(2, novoMatricula);

            preparedStatement.executeUpdate();

            System.out.println("Aluno alterado com sucesso");

        } catch (SQLException e) {
            throw new RuntimeException("Aluno não encontrado");
        }

    }

    public List<Aluno> pegarAlunos(){
        String sql = "SELECT id, nome, matricula, curso FROM alunos";
        List<Aluno> alunoList = new ArrayList<>();

        try(Connection connection = Conexao.conectar();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                Aluno aluno = new Aluno(resultSet.getInt("id"));

                aluno.setNome(resultSet.getString("nome"));
                aluno.setMatricula(resultSet.getString("matricula"));
                aluno.setCurso(resultSet.getString("curso"));

                alunoList.add(aluno);
            }

            System.out.println("Alunos buscados com sucesso");

            return alunoList;

        } catch (SQLException e) {
            throw new RuntimeException("Alunos não encontrados");
        }

    }

    public Aluno buscarAluno(Aluno aluno){
        String sql = "SELECT id, nome, curso, matricula FROM alunos WHERE matricula = (?)";
        Aluno alunoBusca = null;

        try(Connection connection = Conexao.conectar();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setString(1, aluno.getMatricula());

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                alunoBusca = new Aluno(resultSet.getLong("id"));

                alunoBusca.setNome(resultSet.getString("nome"));
                alunoBusca.setMatricula(resultSet.getString("matricula"));
                alunoBusca.setCurso(resultSet.getString("curso"));

            }
            System.out.println("Aluno buscado com sucesso");
            return alunoBusca;

        } catch (SQLException sqlException){
            throw new RuntimeException("Alunos não encontrado");

        }

    }

}
