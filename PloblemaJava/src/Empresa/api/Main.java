package Empresa.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Empresa.model.Bicicleta;
import Empresa.model.Carro;
import Empresa.model.Moto;
import Empresa.model.Persona;
import Empresa.model.Vehiculo;
import Empresa.ui.Menu;

public class Main {

	public static void main(String[] args) {
	
		Vehiculo.vehiculos.add(new Bicicleta(1, 100, 1, 2));
		Vehiculo.vehiculos.add(new Moto(2, 150, 2, 2));
		Vehiculo.vehiculos.add(new Carro(4, 500, 4, 4));
				
		Persona.personas.add(new Persona("Ana", "mujer", 30, 70)); 
		Persona.personas.add(new Persona("María", "mujer", 22, 58));
		Persona.personas.add(new Persona("Juan", "hombre", 31, 110));
		Persona.personas.add(new Persona("Jose", "hombre", 52, 100));
		Persona.personas.add(new Persona("Pedro", "hombre", 24, 71));
		Persona.personas.add(new Persona("Oscar", "hombre", 27, 65));
		Persona.personas.add(new Persona("Juanita", "mujer", 44, 91));
		Persona.personas.add(new Persona("Pablo", "hombre", 50, 80));
			
		Menu.menu();
	
	}
}
