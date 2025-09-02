package com.lucas.jdbc.test.view.menu.aluno;

import com.lucas.jdbc.test.dto.aluno.AlunoEditarCursoRequest;
import com.lucas.jdbc.test.service.AlunoService;
import com.lucas.jdbc.test.view.menu.abstracoes.MenuEditar;

import java.util.Scanner;

public class MenuAlterarCursoAluno implements MenuEditar {

    private final AlunoService alunoService;

    public MenuAlterarCursoAluno(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @Override
    public void editar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Digite a matricula do aluno que deseja alterar: ");
        String matricula = scanner.nextLine();

        System.out.println(" Digite o novo curso dele: ");
        String novoCurso = scanner.nextLine();

        alunoService.editar(new AlunoEditarCursoRequest(novoCurso, matricula));
    }
}
