package com.ragnax.testdatabase.service.impl;

import com.ragnax.testdatabase.domain.Publicacion;
import com.ragnax.testdatabase.repository.PublicacionRepository;
import com.ragnax.testdatabase.service.PublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cgonzalezr on 26-12-19.
 */
@Service
public class PublicacionServiceImpl implements PublicacionService {

    @Autowired
    private PublicacionRepository publicacionRepository;

    @Override
    public List<Publicacion> obtenerPublicaciones(){
        return publicacionRepository.findAll();
    }

}
