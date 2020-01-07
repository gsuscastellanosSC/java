package w3resource_Colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		System.out.println("Original " + list_Strings);
		List<String> subList = xtractAportionArrayList(list_Strings, 0, 4);
		System.out.println("Sublista" + subList);
		
	}
	public static List<String> xtractAportionArrayList(List<String> list_Strings, int pos1, int pos2){
		List<String> subList = list_Strings.subList(pos1, pos2);
		return subList;
	}
}
