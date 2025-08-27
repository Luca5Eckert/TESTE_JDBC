package com.lucas.jdbc.test.view.menu.usuario;

import com.lucas.jdbc.test.dto.usuario.UsuarioGetResponse;
import com.lucas.jdbc.test.service.UsuarioService;
import com.lucas.jdbc.test.view.menu.MenuListar;

import java.util.List;

public class MenuListarUsuarios implements MenuListar {

    private final UsuarioService usuarioService;

    public MenuListarUsuarios(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @Override
    public void listar() {
        List<UsuarioGetResponse> listaUsuarios = usuarioService.listarUsuarios();

        System.out.println("--------------------");
        System.out.println(" Usuários: ");
        listaUsuarios.stream().forEach(System.out::println);
        System.out.println("--------------------");
    }
}
