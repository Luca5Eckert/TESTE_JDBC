package com.lucas.jdbc.test.view.menu;

public interface MenuFactory {

    MenuBuscar instanceBuscar();

    MenuAdicionar instanceAdicionar();

    MenuEditar instanceEditar();

    MenuRemover instanceRemover();

    MenuListar instanceListar();

}
