package com.lucas.jdbc.test.view.menu.usuario;

import com.lucas.jdbc.test.infra.utils.BeanUtil;
import com.lucas.jdbc.test.model.TipoEntidades;
import com.lucas.jdbc.test.view.menu.abstracoes.*;

public class MenuUsuarioFactory implements MenuFactory {
    private final static MenuAdicionar MENU_ADICIONAR = new MenuAdicionarUsuario(BeanUtil.instanceUsuarioService());
    private final static MenuRemover MENU_REMOVER = new MenuRemoverUsuario(BeanUtil.instanceUsuarioService());
    private final static MenuEditar MENU_EDITAR = new MenuEditarEmailUsuario(BeanUtil.instanceUsuarioService());
    private final static MenuListar MENU_LISTAR = new MenuListarUsuarios(BeanUtil.instanceUsuarioService());
    private final static MenuBuscar MENU_BUSCAR = new MenuBuscarPorIdUsuario(BeanUtil.instanceUsuarioService());

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
        return TipoEntidades.USUARIO;
    }

}
