package com.lucas.jdbc.test.view.menu;

import com.lucas.jdbc.test.model.TipoEntidades;
import com.lucas.jdbc.test.view.menu.abstracoes.MenuFactory;
import com.lucas.jdbc.test.view.menu.aluno.MenuAlunoFactory;
import com.lucas.jdbc.test.view.menu.usuario.MenuUsuarioFactory;

public class MenuFactoryProvider {

    MenuFactory instanceTo(TipoEntidades tipoEntidades){
        return tipoEntidades.instanceFactory();
    }
}
