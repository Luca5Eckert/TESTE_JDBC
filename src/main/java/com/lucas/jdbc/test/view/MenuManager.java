package com.lucas.jdbc.test.view;

public class MenuManager {
    private final MenuProvider menuProvider;

    public MenuManager(MenuProvider menuProvider) {
        this.menuProvider = menuProvider;
    }

    public void iniciarFluxoMenu(){
        while(menuProvider.verificarContinuidade()){
            menuProvider.executarMenu();
        }
    }
}
