package com.lucas.jdbc.test.view.menu;

import com.lucas.jdbc.test.view.menu.abstracoes.Menu;
import com.lucas.jdbc.test.view.menu.abstracoes.MenuFactory;

import java.util.Scanner;

public class MenuInicial implements Menu {

    private final MenuFactory menuFactory;

    public MenuInicial(MenuFactory menuFactory) {
        this.menuFactory = menuFactory;
    }

    @Override
    public Menu executarMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println(" " + menuFactory.pegarTipo());
        System.out.println("-------------------------");
        System.out.println(" 1 - Adicionar");
        System.out.println(" 2 - Buscar");
        System.out.println(" 3 - Remover");
        System.out.println(" 4 - Editar");
        System.out.println(" 5 - Listar");
        System.out.println("\n 0 - Sair");
        System.out.println("-------------------------");
        String input = scanner.nextLine();

        pegarMenu(input);

        return devolverMenu(input);
    }

    private Menu devolverMenu(String input) {
        if(input.equals("0")){
            return new MenuGeral();
        }
        return this;
    }

    private void pegarMenu(String s) {
        switch (s){
            case "1" -> adicionar();
            case "2" -> buscar();
            case "3" -> remover();
            case "4" -> editar();
            case "5" -> listar();
        };
    }

    private void listar() {
        menuFactory.instanceListar().listar();
    }

    private void editar() {
        menuFactory.instanceEditar().editar();
    }

    private void remover() {
        menuFactory.instanceRemover().remover();
    }

    private void buscar() {
        menuFactory.instanceBuscar().buscar();
    }

    private void adicionar() {
        menuFactory.instanceAdicionar().adicionar();
    }

}
