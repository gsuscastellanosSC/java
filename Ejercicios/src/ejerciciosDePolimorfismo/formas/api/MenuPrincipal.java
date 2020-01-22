package ejerciciosDePolimorfismo.formas.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ejerciciosDePolimorfismo.Formas.model.Circulo;
import ejerciciosDePolimorfismo.Formas.model.Cuadrado;
import ejerciciosDePolimorfismo.Formas.model.Elipse;
import ejerciciosDePolimorfismo.Formas.model.Forma;
import ejerciciosDePolimorfismo.Formas.model.Punto;
import ejerciciosDePolimorfismo.Formas.model.Rectangulo;

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
				formas.get((int)valida[1]).imprimir();
				System.out.println("--------------------------");
				break;
			default:
				break;
			}
			
		} while (option != 0);
		sc.close();
	}

}
