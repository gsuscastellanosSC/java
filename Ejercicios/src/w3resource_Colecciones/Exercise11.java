package w3resource_Colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exercise11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		System.out.println("Antes " + list_Strings);
		reverseElementsArrayList(list_Strings);
		System.out.println("Despues" + list_Strings);
		
	}
	public static List<String> reverseElementsArrayList(List<String> list_Strings){
		Collections.reverse(list_Strings);
		return list_Strings;
	}
}
