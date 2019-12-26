package com.ragnax.testdatabase.service;

import com.ragnax.testdatabase.domain.Usuario;

import java.util.ArrayList;

/**
 * Created by cgonzalezr on 26-12-19.
 */
public interface UsuarioService {

    ArrayList<Usuario> obtenerTodosUsuarios();

}
