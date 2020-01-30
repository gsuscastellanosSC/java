package Empresa.API;

import java.util.Scanner;

import empresa.model.Bicicleta;
import empresa.model.Carro;
import empresa.model.Moto;
import empresa.model.Persona;
import empresa.model.Vehiculo;
import empresa.ui.Menu;

public class MenuPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo.vehiculos.add(new Bicicleta(1, 100));
		Vehiculo.vehiculos.add(new Moto(2, 150));
		Vehiculo.vehiculos.add(new Carro(4, 500));
				
		Persona.personas.add(new Persona("Ana", "mujer", 30, 70)); 
		Persona.personas.add(new Persona("María", "mujer", 22, 58));
		Persona.personas.add(new Persona("Juan", "hombre", 31, 110));
		Persona.personas.add(new Persona("Jose", "hombre", 52, 100));
		Persona.personas.add(new Persona("Pedro", "hombre", 24, 71));
		Persona.personas.add(new Persona("Oscar", "hombre", 27, 65));
		Persona.personas.add(new Persona("Juanita", "mujer", 44, 91));
		Persona.personas.add(new Persona("Pablo", "hombre", 50, 80));
			
		Menu.showMenu();
	}
}
