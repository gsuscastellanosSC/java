package Empresa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Menu {
	public static Set<Persona> personas = new HashSet<Persona>();
	public static Set<Vehiculo> vehiculos = new HashSet<Vehiculo>();
		
	public static Vehiculo bicicleta = new Bicicleta(1, 100, 1, 2);
	public static Vehiculo moto = new Moto(2, 150, 2, 2);
	public static Vehiculo carro = new Carro(4, 500, 4, 4);
		
	public static Persona ana = new Persona("Ana", "mujer", 30, 70); 
	public static Persona maria = new Persona("María", "mujer", 22, 58);
	public static Persona juan = new Persona("Juan", "hombre", 31, 110);
	public static Persona jose = new Persona("Jose", "hombre", 52, 100);
	public static Persona pedro = new Persona("Pedro", "hombre", 24, 71);
	public static Persona oscar = new Persona("Oscar", "hombre", 27, 65);
	public static Persona juanita = new Persona("Juanita", "mujer", 44, 91);
	public static Persona pablo = new Persona("Pablo", "hombre", 50, 80);
	
			
	public static void menu() {
		vehiculos.add(bicicleta);
		vehiculos.add(moto);
		vehiculos.add(carro);
		
		personas.add(ana);
		personas.add(maria);
		personas.add(juan);
		personas.add(jose);
		personas.add(pedro);
		personas.add(oscar);
		personas.add(juanita);
		personas.add(pablo);
				
		//Menu
			int menu=0;
			do {
	            System.out.println("1) Ver personas fuera de los vehículos");
	    		System.out.println("2) Ver personas dentro de los vehículos");
	    		System.out.println("3) Ver vehículos disponibles y cuántas plazas tienen ocupadas y libres, así como el peso libre extra que aguantan (ej: si subimos a Ana a la bici, dirá que tiene 30kg disponibles)");
	    		System.out.println("4) Subir una persona a un vehículo: nos pedirá el nombre de la persona y el nombre del vehículo, separado por comas. Ejemplo: Ana, Bicicleta");
	    		System.out.println("5) Bajar una persona de un vehículo: ídem");
	    		System.out.println("0. Salir");
	    		
	    		Scanner sc = new Scanner(System.in);
	    		Scanner entrada=new Scanner(System.in);
	    		menu = Integer.valueOf(sc.nextLine());
	            	    		
		        switch (menu) {
				case 1:
					for (Persona persona : personas) {
						System.out.println("Nombre: "+persona.getNombre()+", Genero: "+persona.getGenero()+", Edad: "+persona.getEdad()+", Peso: "+persona.getPeso());
					}
					break;
				case 2:
					break;
				case 3:
					
					for (Vehiculo vehiculo : vehiculos) {
						System.out.println(vehiculo.verVehiculoesDisponiblesYSusDatos());
					}
					break;
				case 4:
					
					break;
				case 5:
					
					break;
				case 6:
					break;
				default:
					break;
				}
			}while (menu != 0);
		//Menu
	}
}
