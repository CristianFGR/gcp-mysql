package com.ragnax.testdatabase.repository;

import com.ragnax.testdatabase.domain.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by cgonzalezr on 26-12-19.
 */
@Repository
public interface PublicacionRepository extends JpaRepository<Publicacion, Long> {

}
