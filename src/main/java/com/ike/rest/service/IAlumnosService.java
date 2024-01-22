package com.ike.rest.service;

import java.util.List;
import java.util.Optional;

import com.ike.rest.entidad.Alumnos;

public interface IAlumnosService {
	
    public List<Alumnos> findAll();
	
	public Alumnos findById(Long id);

	public Alumnos save(Alumnos Alumno);
	
	 public Alumnos filtrobyNombre(String name);
	
	public void delete(Long id);

	Optional<Alumnos> findbyName(String name);

}
