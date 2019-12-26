package com.ragnax.testdatabase.controller;

import com.ragnax.testdatabase.domain.Usuario;
import com.ragnax.testdatabase.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by cgonzalezr on 26-12-19.
 */
@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("usuarios")
    public ArrayList<Usuario> getUsuarios() {
        return usuarioService.obtenerTodosUsuarios();
    }
}
