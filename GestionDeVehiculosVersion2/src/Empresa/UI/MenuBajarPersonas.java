package Empresa.UI;

import java.util.Scanner;

import Empresa.MODEL.Persona;
import Empresa.MODEL.Vehiculo;

public class MenuBajarPersonas {
	public static void show(Scanner sc) {
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
			for (int i = 0; i < Persona.personasVehiculo.size(); i++) {
				if(Persona.validaNombrePersona(name_persona, Persona.personasVehiculo)[0] == 1 && Persona.personasVehiculo.get(i).getTipo_vehiculo().equalsIgnoreCase(tipo_vehiculo)) {
					for (int j = 0; j < Vehiculo.vehiculos.size(); j++) {
						if(Vehiculo.vehiculos.get(j).getClass().getTypeName().equalsIgnoreCase("Empresa.MODEL."+tipo_vehiculo)) {
							Vehiculo.vehiculos.get(i).bajarPersonas(i, j, tipo_vehiculo);
							j = Vehiculo.vehiculos.size();
						}
					}
					i = Vehiculo.vehiculos.size();
					personaDowm = true;
				}
			}
			if(personaDowm == false) {
				System.out.println("No es posible bajar a la persona "+ name_persona + " En el vehículo " + tipo_vehiculo);
			}
		}else{
			System.out.println("La cantidad de parametros ingresada no es correcta");
		}			
	}
	
}
