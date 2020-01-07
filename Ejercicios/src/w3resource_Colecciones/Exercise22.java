package w3resource_Colecciones;
/*21. Escriba un programa Java para reemplazar el segundo elemento de una ArrayList con el elemento especificado.*/
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exercise22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		printAllTheElementsOfAArrayListUsingThePositionOfTheElement(list_Strings);
				
	}
	public static void printAllTheElementsOfAArrayListUsingThePositionOfTheElement(ArrayList<String> list_Strings){
		for (int j = 0; j < list_Strings.size(); j++) {
			System.out.println(list_Strings.get(j));
		} 
	}
}
