package com.lucas.jdbc.test.view.menu.aluno;

import com.lucas.jdbc.test.dto.aluno.AlunoRemoverRequest;
import com.lucas.jdbc.test.service.AlunoService;
import com.lucas.jdbc.test.view.menu.abstracoes.MenuRemover;

import java.util.Scanner;

public class MenuRemoverAluno implements MenuRemover {

    private final AlunoService alunoService;

    public MenuRemoverAluno(AlunoService alunoService) {
        this.alunoService = alunoService;
    }


    @Override
    public void remover() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Digite a matricula do aluno que deseja remover: ");
        alunoService.remover(new AlunoRemoverRequest(scanner.nextLine()));
    }
}
