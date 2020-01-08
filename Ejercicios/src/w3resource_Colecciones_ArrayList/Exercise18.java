package w3resource_Colecciones_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exercise18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		System.out.println(isEmtyArrayList(list_Strings));
		
		
		
	}
	public static boolean isEmtyArrayList(List<String> list_Strings){
		return list_Strings.isEmpty();
	}
}
