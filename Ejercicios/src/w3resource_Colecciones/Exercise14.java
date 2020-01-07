package w3resource_Colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exercise14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		System.out.println("Antes " + list_Strings);
		changeElementAForElementB(list_Strings, 0, 4);
		System.out.println("Despues " + list_Strings);
		
		
	}
	
	public static void changeElementAForElementB(List<String> list_Strings, int posElementA, int posElementB){
		Collections.swap(list_Strings, posElementA, posElementB);
	}
	
}
