package com.itu.MarinDemo.repositories;

import com.itu.MarinDemo.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
    // Anotacion metodo de query
    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);
    boolean existsByDNI(int dni);

    // Anotacion JPQL parametros indexados
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%?1%' OR p.apellido LIKE '%?1%' ")
    List<Persona> search(String filtro);

    // Anotacon JPQL parametros nombrados
//    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%:filtro%' OR p.apellido LIKE '%:filtro%' ")
//    List<Persona> searc(@Param("filtro") String filtro);

    @Query(
            value = "SELECT * FROM Persona WHERE persona.nombre LIKE '%?1%' OR persona.apellido LIKE '%?1%' ",
            nativeQuery = true
    )
    List<Persona> searc(String filtro);

}
