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
	static void SubirPersonaAVehiculo(Scanner sc) {
		String element;
		System.out.println("¡Hola! "
				+ "\nPara subir una persona por favor escribe el nombre de la persona y el nombre del vehículo, separado por comas ','. "
				+ "\nEjemplo: 'Ana,Bicicleta'\n");
		element = sc.nextLine();
		String[] elements = element.split(",");
		String name_persona = elements[0];
		String tipo_vehiculo = elements[1];
		
		if(elements.length==2) {
			if (tipo_vehiculo.equalsIgnoreCase("Bicicleta") && Persona.validaSiExistePersona(name_persona, Persona.personas)){
				Bicicleta.SubirPersonaAVehiculo(name_persona, tipo_vehiculo);
			}else if(tipo_vehiculo.equalsIgnoreCase("Moto") && Persona.validaSiExistePersona(name_persona, Persona.personas)) {
				Moto.SubirPersonaAVehiculo(name_persona, tipo_vehiculo);
			}else if(tipo_vehiculo.equalsIgnoreCase("Carro") && Persona.validaSiExistePersona(name_persona, Persona.personas)) {
				Carro.SubirPersonaAVehiculo(name_persona, tipo_vehiculo);
			}else {
				if(Persona.validaSiExistePersona(name_persona, Persona.personas)!= true) {
					System.out.println("La persona "+name_persona +" no existe");
				}
				if(tipo_vehiculo.equalsIgnoreCase("Bicicleta") != true||tipo_vehiculo.equalsIgnoreCase("Moto") != true||tipo_vehiculo.equalsIgnoreCase("Carro") != true) {
					System.out.println("El vehículo " + tipo_vehiculo +" no existe");
				}
				System.out.println("Valide lo datos ingresados, no es posible subir A: " + name_persona + " al Vehículo: " + tipo_vehiculo);
				}
		}else {
			System.out.println("Faltan elementos.\n¡Valida e intenta de nuevo!");
		}
		
	}
	
	static void bajarPersonaDeVehiculo(Scanner sc) {
		String element;
		System.out.println("¡Hola! "
				+ "\nPara Bajar una persona por favor escribe el nombre de la persona y el nombre del vehículo, separado por comas ','. "
				+ "\nEjemplo: 'Ana,Bicicleta'\n");
		element = sc.nextLine();
		String[] elements = element.split(",");
		String tipo_vehiculo = elements[1];
		String name_persona = elements[0];
		if(elements.length==2) {
			if (tipo_vehiculo.equalsIgnoreCase("Bicicleta") && Persona.validaSiExistePersona(name_persona, Vehiculo.personasEnVehiculos)){
				Bicicleta.bajarPersonaDeVehiculo(name_persona, tipo_vehiculo);
			}else if(tipo_vehiculo.equalsIgnoreCase("Moto") && Persona.validaSiExistePersona(name_persona, Vehiculo.personasEnVehiculos)) {
				Moto.bajarPersonaDeVehiculo(name_persona, tipo_vehiculo);
			}else if(tipo_vehiculo.equalsIgnoreCase("Carro") && Persona.validaSiExistePersona(name_persona, Vehiculo.personasEnVehiculos)) {
				Carro.bajarPersonaDeVehiculo(name_persona, tipo_vehiculo);
			}else {
				if(Persona.validaSiExistePersona(name_persona, Persona.personasEnVehiculos)!= true) {
					System.out.println("La persona "+name_persona +" no existe");
				}
				if(tipo_vehiculo.equalsIgnoreCase("Bicicleta") != true||tipo_vehiculo.equalsIgnoreCase("Moto") != true||tipo_vehiculo.equalsIgnoreCase("Carro") != true) {
					System.out.println("El vehículo " + tipo_vehiculo +" no existe");
				}
			}
			System.out.println("Valide lo datos ingresados, no es posible bajar A: " + name_persona + " del Vehículo: " + tipo_vehiculo);
		}else {
			System.out.println("Faltan elementos.\n¡Valida e intenta de nuevo!");
		}
	}
}
