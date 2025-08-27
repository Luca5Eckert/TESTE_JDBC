package com.lucas.jdbc.test.view.menu.usuario;

import com.lucas.jdbc.test.dto.usuario.UsuarioRemoverRequest;
import com.lucas.jdbc.test.service.UsuarioService;
import com.lucas.jdbc.test.view.menu.MenuRemover;

import java.util.Scanner;

public class MenuRemoverUsuario implements MenuRemover {

    private final UsuarioService usuarioService;

    public MenuRemoverUsuario(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @Override
    public void remover() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o email do usuária a remover: ");
        String email = scanner.nextLine();

        usuarioService.remover(new UsuarioRemoverRequest(email));
    }
}
