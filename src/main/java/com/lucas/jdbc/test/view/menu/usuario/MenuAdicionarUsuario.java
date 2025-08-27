package com.lucas.jdbc.test.view.menu.usuario;

import com.lucas.jdbc.test.dto.usuario.UsuarioAdicionarRequest;
import com.lucas.jdbc.test.service.UsuarioService;
import com.lucas.jdbc.test.view.menu.MenuAdicionar;

import java.util.Scanner;

public class MenuAdicionarUsuario implements MenuAdicionar {

    private final UsuarioService usuarioService;

    public MenuAdicionarUsuario(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @Override
    public void adicionar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do usuário: ");
        String nome = scanner.nextLine();

        System.out.println("Email do usuário");
        String email = scanner.nextLine();

        UsuarioAdicionarRequest usuario = new UsuarioAdicionarRequest(nome, email);

        usuarioService.inserir(usuario);
    }
}
