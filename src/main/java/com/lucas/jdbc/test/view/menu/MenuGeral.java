package com.lucas.jdbc.test.view.menu;

import com.lucas.jdbc.test.model.TipoEntidades;
import com.lucas.jdbc.test.view.menu.abstracoes.Menu;
import com.lucas.jdbc.test.view.menu.abstracoes.MenuFactory;

import java.util.Scanner;

public class MenuGeral implements Menu{
    private final static MenuFactoryProvider menuFactoryProvider = new MenuFactoryProvider();

    public Menu executarMenu(){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Escolhe que entidade deseja acessar menu: ");
        TipoEntidades.listar();

        TipoEntidades tipoEntidades = TipoEntidades.values()[scanner.nextInt()];
        scanner.nextLine();

        MenuFactory menuFactory = menuFactoryProvider.instanceTo(tipoEntidades);

        return new MenuInicial(menuFactory);
    }
}
