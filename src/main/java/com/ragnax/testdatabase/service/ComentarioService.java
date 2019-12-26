package com.ragnax.testdatabase.service;

import com.ragnax.testdatabase.domain.Comentario;

import java.util.List;

/**
 * Created by cgonzalezr on 26-12-19.
 */
public interface ComentarioService {

    List<Comentario> obtenerComentarios();
}
