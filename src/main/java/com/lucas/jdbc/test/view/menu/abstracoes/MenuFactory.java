package com.lucas.jdbc.test.view.menu.abstracoes;

import com.lucas.jdbc.test.model.TipoEntidades;

public interface MenuFactory {

    MenuBuscar instanceBuscar();

    MenuAdicionar instanceAdicionar();

    MenuEditar instanceEditar();

    MenuRemover instanceRemover();

    MenuListar instanceListar();

    TipoEntidades pegarTipo();

}
