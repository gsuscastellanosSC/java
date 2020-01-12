package Empresa.ui;

import java.util.Scanner;
import Empresa.model.Persona;
import Empresa.model.Vehiculo;

public class Menu {
	
	public static void menu() {
				
		//Menu
			int menu=0;
			do {
	            System.out.println("1) Ver personas fuera de los vehículos");
	    		System.out.println("2) Ver personas dentro de los vehículos");
	    		System.out.println("3) Ver vehículos disponibles");
	    		System.out.println("4) Subir una persona");
	    		System.out.println("5) Bajar una persona");
	    		System.out.println("0. Salir");
	    		
	    		Scanner sc = new Scanner(System.in);
	    		menu = Integer.valueOf(sc.nextLine());
	            	    		
		        switch (menu) {
				case 1:
					Persona.verDatosPersonas(Persona.personas);
					break;
				case 2:
					Vehiculo.verDatosPersonasEnVehiculos(Vehiculo.personasEnVehiculos);
					break;
				case 3:
					Vehiculo.verVehiculos(Vehiculo.vehiculos);
					break;
				case 4:
					Vehiculo.SubirPersonaAVehiculo(sc);
					break;
				case 5:
					Vehiculo.bajarPersonaDeVehiculo(sc);
					break;
				case 6:
					break;
				default:
					System.out.println("Hasta pronto ;)");
					break;
				}
			}while (menu != 0);
		//Menu
	}

}
