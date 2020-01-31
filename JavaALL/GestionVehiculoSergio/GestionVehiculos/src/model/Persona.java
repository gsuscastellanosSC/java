package model;

import java.io.Serializable;

public class Persona implements Serializable {
	
	private static final long serialVersionUID = -217660466092068008L;
	
	private String nombre;
	private String genero;
	private Integer edad;
	private Double peso;
	private Boolean estaEnVehiculo;
	
	public Persona(String nombre, String genero, Integer edad, Double peso) {
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.peso = peso;
		this.estaEnVehiculo = false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Boolean isEstaEnVehiculo() {
		return estaEnVehiculo;
	}

	public void setEstaEnVehiculo(Boolean estaEnVehiculo) {
		this.estaEnVehiculo = estaEnVehiculo;
	}
}