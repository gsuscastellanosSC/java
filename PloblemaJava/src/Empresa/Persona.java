package Empresa;

import java.awt.List;

public class Persona {
	private String nombre;
	private String genero; 
	private int edad;
	private float peso;
	private int cantidadPersonas;
	
	public Persona(String nombre, String genero, int edad, float peso) {
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.peso = peso;
		this.cantidadPersonas = cantidadPersonas;
	}
	
	public void subirPersona(String nombre, String genero, int edad, float peso, int cantidadPersonas) {
		this.nombre = nombre;
		
	}
	
	
	public void bajar(/*String nombre, String genero, int edad, float peso, int cantidadPersonas*/) {
		System.out.println(nombre + " " + genero+ " " +edad+ " " +peso+ " " +cantidadPersonas);
	}
	
	
	public void VerPersonasFueraVehiculo(String nombre, String genero, int edad, float peso, int cantidadPersonas) {
		System.out.println(nombre + " " + genero+ " " +edad+ " " +peso+ " " +cantidadPersonas);
	}
}
