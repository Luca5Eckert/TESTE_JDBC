package com.lucas.jdbc.test.view.menu.usuario;

import com.lucas.jdbc.test.dto.usuario.UsuarioEditarEmailRequest;
import com.lucas.jdbc.test.service.UsuarioService;
import com.lucas.jdbc.test.view.menu.abstracoes.MenuEditar;

import java.util.Scanner;

public class MenuEditarEmailUsuario implements MenuEditar {

    private final UsuarioService usuarioService;

    public MenuEditarEmailUsuario(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @Override
    public void editar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o email do usuário que deseja alterar: ");
        String emailBusca = scanner.nextLine();

        System.out.println("Digite o novo email: ");
        String novoEmail = scanner.nextLine();

        UsuarioEditarEmailRequest usuarioEditarEmailRequest = new UsuarioEditarEmailRequest(emailBusca, novoEmail);

        usuarioService.editarEmail(usuarioEditarEmailRequest);

    }
}
