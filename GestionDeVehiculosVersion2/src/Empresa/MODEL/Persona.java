package Empresa.MODEL;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	private String nombre;
	private String genero; 
	private int edad;
	private float peso;
	private String tipo_vehiculo;
	
	public static List<Persona> personas = new ArrayList<Persona>();
	public static List<Persona> personasVehiculo = new ArrayList<Persona>();
	
	public Persona(String nombre, String genero, int edad, float peso) {
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.peso = peso;
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
	
	public String getTipo_vehiculo() {
		return tipo_vehiculo;
	}

	public void setTipo_vehiculo(String tipo_vehiculo) {
		this.tipo_vehiculo = tipo_vehiculo;
	}

	public static void verDatosPersonas(List<Persona> alistPersonas) {
		if(alistPersonas.isEmpty()) {
			System.out.println("No hay Personas fuera de los vehículos \n");
		}else {
			for (Persona persona : alistPersonas) {
				System.out.println("Nombre: "+persona.getNombre()+", Genero: "+persona.getGenero()+", Edad: "+persona.getEdad()+" Años, Peso: "+persona.getPeso() +" Kilogramos") ;
			}
		}
	}
	
	public static void verDatosPersonasEnVehiculos(List<Persona> alistPersonas) {
		if(alistPersonas.isEmpty()) {
			System.out.println("No hay personas dentro de los vehículos \n");
		}else {
			for (Persona persona : alistPersonas) {
				System.out.println("Nombre: "+persona.getNombre()+", Genero: "+persona.getGenero()+", Edad: "+persona.getEdad()+" Años, Peso: "+persona.getPeso() +" Kilogramos" +", Tipo Vehículo: " + persona.getTipo_vehiculo());
			}
		}
	}
	
	public static int [] validaNombrePersona(String name, List<Persona> arrList) {
		int [] valida = {0,0};
		for (int j = 0; j < arrList.size(); j++) {
			if(name.equalsIgnoreCase(arrList.get(j).getNombre())) {
				valida[0] = 1;
				valida[1] = j;
				j = arrList.size();
			}
		}
		return valida;
	}
}
