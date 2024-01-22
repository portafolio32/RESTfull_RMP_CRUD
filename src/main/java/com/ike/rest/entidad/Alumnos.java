package com.ike.rest.entidad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table
public class Alumnos implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long Matricula;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	@OneToMany(fetch=FetchType.LAZY,mappedBy="matricula",cascade=CascadeType.ALL)
	List< Calificacion> materias;



		public Alumnos() {
		this.materias = new ArrayList<>();
	}
		public List<Calificacion> getCalificaciones() {
		return materias;
	}
	public void setCalificaciones(List<Calificacion> calificaciones) {
		this.materias = calificaciones;
	}
		public Alumnos(String nombre,String apellidoP,String apellidoM) {
			this.nombre=nombre;
			this.apellidoPaterno=apellidoP;
			this.apellidoMaterno=apellidoM;
	}
		public Long getMatricula() {
		return Matricula;
	}
	public void setMatricula(Long id) {
		this.Matricula = Matricula;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}


}
