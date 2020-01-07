package w3resource_Colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		System.out.println("Antes "+ list_Strings);
		SortArrayList(list_Strings);
	}
	public static void SortArrayList(List<String> list_Strings){
		Collections.sort(list_Strings);
		System.out.println("Depues "+ list_Strings);
	}
}
