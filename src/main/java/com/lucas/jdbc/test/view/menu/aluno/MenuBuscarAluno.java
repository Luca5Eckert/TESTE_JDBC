package com.lucas.jdbc.test.view.menu.aluno;

import com.lucas.jdbc.test.dto.aluno.AlunoBuscarRequest;
import com.lucas.jdbc.test.dto.aluno.AlunoResponse;
import com.lucas.jdbc.test.service.AlunoService;
import com.lucas.jdbc.test.view.menu.abstracoes.MenuBuscar;

import java.util.Scanner;

public class MenuBuscarAluno implements MenuBuscar {

    private final AlunoService alunoService;

    public MenuBuscarAluno(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @Override
    public void buscar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Número da matricula: ");
        String matricula = scanner.nextLine();

        AlunoResponse alunoResponse = alunoService.buscarUsuario(new AlunoBuscarRequest(matricula));

        System.out.println("----------------------------------------------------");
        System.out.println(alunoResponse);
        System.out.println("----------------------------------------------------");

    }
}
