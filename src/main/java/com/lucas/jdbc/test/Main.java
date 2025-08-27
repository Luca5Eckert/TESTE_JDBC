package com.lucas.jdbc.test;

import com.lucas.jdbc.test.infra.utils.BeanUtil;
import com.lucas.jdbc.test.view.menu.MenuAdicionarAluno;
import com.lucas.jdbc.test.view.menu.MenuAdicionarUsuario;

public class Main {

    private static final MenuAdicionarUsuario menuAdicionarUsuario = new MenuAdicionarUsuario(BeanUtil.instanceUsuarioService());
    private static final MenuAdicionarAluno menuAdicionarAluno = new MenuAdicionarAluno(BeanUtil.instanceAlunoService());

    public static void main(String[] args) {
        cadastrarUsuario();
    }

    private static void cadastrarUsuario() {
        menuAdicionarUsuario.adicionar();
        menuAdicionarAluno.adicionar();
    }

}