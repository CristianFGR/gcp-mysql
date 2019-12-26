package com.ragnax.testdatabase.service.impl;

import com.ragnax.testdatabase.domain.Usuario;
import com.ragnax.testdatabase.repository.UsuarioRepository;
import com.ragnax.testdatabase.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by cgonzalezr on 26-12-19.
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public ArrayList<Usuario> obtenerTodosUsuarios() {
        return (ArrayList<Usuario>) usuarioRepository.findAll();
    }
}
