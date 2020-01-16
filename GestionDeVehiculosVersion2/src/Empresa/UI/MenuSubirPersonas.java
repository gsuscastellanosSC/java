package Empresa.UI;

import java.util.Scanner;

import Empresa.MODEL.Persona;
import Empresa.MODEL.Vehiculo;

public class MenuSubirPersonas {
	public static void show(Scanner sc) {
		String element;
		System.out.println("¡Hola! "
				+ "\nPara subir una persona por favor escribe el nombre de la persona y el nombre del vehículo, separado por comas ','. "
				+ "\nEjemplo: 'Ana,Bicicleta'\n");
		element = sc.nextLine();
		String[] elements = element.split(",");
		boolean personaUp = false;
		
		if(elements.length == 2) {
			String name_persona = elements[0];
			String tipo_vehiculo = elements[1];
			for (int i = 0; i < Vehiculo.vehiculos.size(); i++) {
				if(Persona.validaNombrePersona(name_persona, Persona.personas)[0] == 1 && Vehiculo.vehiculos.get(i).getClass().getTypeName().equalsIgnoreCase("Empresa.MODEL."+tipo_vehiculo)) {
					Vehiculo.vehiculos.get(i).subirPersonas(i, Persona.validaNombrePersona(name_persona, Persona.personas)[1], tipo_vehiculo);
					i = Vehiculo.vehiculos.size();
					personaUp = true;
				}
			}
			if(personaUp == false) {
				System.out.println("No es posible subir a la persona "+ name_persona + " En el vehículo " + tipo_vehiculo);
			}
		}else{
			System.out.println("La cantidad de parametros ingresada no es correcta");
		}			
	}
}
