package w3resource_Colecciones_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exercise13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		
		List<String> list_Strings2 = new ArrayList<String>();
		list_Strings2.add("Red");
		list_Strings2.add("Green");
		list_Strings2.add("Orange");
		list_Strings2.add("Whitse");
		list_Strings2.add("Black");
		
		System.out.println(list_Strings +"\n"+ list_Strings2);
		System.out.println("compareArrayListAtoBMySolve " + compareArrayListAtoB(list_Strings, list_Strings2));
		System.out.println("compareArrayListAtoBSolvePage " + compareArrayListAtoBSolvePage(list_Strings, list_Strings2));
		
	}
	
	public static boolean compareArrayListAtoB(List<String> ArryListA, List<String> ArryListB){
		return ArryListA.containsAll(ArryListB);
		
	}
	public static List<String> compareArrayListAtoBSolvePage(List<String> ArryListA, List<String> ArryListB){
		ArrayList<String> ArrayCompare = new ArrayList<String>();
		for (String e : ArryListA) {
			ArrayCompare.add(ArryListB.contains(e) ? "Yes" : "No");
	     }
	     return ArrayCompare;
	}
}
