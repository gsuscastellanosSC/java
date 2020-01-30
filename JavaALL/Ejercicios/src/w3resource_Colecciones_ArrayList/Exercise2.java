package w3resource_Colecciones_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  iterarArraList(list_Strings);
		  System.out.println(list_Strings.getClass());
	}
	public static void iterarArraList(List<String> list_Strings) {
		for (String element : list_Strings) {
		    System.out.println(element);
		    }
	}
}
