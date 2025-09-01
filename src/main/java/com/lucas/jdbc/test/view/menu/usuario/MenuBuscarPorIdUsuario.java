package com.lucas.jdbc.test.view.menu.usuario;

import com.lucas.jdbc.test.dto.usuario.UsuarioBuscarPorIdRequest;
import com.lucas.jdbc.test.dto.usuario.UsuarioGetResponse;
import com.lucas.jdbc.test.service.UsuarioService;
import com.lucas.jdbc.test.view.menu.abstracoes.MenuBuscar;

import java.util.Scanner;

public class MenuBuscarPorIdUsuario implements MenuBuscar {

    private final UsuarioService usuarioService;

    public MenuBuscarPorIdUsuario(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @Override
    public void buscar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o id do usuário que deseja buscar: ");
        long id = scanner.nextLong();

        UsuarioGetResponse usuarioGetResponse = usuarioService.buscarUsuario(new UsuarioBuscarPorIdRequest(id));

        System.out.println("--------------------------------");
        System.out.println(" Usuário devolvido: ");
        System.out.println(usuarioGetResponse);
        System.out.println("--------------------------------");

    }

}
