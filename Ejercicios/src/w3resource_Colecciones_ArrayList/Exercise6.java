package w3resource_Colecciones_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  DeleteElement(list_Strings, 2);
		  System.out.println("Despues "+ list_Strings);
	}
	public static List<String> DeleteElement(List<String> liStrings, int pos){
		System.out.println("Antes"+ liStrings);
		liStrings.remove(pos);
		return liStrings;
	}
}
