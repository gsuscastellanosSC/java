package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Vehiculo implements Serializable {
	
	private static final long serialVersionUID = -481640634061073832L;
	
	private TipoVehiculo tipo;
	private Integer capacidad;
	private Double peso;
	private List<Persona> tripulantes;
	
	public Vehiculo(TipoVehiculo tipo, Integer capacidad, Double peso) {
		this.tipo = tipo;
		this.capacidad = capacidad;
		this.peso = peso;
		this.tripulantes = new ArrayList<>();
	}
	
	public TipoVehiculo getTipo() {
		return tipo;
	}
	public void setTipo(TipoVehiculo tipo) {
		this.tipo = tipo;
	}
	public Integer getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public List<Persona> getTripulantes() {
		if (null == tripulantes ) {
			tripulantes = new ArrayList<>();
		}
		return tripulantes;
	}
	public void setTripulantes(List<Persona> tripulantes) {
		this.tripulantes = tripulantes;
	}	
}
