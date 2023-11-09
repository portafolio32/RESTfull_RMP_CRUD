package com.ike.rest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
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

	public Alumnos findById(Long id) {
		// TODO Auto-generated method stub
		return alumnosDAO.findById(id).orElseGet(null);
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

}
