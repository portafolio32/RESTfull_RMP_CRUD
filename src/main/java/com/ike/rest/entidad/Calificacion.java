package com.ike.rest.entidad;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Materias")
public class Calificacion implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private int Español;
	private int Matematica;
	private int Quimica;
	private int Biologia;
	private int Fisica;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="matricula")
	private Alumnos matricula;

	public Calificacion(Long id, int matematica, int quimica, int biologia, int fisica, Alumnos matricula) {
		super();
		this.id = id;
		Matematica = matematica;
		Quimica = quimica;
		Biologia = biologia;
		Fisica = fisica;
		this.matricula = matricula;
	}
	public Calificacion() {
		super();
	}
	
	public int getEspañol() {
		return Español;
	}
	public void setEspañol(int español) {
		Español = español;
	}
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




	

}
