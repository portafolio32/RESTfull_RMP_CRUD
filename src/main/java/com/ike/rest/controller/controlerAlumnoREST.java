package com.ike.rest.controller;


import java.util.List;

import javax.transaction.Transactional;

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
	

	@GetMapping("/alumnos/{nombre}")
	public Alumnos show(@PathVariable String nombre) {
		// TODO Auto-generated method stub
		return alumnosService.filtrobyNombre(nombre);
	}
	
	@PostMapping("/alumnos")
	@ResponseStatus(HttpStatus.CREATED)
	public Alumnos create(@RequestBody Alumnos user) {
		return alumnosService.save(user);
		
	}
	
	@PutMapping("/alumnos/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Alumnos update(@RequestBody Alumnos alumno, @PathVariable Long id) {
		Alumnos alumnoActual = alumnosService.findById(id);
		alumnoActual.setMatricula(alumnoActual.getMatricula());
		alumnoActual.setApellidoPaterno(alumnoActual.getApellidoPaterno());
		alumnoActual.setApellidoMaterno(alumnoActual.getApellidoMaterno());
		alumnoActual.setNombre(alumnoActual.getNombre());
		return alumnosService.save(alumnoActual);
	}
	
	@PutMapping("/calificacion/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Calificacion update(@RequestBody Calificacion calificacion, @PathVariable Long id) {
		Calificacion materiaActual = calificacionService.findById(id);
		materiaActual.setEspañol(calificacion.getEspañol());
		materiaActual.setBiologia(calificacion.getBiologia());
		materiaActual.setFisica(calificacion.getFisica());
		materiaActual.setMatematica(calificacion.getMatematica());
		materiaActual.setQuimica(calificacion.getQuimica());
		
		return calificacionService.save(materiaActual);
	}
		



	@DeleteMapping("/alumnos/{id}")
	@ResponseStatus(HttpStatus.OK)
    public void deleteAlumno(@PathVariable Long id) {
		alumnosService.delete(id);
	}
	
	
	
	
}
