package w3resource_Colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		System.out.println(list_Strings.hashCode());
		List<String> ArrayListCopy = CopyArrayListAToB(list_Strings);
		System.out.println(ArrayListCopy.hashCode());
		
	}
	public static List<String> CopyArrayListAToB(List<String> ArrayListA){
		ArrayList<String> ArrayListB = new ArrayList<String>(ArrayListA);
		return ArrayListB;
	}
}
