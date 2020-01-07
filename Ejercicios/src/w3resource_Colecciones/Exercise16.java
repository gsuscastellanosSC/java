package w3resource_Colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exercise16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		List<String> NewArrayListClone = cloneArrayListAToB(list_Strings);
		System.out.println(list_Strings);
		System.out.println(NewArrayListClone);
		
	}
	public static List<String> cloneArrayListAToB(List<String> ArrayListA){
		ArrayList<String> NewArrayListClone = (ArrayList<String>) ((ArrayList<String>) ArrayListA).clone();
		//ArrayList<String> NewArrayListClone = (ArrayList<String>)ArrayListA.clone();
		return NewArrayListClone;
	}
}
