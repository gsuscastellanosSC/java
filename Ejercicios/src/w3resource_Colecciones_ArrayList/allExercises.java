package w3resource_Colecciones_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class allExercises {
	static List<String> list_Strings;
	static String element;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}
	public static List<String> CreateArrayList() {
		//1. Write a Java program to create a new array list, add some colors (string) and print out the collection.//
		List<String> NewArrayList = new ArrayList<String>(); 
		return NewArrayList;
	}
	public static void addArrayListAElement(String element) {
		list_Strings.add(element);
	}
	
	public static void iterarArraList() {
		for (String element : list_Strings) {
		    System.out.println(element);
		    }
	}
	
	public static void insertOfFirstPosition(String cadena, int pos) {
		list_Strings.add(pos,cadena);
	}
	public static void menu() {
		int response = 0;
		do {
			System.out.println("1. Crear ArrayList");
			System.out.println("2. Llenar ArrayList");
			System.out.println("3. Iterar ArrayList");
			System.out.println("4. Ingresar Elemento en la primera posición");
			System.out.println("5. Retornar elemento en la posición n");
			System.out.println("0. Finalizar");
			Scanner sc = new Scanner(System.in);
	        response = Integer.valueOf(sc.nextLine());
	        switch (response) {
	        case 0:
	        	System.out.println("Hasta pronto ;)");
	        	break;
	        case 1:
				list_Strings = CreateArrayList();
				break;
			case 2:
				if(list_Strings != null) {
					System.out.println("Escriba los elementos a ingresar sepeardos por ', '");
					element = sc.nextLine();
					String[] elements = element.split(",");
					for (String elem : elements) {
						addArrayListAElement(elem);
					}
					System.out.println(list_Strings);
				}else {
					System.out.println("Usted no ha creado un ArrayList");
					list_Strings = CreateArrayList();
					System.out.println("Se ha creado un ArrayList de forma automatica");
					continue;
				}
				break;
			case 3:
				if(list_Strings != null) {
					iterarArraList();
				}else {
					System.out.println("Debe agregar elementos primero");
					continue;
				}
				break;
			case 4:
				if(list_Strings == null) {
					System.out.println("Debe crear un arreglo primero");
					continue;
				}else {
					System.out.println("Digite el elemento a Ingresar");
					element = sc.nextLine();
					insertOfFirstPosition(element, 0);;
				}
				break;
			default:
				System.out.println("Ha seleccionado " + response + " por favor seleccione un valor valido" );
				break;
			}
	    } while (response != 0);
	}
}
