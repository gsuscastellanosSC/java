package Empresa.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface Vehiculo {
	
	public static List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	public static List<Persona> personasEnVehiculos = new ArrayList<Persona>();
		
	static void verVehiculos(List<Vehiculo> vehiculos) {
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(vehiculo.verVehiculoesDisponiblesYSusDatos());
		}
		
	}
	public static void verDatosPersonasEnVehiculos(List<Persona> alistPersonas) {
		if(alistPersonas.isEmpty()) {
			System.out.println("No hay personas dentro de los vehículos \n");
		}else {
			for (Persona persona : alistPersonas) {
				System.out.println("Nombre: "+persona.getNombre()+", Genero: "+persona.getGenero()+", Edad: "+persona.getEdad()+" Años, Peso: "+persona.getPeso() +" Kilogramos" +", Tipo Vehículo: " + persona.getTipoVehiculo()) ;
			}
		}
	}
	String verVehiculoesDisponiblesYSusDatos();
	
	
	
}
