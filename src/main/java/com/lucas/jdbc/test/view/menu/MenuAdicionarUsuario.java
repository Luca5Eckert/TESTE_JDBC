package com.lucas.jdbc.test.view.menu;

import com.lucas.jdbc.test.dto.usuario.UsuarioRequest;
import com.lucas.jdbc.test.service.UsuarioService;

import java.util.Scanner;

public class MenuAdicionarUsuario {

    private final UsuarioService usuarioService;

    public MenuAdicionarUsuario(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public void cadastrarUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do usuário: ");
        String nome = scanner.nextLine();

        System.out.println("Email do usuário");
        String email = scanner.nextLine();

        UsuarioRequest usuario = new UsuarioRequest(nome, email);

        usuarioService.inserirUsuario(usuario);
    }
}
