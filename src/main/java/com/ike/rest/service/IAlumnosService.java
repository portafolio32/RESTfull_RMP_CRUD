package com.ike.rest.service;

import java.util.List;

import com.ike.rest.entidad.Alumnos;

public interface IAlumnosService {
	
    public List<Alumnos> findAll();
	
	public Alumnos findById(Long id);

	public Alumnos save(Alumnos Alumno);
	
	public void delete(Long id);

}
