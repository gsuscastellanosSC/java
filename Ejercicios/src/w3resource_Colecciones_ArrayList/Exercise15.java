package w3resource_Colecciones_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exercise15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		
		List<String> list_Strings2 = new ArrayList<String>();
		list_Strings2.add("Rojo");
		list_Strings2.add("Verde");
		list_Strings2.add("Naranja");
		list_Strings2.add("Blanco");
		list_Strings2.add("Negro");
		
		System.out.println("Antes list_Strings " +list_Strings +"\nAntes list_Strings2 " + list_Strings2);
		List<String> NewArrayList = joinArrayAWhitArrayB(list_Strings, list_Strings2);		
		System.out.println("Despues list_Strings " +list_Strings +"\nDespues list_Strings2 " + list_Strings2+"\nNew ArrayList "+NewArrayList);
		
	}
	
	public static List<String> joinArrayAWhitArrayB(List<String> ArryListA, List<String> ArryListB){
		List<String> NewArrayList = new ArrayList<String>();
		NewArrayList.addAll(ArryListA);
		NewArrayList.addAll(ArryListB);
		return NewArrayList;
	}
}
