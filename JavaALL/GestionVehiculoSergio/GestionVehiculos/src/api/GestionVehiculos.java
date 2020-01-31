package api;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Persona;
import model.TipoVehiculo;
import model.Vehiculo;
import service.GestionVehiculo;
import service.impl.GestionVehiculoImpl;

public class GestionVehiculos {
	
	private static GestionVehiculo gestionVehiculo;
	private static List<Vehiculo> vehiculos;
	private static List<Persona> personas;

	public static void main(String[] args) {
		TipoVehiculo bicicleta = new TipoVehiculo("Bicicleta");
		TipoVehiculo moto = new TipoVehiculo("Moto");
		TipoVehiculo carro = new TipoVehiculo("Carro");
		
		vehiculos = new ArrayList<>();
		vehiculos.add(new Vehiculo(bicicleta, 1, 100d));
		vehiculos.add(new Vehiculo(moto, 2, 150d));
		vehiculos.add(new Vehiculo(carro, 4, 500d));
		
		personas = new ArrayList<>();		
		personas.add(new Persona("Ana", "mujer", 30, 70d)); 
		personas.add(new Persona("María", "mujer", 22, 58d));
		personas.add(new Persona("Juan", "hombre", 31, 110d));
		personas.add(new Persona("Jose", "hombre", 52, 100d));
		personas.add(new Persona("Pedro", "hombre", 24, 71d));
		personas.add(new Persona("Oscar", "hombre", 27, 65d));
		personas.add(new Persona("Juanita", "mujer", 44, 91d));
		personas.add(new Persona("Pablo", "hombre", 50, 80d));
		
		gestionVehiculo = new GestionVehiculoImpl();
			
		showMenu();
	}
	
	public static void showMenu() {
		int opcion = 0;
		do {
			//Options
			System.out.println("----------------------------------------");
			System.out.println("1) Ver personas fuera de los vehículos");
	    	System.out.println("2) Ver personas dentro de los vehículos");
	    	System.out.println("3) Ver vehículos disponibles");
	    	System.out.println("4) Subir una persona");
	    	System.out.println("5) Bajar una persona");
	    	System.out.println("0. Salir");
	    	System.out.println("----------------------------------------");
	    	
			Scanner sc = new Scanner(System.in);
			opcion = Integer.valueOf(sc.nextLine());
			System.out.println("----------------------------------------");
			
			switch (opcion) {
				case 1:
					//Ver personas fuera de los vehículos
					StringBuilder personasFuera = new StringBuilder("Las siguientes son las personas fuera de los vehiculos: ");
					for (Persona persona:personas) {
						if (!persona.isEstaEnVehiculo()) {
							personasFuera.append(persona.getNombre() + ", ");
						}
					}
					System.out.println(personasFuera.toString().substring(0, personasFuera.toString().length()-2));
					break;
				case 2:
					//Ver personas fuera de los vehículos
					StringBuilder personasDentro = new StringBuilder("Las siguientes son las personas dentro de los vehiculos: ");
					for (Persona persona:personas) {
						if (persona.isEstaEnVehiculo()) {
							personasDentro.append(persona.getNombre() + ", ");
						}
					}
					System.out.println(personasDentro.toString().substring(0, personasDentro.toString().length()-2));
					break;
				case 3:
					//Ver vehículos disponibles
					StringBuilder vehiculosDisponibles = new StringBuilder();
					for (Vehiculo vehiculo:vehiculos) {
						vehiculosDisponibles.append(gestionVehiculo.obtenerVehiculo(vehiculo));
						vehiculosDisponibles.append("-------").append(System.lineSeparator());
					}
					System.out.println(vehiculosDisponibles.toString());
					break;
				case 4:
					//Menu Subir una persona 
					menuSubirPersonas(sc);
					break;
				case 5:
					//Menu Bajar una persona
					menuBajarPersonas(sc);
					break;
				case 0:
					//Salir
					break;	
				default:
					break;
			}
		} while (opcion != 0);
	}
	
	static Persona getPersona(String nombre) throws Exception {
		for (Persona p:personas) {
			if (nombre.equals(p.getNombre())) {
				return p;
			}
		}
		throw new Exception("No existe " + nombre);
	}
	
	static Vehiculo getVehiculo(String tipo) throws Exception {
		for (Vehiculo v:vehiculos) {
			if (tipo.equals(v.getTipo().getNombre())) {
				return v;
			}
		}
		throw new Exception("No existe el vehiculo " + tipo);
	}
	
	public static void menuSubirPersonas(Scanner sc) {
		String element;
		System.out.println("¡Hola! "
				+ "\nPara subir una persona por favor escribe el nombre de la persona y el nombre del vehículo, separado por comas ','. "
				+ "\nEjemplo: 'Ana,Bicicleta'\n");
		element = sc.nextLine();
		String[] elements = element.split(",");
		
		if(elements.length == 2) {
			String name_persona = elements[0].trim();
			String tipo_vehiculo = elements[1].trim();

			try {
				Persona persona = getPersona(name_persona);	
				Vehiculo vehiculo = getVehiculo(tipo_vehiculo);
			
				gestionVehiculo.subirPersona(vehiculo, persona);
				System.out.println("Se ha subido a " + name_persona + " al tipo vehiculo " + tipo_vehiculo);
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}else{
			System.out.println("La cantidad de parametros ingresada no es correcta");
		}			
	}
	
	public static void menuBajarPersonas(Scanner sc) {
		String element;
		System.out.println("¡Hola! "
				+ "\nPara Bajar una persona por favor escribe el nombre de la persona y el nombre del vehículo, separado por comas ','. "
				+ "\nEjemplo: 'Ana,Bicicleta'\n");
		element = sc.nextLine();
		String[] elements = element.split(",");
		boolean personaDowm = false;
		
		if(elements.length == 2) {
			String tipo_vehiculo = elements[1];
			String name_persona = elements[0];
			
			try {
				Persona persona = getPersona(name_persona);	
				Vehiculo vehiculo = getVehiculo(tipo_vehiculo);
				
				gestionVehiculo.bajarPersona(vehiculo, persona);
				System.out.println("Se ha bajado a " + name_persona + " del tipo vehiculo " + tipo_vehiculo);
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}else{
			System.out.println("La cantidad de parametros ingresada no es correcta");
		}	
	}
	
	
}