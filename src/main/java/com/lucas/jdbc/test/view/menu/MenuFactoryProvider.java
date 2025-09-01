package com.lucas.jdbc.test.view.menu;

import com.lucas.jdbc.test.model.TipoEntidades;
import com.lucas.jdbc.test.view.menu.abstracoes.MenuFactory;
import com.lucas.jdbc.test.view.menu.aluno.MenuAlunoFactory;
import com.lucas.jdbc.test.view.menu.usuario.MenuUsuarioFactory;

public class MenuFactoryProvider {
    public final static MenuFactory MENU_USUARIO_FACTORY = new MenuUsuarioFactory();
    public final static MenuFactory MENU_ALUNO_FACTORY = new MenuAlunoFactory();


    MenuFactory instanceTo(TipoEntidades tipoEntidades){
        return switch (tipoEntidades){
            case USUARIO -> MENU_USUARIO_FACTORY;
            case ALUNO -> MENU_ALUNO_FACTORY;
        };
    }
}
