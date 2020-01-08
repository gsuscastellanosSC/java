package w3resource_Colecciones_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		System.out.println(searchAnElement(list_Strings, "Red"));
		System.out.println("Despues "+ list_Strings);
	}
	public static boolean searchAnElement(List<String> liStrings, String elemtSearch){
		liStrings.contains(elemtSearch);
		return liStrings.contains(elemtSearch);
	}
}
