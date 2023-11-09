package com.ike.rest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ike.rest.entidad.Alumnos;
import com.ike.rest.entidad.Calificacion;
import com.ike.rest.service.IAlumnosService;
import com.ike.rest.service.ICalificacionService;

@CrossOrigin(origins= {"http://localhost:4200"})

@RestController
@RequestMapping("/api")
public class controlerAlumnoREST {
	@Autowired
	private IAlumnosService alumnosService;
	@Autowired
	private ICalificacionService calificacionService;
	@GetMapping("/alumnos")
	public List<Alumnos> index() {
		// TODO Auto-generated method stub
		return alumnosService.findAll();
	}
	
	@GetMapping("/alumnos/{id}")
	public Alumnos show(@PathVariable Long id) {
		
		return alumnosService.findById(id);
	}
	
	@PutMapping("/calificacion/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Calificacion update(@RequestBody Calificacion calificacion, @PathVariable Long id) {
		Calificacion materiaActual = calificacionService.findById(id);
		materiaActual.setMatricula(calificacion.getMatricula());
		materiaActual.setBiologia(calificacion.getBiologia());
		materiaActual.setFisica(calificacion.getFisica());
		materiaActual.setMatematica(calificacion.getMatematica());
		materiaActual.setQuimica(calificacion.getQuimica());
		
		return calificacionService.save(materiaActual);
	}
		
	@PostMapping("/alumnos")
	@ResponseStatus(HttpStatus.CREATED)
	public Alumnos create(@RequestBody Alumnos cliente) {
		return alumnosService.save(cliente);
		
	}


	@DeleteMapping("/alumnos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAlumno(@PathVariable Long id) {
		alumnosService.delete(id);
	}
	
	@DeleteMapping("/materia/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMateria(@PathVariable Long id) {
		calificacionService.delete(id);
	}
	
	
}
