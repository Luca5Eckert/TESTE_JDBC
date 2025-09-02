package com.lucas.jdbc.test.model;

import com.lucas.jdbc.test.view.menu.abstracoes.MenuFactory;
import com.lucas.jdbc.test.view.menu.aluno.MenuAlunoFactory;
import com.lucas.jdbc.test.view.menu.usuario.MenuUsuarioFactory;

import java.util.Arrays;

public enum TipoEntidades {
    USUARIO(new MenuUsuarioFactory()),
    ALUNO(new MenuAlunoFactory());

    MenuFactory menuFactory;

    private TipoEntidades(MenuFactory menuFactory){
        this.menuFactory = menuFactory;
    }

    public static TipoEntidades pegarTipo(int i) {
        if(i >= TipoEntidades.values().length || i < 0){
            throw new RuntimeException("Input invalido");
        }
        return TipoEntidades.values()[i];
    }

    public MenuFactory instanceFactory(){
        return menuFactory;
    }

    public static void listar() {
        int i = 0;
        for(TipoEntidades tipoEntidades : TipoEntidades.values()){
            System.out.println(" " + i++  + " - " + tipoEntidades);
        }
    }
}
