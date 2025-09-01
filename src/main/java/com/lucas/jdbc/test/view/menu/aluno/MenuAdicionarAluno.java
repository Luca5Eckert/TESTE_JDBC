package com.lucas.jdbc.test.view.menu.aluno;

import com.lucas.jdbc.test.dto.aluno.AlunoRequest;
import com.lucas.jdbc.test.service.AlunoService;
import com.lucas.jdbc.test.view.menu.abstracoes.MenuAdicionar;

import java.util.Scanner;

public class MenuAdicionarAluno implements MenuAdicionar {

    private final AlunoService alunoService;

    public MenuAdicionarAluno(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @Override
    public void adicionar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Matricula do aluno");
        String matricula = scanner.nextLine();

        System.out.println("Curso do aluno");
        String curso = scanner.nextLine();

        AlunoRequest alunoRequest = new AlunoRequest(nome, matricula, curso);

        alunoService.inserir(alunoRequest);
    }
}
