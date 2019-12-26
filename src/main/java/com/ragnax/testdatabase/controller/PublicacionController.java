package com.ragnax.testdatabase.controller;

import com.ragnax.testdatabase.domain.Publicacion;
import com.ragnax.testdatabase.service.PublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by cgonzalezr on 26-12-19.
 */
@Repository
public class PublicacionController {

    @Autowired
    private PublicacionService publicacionService;

    @GetMapping("publicaciones")
    public List<Publicacion> obtenerPublicaciones(){
        return publicacionService.obtenerPublicaciones();
    }

}
