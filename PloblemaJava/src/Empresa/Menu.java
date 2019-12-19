package Empresa;

import java.util.Scanner;

public class Menu {
	
	public static void menu() {
					
		int menu=0;
		Persona ana = new Persona("Ana", "Mujer", 30, 70);
		Persona maria = new Persona("María", "Mujer", 22, 58);
		Persona juan = new Persona("Juan", "hombre", 21, 110);
		Persona jose = new Persona("Jose", "hombre", 52, 100);
		Persona pedro = new Persona("Pedro", "hombre", 24, 71);
		Persona oscar = new Persona("Oscar", "hombre", 27, 65);
		Persona juanita = new Persona("Juanita", "mujer", 44, 91);
		Persona pablo = new Persona("Pablo", "hombre", 50, 80);
		
        do {
            System.out.println("1) Ver personas fuera de los vehículos");
    		System.out.println("2) Ver personas dentro de los vehículos");
    		System.out.println("3) Ver vehículos disponibles y cuántas plazas tienen ocupadas y libres, así como el peso libre extra que aguantan (ej: si subimos a Ana a la bici, dirá que tiene 30kg disponibles)");
    		System.out.println("4) Subir una persona a un vehículo: nos pedirá el nombre de la persona y el nombre del vehículo, separado por comas. Ejemplo: Ana, Bicicleta");
    		System.out.println("5) Bajar una persona de un vehículo: ídem");
    		System.out.println("0. Salir");
    		
    		Scanner sc = new Scanner(System.in);
            menu = Integer.valueOf(sc.nextLine());

	        switch (menu) {
			case 1:
				System.out.println("1) Ver personas fuera de los vehículos");
				break;
			case 2:
				System.out.println("2) Ver personas dentro de los vehículos");
				break;
			case 3:
				System.out.println("3) Ver vehículos disponibles y cuántas plazas tienen ocupadas y libres, así como el peso libre extra que aguantan (ej: si subimos a Ana a la bici, dirá que tiene 30kg disponibles)");
				break;
			case 4:
				
				ana.bajar();
				break;
			case 5:
				System.out.println("5) Bajar una persona de un vehículo: ídem");
				break;
			default:
				break;
			}
		}while (menu != 0);
	}
}
