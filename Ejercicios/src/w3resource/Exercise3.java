package w3resource;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Hola");
		list_Strings.add("Como");
		list_Strings.add("Estás?");
		System.out.println(list_Strings);
		list_Strings.add(0,"Buenos dias");  //Al insertar siempre se hace en la última posición, pero al realizar este truco decidimos donde insertar;
		System.out.println(list_Strings);
	}
	public static void insertOfFirstPosition() {
		
	}
}
