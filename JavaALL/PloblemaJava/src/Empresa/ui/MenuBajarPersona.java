package Empresa.ui;

import java.util.Scanner;

import Empresa.model.Bicicleta;
import Empresa.model.Carro;
import Empresa.model.Moto;
import Empresa.model.Persona;
import Empresa.model.Vehiculo;

public class MenuBajarPersona {
	public static void bajar(Scanner sc) {
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
