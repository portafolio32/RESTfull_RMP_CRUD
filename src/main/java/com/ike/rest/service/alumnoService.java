package com.ike.rest.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.ike.rest.dao.IAlumnosDAO;
import com.ike.rest.entidad.Alumnos;
@Service
public class alumnoService implements IAlumnosService {
	@Autowired
	private IAlumnosDAO alumnosDAO;
	@Override
	@Transactional

	public List<Alumnos> findAll() {
		// TODO Auto-generated method stub
		return (List<Alumnos>) alumnosDAO.findAll();

	}


	@Override
	@Transactional

	public Alumnos save(Alumnos Alumno) {
		// TODO Auto-generated method stub
		return alumnosDAO.save(Alumno);
	}

	@Override
	@Transactional

	public void delete(Long id) {
		// TODO Auto-generated method stub
		alumnosDAO.deleteById(id);
	}

	@Override
	@Transactional
	public Alumnos findById(Long id) {
		// TODO Auto-generated method stub
		return alumnosDAO.findById(id).orElse(null);
	}
	@Override
	@Transactional
	public Alumnos filtrobyNombre(String nombre) {
		// TODO Auto-generated method stub
		return alumnosDAO.filtrobyNombre(nombre);
	}


	@Override
	public Optional<Alumnos> findbyName(String name) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}


}
