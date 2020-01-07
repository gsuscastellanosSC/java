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
		insertOfFirstPosition(list_Strings,"Buenos días", 0);  //Al insertar siempre se hace en la última posición, pero al realizar este truco decidimos donde insertar;
		System.out.println(list_Strings);
	}
	public static void insertOfFirstPosition(List<String> list_Strings, String cadena, int pos) {
		list_Strings.add(pos,cadena);
	}
}
