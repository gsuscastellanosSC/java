package Empresa.model;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	private String nombre;
	private String genero; 
	private int edad;
	private float peso;
	private static int cantidadPersonas;
	private String tipoVehiculo;
	public static List<Persona> personas = new ArrayList<Persona>();
	public static List<Persona> personasEnVehiculos = new ArrayList<Persona>();
		
	public Persona(String nombre, String genero, int edad, float peso) {
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.peso = peso;
	}
	
	public static void verDatosPersonas(List<Persona> alistPersonas) {
		if(alistPersonas.isEmpty()) {
			System.out.println("No hay personas fuera de los vehículos \n");
		}else {
			for (Persona persona : alistPersonas) {
				System.out.println("Nombre: "+persona.getNombre()+", Genero: "+persona.getGenero()+", Edad: "+persona.getEdad()+" Años, Peso: "+persona.getPeso() +" Kilogramos") ;
			}
		}
	}
	public static boolean validaSiExistePersona(String namePersona, List<Persona> arrList) {
		boolean valida = false;
		for (int i = 0; i < arrList.size(); i++) {
			if(arrList.get(i).getNombre().equalsIgnoreCase(namePersona)) {
				valida = true;
				i = personas.size();
			}
		}
		return valida;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public static int getCantidadPersonas() {
		return cantidadPersonas;
	}

	public static void setCantidadPersonas(int cantidadPersonas) {
		Persona.cantidadPersonas = cantidadPersonas;
	}
	
	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
}
