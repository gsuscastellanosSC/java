package w3resource_Colecciones_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exercise20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		increaseTheSizeOfAnArrayList(list_Strings, 6);
				
	}
	public static void increaseTheSizeOfAnArrayList(ArrayList<String> list_Strings, int minCapacity){
		list_Strings.ensureCapacity(minCapacity);
		System.out.println("La capacidad se aumento a " +  minCapacity);
	}
}
