package com.lucas.jdbc.test.view.menu.aluno;

import com.lucas.jdbc.test.dto.aluno.AlunoResponse;
import com.lucas.jdbc.test.service.AlunoService;
import com.lucas.jdbc.test.view.menu.abstracoes.MenuListar;

import java.util.List;


public class MenuListarAlunos implements MenuListar {

    private final AlunoService alunoService;

    public MenuListarAlunos(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @Override
    public void listar() {
        List<AlunoResponse> alunoResponseList = alunoService.listarUsuarios();

        alunoResponseList.forEach(System.out::println);
    }
}
