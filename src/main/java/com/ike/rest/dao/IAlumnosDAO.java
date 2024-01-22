package com.ike.rest.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ike.rest.entidad.Alumnos;


public interface IAlumnosDAO extends CrudRepository<Alumnos,Long>{
    @Query("select p from Alumnos p where p.nombre  LIKE %?1%")
    public Alumnos filtrobyNombre(String name);
    

}
