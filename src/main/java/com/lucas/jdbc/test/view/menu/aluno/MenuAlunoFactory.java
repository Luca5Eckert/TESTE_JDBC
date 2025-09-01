package com.lucas.jdbc.test.view.menu.aluno;

import com.lucas.jdbc.test.model.TipoEntidades;
import com.lucas.jdbc.test.view.menu.abstracoes.*;

public class MenuAlunoFactory implements MenuFactory {

    @Override
    public MenuBuscar instanceBuscar() {
        return null;
    }

    @Override
    public MenuAdicionar instanceAdicionar() {
        return null;
    }

    @Override
    public MenuEditar instanceEditar() {
        return null;
    }

    @Override
    public MenuRemover instanceRemover() {
        return null;
    }

    @Override
    public MenuListar instanceListar() {
        return null;
    }

    @Override
    public TipoEntidades pegarTipo() {
        return TipoEntidades.ALUNO;
    }
}
