package com.lucas.jdbc.test.view.menu.aluno;

import com.lucas.jdbc.test.infra.utils.BeanUtil;
import com.lucas.jdbc.test.model.TipoEntidades;
import com.lucas.jdbc.test.view.menu.abstracoes.*;

public class MenuAlunoFactory implements MenuFactory {
    private static final MenuAdicionar MENU_ADICIONAR = new MenuAdicionarAluno(BeanUtil.instanceAlunoService());
    private static final MenuBuscar MENU_BUSCAR = new MenuBuscarAluno(BeanUtil.instanceAlunoService());
    private static final MenuListar MENU_LISTAR = new MenuListarAlunos(BeanUtil.instanceAlunoService());
    private static final MenuEditar MENU_EDITAR = new MenuAlterarCursoAluno(BeanUtil.instanceAlunoService());
    private static final MenuRemover MENU_REMOVER = new MenuRemoverAluno(BeanUtil.instanceAlunoService());

    @Override
    public MenuBuscar instanceBuscar() {
        return MENU_BUSCAR;
    }

    @Override
    public MenuAdicionar instanceAdicionar() {
        return MENU_ADICIONAR;
    }

    @Override
    public MenuEditar instanceEditar() {
        return MENU_EDITAR;
    }

    @Override
    public MenuRemover instanceRemover() {
        return MENU_REMOVER;
    }

    @Override
    public MenuListar instanceListar() {
        return MENU_LISTAR;
    }

    @Override
    public TipoEntidades pegarTipo() {
        return TipoEntidades.ALUNO;
    }
}
