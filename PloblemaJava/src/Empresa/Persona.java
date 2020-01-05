package Empresa;

import java.awt.List;
import java.util.ArrayList;

public class Persona {
	private String nombre;
	private String genero; 
	private int edad;
	private float peso;
	private int cantidadPersonas;
	static public java.util.List<Persona> Personas = new ArrayList<Persona>();
	
	public Persona(String nombre, String genero, int edad, float peso) {
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.peso = peso;
		this.cantidadPersonas = cantidadPersonas;
	}
	
	public void VerPersonasFueraVehiculo() {
		System.out.println(nombre + ", " + genero+ ", " +edad+ " Años, " +peso+ " Kg");
	}
}
