package Empresa.UI;

import java.util.Scanner;

public class Menu {
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
					MenuVerPersonasFueraVehiculos.show();
					break;
				case 2:
					//Ver personas dentro de los vehículos
					MenuVerPersonasEnVehiculos.show();
					break;
				case 3:
					//Ver vehículos disponibles
					MenuVerVehiculosDisponibles.show();		
					break;
				case 4:
					//Menu Subir una persona 
					MenuSubirPersonas.show(sc);
					break;
				case 5:
					//Menu Bajar una persona
					MenuBajarPersonas.show(sc);
					break;
				case 0:
					//Salir
					break;	
				default:
					break;
			}
		} while (opcion != 0);
	}
}
