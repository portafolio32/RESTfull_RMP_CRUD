package com.ike.rest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ike.rest.dao.ICalificacionDAO;
import com.ike.rest.entidad.Calificacion;
@Service
public class calificacionService implements ICalificacionService{
	@Autowired
	private ICalificacionDAO calificacionDAO;

	@Override
	@Transactional

	public List<Calificacion> findAll() {
		// TODO Auto-generated method stub
		return (List<Calificacion>) calificacionDAO.findAll();

	}

	@Override
	@Transactional

	public Calificacion findById(Long id) {
		// TODO Auto-generated method stub
		return calificacionDAO.findById(id).orElseGet(null);

	}

	@Override
	@Transactional

	public Calificacion save(Calificacion cal) {
		// TODO Auto-generated method stub
		return calificacionDAO.save(cal);
	}

	@Override
	@Transactional

	public void delete(Long Matricula) {
		// TODO Auto-generated method stub
		calificacionDAO.deleteById(Matricula);

		
	}

}
