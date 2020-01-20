package model;

import java.io.Serializable;

public class TipoVehiculo implements Serializable {
	
	private static final long serialVersionUID = -418056084866624792L;
	
	private String nombre;
	
	public TipoVehiculo(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
