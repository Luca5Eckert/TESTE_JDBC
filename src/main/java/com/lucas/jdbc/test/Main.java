package com.lucas.jdbc.test;

import com.lucas.jdbc.test.view.menu.MenuGeral;
import com.lucas.jdbc.test.view.menu.abstracoes.Menu;

public class Main {

    public static void main(String[] args) {
        Menu menu = new MenuGeral();
        while (true){
            menu = menu.executarMenu();
            menu.executarMenu();
        }
    }
}
