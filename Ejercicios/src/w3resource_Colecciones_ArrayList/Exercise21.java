package w3resource_Colecciones_ArrayList;
/*21. Escriba un programa Java para reemplazar el segundo elemento de una ArrayList con el elemento especificado.*/
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exercise21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		System.out.println("Antes: " + list_Strings);
		replaceTheSecondElementOfAArrayList(list_Strings, "Verde", 1);
		System.out.println("Despues: " + list_Strings);		
	}
	public static void replaceTheSecondElementOfAArrayList(ArrayList<String> list_Strings, String element, int pos){
		list_Strings.set(pos, element);
	}
}
