package w3resource_Colecciones;

import java.util.ArrayList;
import java.util.List;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  System.out.println(retrieveAnelement(list_Strings,1));
		  System.out.println(list_Strings);
	}
	public static String retrieveAnelement(List<String> list_Strings, int pos) {
		return list_Strings.get(pos);
	}
}
