package com.ike.rest.dao;

import org.springframework.data.repository.CrudRepository;

import com.ike.rest.entidad.Alumnos;
import com.ike.rest.entidad.Calificacion;

public interface ICalificacionDAO extends CrudRepository<Calificacion,Long>{

}
