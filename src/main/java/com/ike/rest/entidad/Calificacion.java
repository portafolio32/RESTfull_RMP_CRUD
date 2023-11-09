package com.ike.rest.entidad;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Materias")
public class Calificacion implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Matricula;
	private int Matematica;
	private int Quimica;
	private int Biologia;
	private int Fisica;
	private Alumnos alumnos;

	public int getMatematica() {
		return Matematica;
	}
	public void setMatematica(int matematica) {
		Matematica = matematica;
	}
	public int getQuimica() {
		return Quimica;
	}
	public void setQuimica(int quimica) {
		Quimica = quimica;
	}
	public int getBiologia() {
		return Biologia;
	}
	public void setBiologia(int biologia) {
		Biologia = biologia;
	}
	public int getFisica() {
		return Fisica;
	}
	public void setFisica(int fisica) {
		Fisica = fisica;
	}


	public Alumnos getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(Alumnos alumnos) {
		this.alumnos = alumnos;
	}
	public Long getMatricula() {
		return Matricula;
	}
	public void setMatricula(Long matricula) {
		Matricula = matricula;
	}

	

}
