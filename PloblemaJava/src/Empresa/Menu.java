package Empresa;

import java.util.Scanner;

public class Menu {
	
	public static void menu() {
		//Personas		
			Persona.Personas.add (new Persona("Ana", "Mujer", 30, 70));
			Persona.Personas.add (new Persona("María", "Mujer", 22, 58));
			Persona.Personas.add (new Persona("Juan", "hombre", 21, 110));
			Persona.Personas.add (new Persona("Jose", "hombre", 52, 100));
			Persona.Personas.add (new Persona("Pedro", "hombre", 24, 71));
			Persona.Personas.add (new Persona("Oscar", "hombre", 27, 65));
			Persona.Personas.add (new Persona("Juanita", "mujer", 44, 91));
			Persona.Personas.add (new Persona("Pablo", "hombre", 50, 80));
		//Personas
		
		//Vehículos
			Vehiculo Bicicleta = new Bicicleta(1, 100, 1, 2);
			Vehiculo Moto = new Moto(2, 150, 2, 2);
			Vehiculo Carro = new Carro(4, 500, 4, 4);
			
			Vehiculo.Vehiculos.add(Bicicleta);
			Vehiculo.Vehiculos.add(Moto);
			Vehiculo.Vehiculos.add(Carro);
		//Vehículos
		
		/*Error al declarar de esta forma Vehiculo.Vehiculos.add(new Bicicleta("Bicicleta",1, 100, 1, 2));
		Vehiculo.Vehiculos.add(new Moto("Moto", 2, 150, 2, 2));
		Vehiculo.Vehiculos.add(new Carro("Carro", 4, 500, 4, 4)); Error al declarar de esta forma*/		
		
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
					 System.out.println(" ");
					 for (int i = 0; i <= Persona.Personas.size() - 1; i++) {
				            Persona.Personas.get(i).VerPersonasFueraVehiculo();
				        }
					 System.out.println(" ");
					break;
				case 2:
					System.out.println(" ");
					Vehiculo.Vehiculos.get(0).getClass().;
					System.out.println();
					
					/*Carro.verPesonasDentroVehiculos();
					Bicicleta.verPesonasDentroVehiculos();
					Moto.verPesonasDentroVehiculos();*/
					
					System.out.println(" ");
					break;
				case 3:
					System.out.println(" ");
					Carro.VerDisponibilidad();
					Bicicleta.VerDisponibilidad();
					Moto.VerDisponibilidad();
					System.out.println(" ");
					break;
				case 4:
					System.out.println("Digite el nombre de la persona");
					String NombrePersona=entrada.nextLine();
					System.out.println("Digite el vehículo");
					String NombreVehiculo=entrada.nextLine();;
					System.out.println(NombrePersona + " " + NombreVehiculo);
					if(Vehiculo.Vehiculos.contains(NombreVehiculo)) {
						System.out.println(Vehiculo.Vehiculos.contains(NombreVehiculo));
					}else {
						System.out.println(Vehiculo.Vehiculos.contains(NombreVehiculo));
						System.out.println("El vehículo No Existe!");
						};
					break;
				case 5:
					System.out.println("5) Bajar una persona de un vehículo: ídem");
					break;
				default:
					break;
				}
			}while (menu != 0);
		//Menu
	}
}
