package com.lucas.jdbc.test;

import com.lucas.jdbc.test.infra.utils.BeanUtil;
import com.lucas.jdbc.test.view.menu.aluno.MenuAdicionarAluno;
import com.lucas.jdbc.test.view.menu.usuario.MenuAdicionarUsuario;
import com.lucas.jdbc.test.view.menu.usuario.MenuEditarEmailUsuario;
import com.lucas.jdbc.test.view.menu.usuario.MenuRemoverUsuario;

public class Main {

    private static final MenuAdicionarUsuario MENU_ADICIONAR_USUARIO = new MenuAdicionarUsuario(BeanUtil.instanceUsuarioService());
    private static final MenuRemoverUsuario MENU_REMOVER_USUARIO = new MenuRemoverUsuario(BeanUtil.instanceUsuarioService());
    private static final MenuEditarEmailUsuario MENU_EDITAR_EMAIL_USUARIO = new MenuEditarEmailUsuario(BeanUtil.instanceUsuarioService());


    private static final MenuAdicionarAluno MENU_ADICIONAR_ALUNO = new MenuAdicionarAluno(BeanUtil.instanceAlunoService());

    public static void main(String[] args) {
        editarEmailUsuario();
    }

    private static void editarEmailUsuario() {
        MENU_EDITAR_EMAIL_USUARIO.editar();
    }

    private static void removerUsuario() {
        MENU_REMOVER_USUARIO.remover();
    }

    private static void cadastrarAluno() {
        MENU_ADICIONAR_ALUNO.adicionar();
    }

    private static void cadastrarUsuario() {
        MENU_ADICIONAR_USUARIO.adicionar();
    }

}