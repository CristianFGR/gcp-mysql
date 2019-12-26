package com.ragnax.testdatabase.service.impl;

import com.ragnax.testdatabase.domain.Comentario;
import com.ragnax.testdatabase.repository.ComentarioRepository;
import com.ragnax.testdatabase.service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cgonzalezr on 26-12-19.
 */
@Service
public class ComentarioServiceImpl implements ComentarioService {

    @Autowired
    private ComentarioRepository comentarioRepository;

    public List<Comentario> obtenerComentarios(){
        return comentarioRepository.findAll();
    }
}
