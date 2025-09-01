package com.lucas.jdbc.test;

import com.lucas.jdbc.test.view.MenuManager;
import com.lucas.jdbc.test.view.MenuProvider;
import com.lucas.jdbc.test.view.menu.MenuGeral;
import com.lucas.jdbc.test.view.menu.abstracoes.Menu;

public class Main {

    public static void main(String[] args) {

        MenuManager menuManager = new MenuManager(new MenuProvider(new MenuGeral()));

        menuManager.iniciarFluxoMenu();

    }
}
