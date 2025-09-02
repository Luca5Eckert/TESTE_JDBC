package com.lucas.jdbc.test.view;

import com.lucas.jdbc.test.infra.exceptions.GlobalExceptionHandler;
import com.lucas.jdbc.test.view.menu.abstracoes.Menu;

public class MenuProvider {
    private Menu menu;

    public MenuProvider(Menu menu){
        this.menu = menu;
    }

    public boolean verificarContinuidade() {
        return menu != null;
    }

    public void executarMenu() {
        try{
            menu = menu.executarMenu();
        } catch (Exception exception){
            GlobalExceptionHandler.tratarExcecao(exception);
        }
    }

    private void tratarExceções(Exception exception) {
        System.out.println("ERRO!");
        System.out.println(exception.getMessage());
    }
}
