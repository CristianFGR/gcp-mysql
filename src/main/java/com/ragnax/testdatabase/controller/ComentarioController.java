package com.ragnax.testdatabase.controller;

import com.ragnax.testdatabase.domain.Comentario;
import com.ragnax.testdatabase.service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by cgonzalezr on 26-12-19.
 */
@RestController
public class ComentarioController {

    @Autowired
    private ComentarioService comentarioService;

    @GetMapping("comentarios")
    public List<Comentario> obtenerComentarios(){
        return comentarioService.obtenerComentarios();
    }

}
