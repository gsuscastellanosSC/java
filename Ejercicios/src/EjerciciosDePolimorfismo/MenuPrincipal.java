package EjerciciosDePolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
			System.out.println("--------------------------");
			option = Integer.valueOf(sc.nextLine());
			for (Forma forma : formas) {
				forma.setColor("Gris");
				System.out.println("--------------------------");
				forma.moverFormaAsuCentro(sc);
			}
			for (Forma forma : formas) {
				forma.imprimir();
				forma.calculaPerimetro();
				forma.calcularArea();
				System.out.println("--------------------------");
			}
			//System.out.println(Math.sqrt(Math.pow(5, 2)+Math.pow(12, 2)));
		} while (option != 0);
		sc.close();
	}

}
