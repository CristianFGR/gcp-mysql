package com.ragnax.testdatabase.repository;

import com.ragnax.testdatabase.domain.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by cgonzalezr on 26-12-19.
 */
@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
