package com.ike.rest.service;

import java.util.List;

import com.ike.rest.entidad.Alumnos;
import com.ike.rest.entidad.Calificacion;

public interface ICalificacionService {
	 public List<Calificacion> findAll();
		
		public Calificacion findById(Long Matricula);

		public Calificacion save(Calificacion cal);
		
		public void delete(Long Matricula);

}
