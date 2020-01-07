package w3resource_Colecciones;

import java.util.ArrayList;
import java.util.List;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  updateElement(list_Strings, "Rojo", 0);
		  System.out.println("Despues "+ list_Strings);
	}
	public static List<String> updateElement(List<String> liStrings, String elemntToUpdate, int pos){
		System.out.println("Antes"+ liStrings + " Actualizar a: " +elemntToUpdate);
		liStrings.set(pos, elemntToUpdate);
		return liStrings;
	}
}
