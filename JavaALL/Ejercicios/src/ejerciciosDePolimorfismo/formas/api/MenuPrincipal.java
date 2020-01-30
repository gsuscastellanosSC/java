package ejerciciosDePolimorfismo.formas.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ejerciciosDePolimorfismo.formas.model.Circulo;
import ejerciciosDePolimorfismo.formas.model.Cuadrado;
import ejerciciosDePolimorfismo.formas.model.Elipse;
import ejerciciosDePolimorfismo.formas.model.Forma;
import ejerciciosDePolimorfismo.formas.model.Punto;
import ejerciciosDePolimorfismo.formas.model.Rectangulo;



public class MenuPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 0;
		Scanner sc = new Scanner(System.in);
		List<Forma> formas = new ArrayList<Forma>(); 
		
		Rectangulo rectangulo0 = new Rectangulo("Amarillo", new Punto(3, 5), "Rectangulo", 3, 6); 
		Cuadrado cuadrado0 = new Cuadrado("Verde", new Punto(0, 0), "Cuadrado", 1, 1);
		Elipse elipse0 = new Elipse("Red", new Punto(1,2), "Elipse", 3, 1);
		Circulo circulo0 = new Circulo("Cafe", new Punto(8, 25), "Circulo", 20, 20);
		
		formas.add(elipse0);
		formas.add(circulo0);
		formas.add(rectangulo0);
		formas.add(cuadrado0);
		
	
		do {
			System.out.println("1. Forma con mayor área");
			System.out.println("2. Verdatos de todas la formas");
			System.out.println("--------------------------");
			option = Integer.valueOf(sc.nextLine());
			switch (option) {
			case 1:
				float [] valida = {0,0};
				for (int i = 0; i < formas.size(); i++) {
					if (formas.get(i).calcularArea() > valida[0]) {
						valida[0] = formas.get(i).calcularArea();
						valida[1] = i;
					}
				}
				System.out.println("La forma con mayor area es: ");
				System.out.println(formas.get((int)valida[1]).toString());
				System.out.println("--------------------------");
				break;
			case 2:
				for (Forma forma : formas) {
					System.out.println(forma.toString());
					System.out.println("--------------------------");
				}
				break;
			default:
				break;
			}
			
		} while (option != 0);
		sc.close();
	}

}
