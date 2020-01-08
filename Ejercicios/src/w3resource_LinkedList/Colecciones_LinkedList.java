package w3resource_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Colecciones_LinkedList {
	static List<String> l_list = createAnEmptyLinkedList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addElementsToLinkedList("Red,Green,Black,White,Pink,Yellow");
		System.out.println(l_list);
	}
	public static List<String>  createAnEmptyLinkedList() {
		/*Metodo para crear un nuevo LinkedList
		 * */
		List<String> NewLinkedList = new LinkedList<String>();
		return NewLinkedList;
	}
	
	public static void addElementsToLinkedList(String element) {
		/*Esté metodo agrega todos los lementos que tiene por entrada separados por una ","
		 * */
		String[] elements = element.split(",");
		for (String ele : elements) {
			l_list.add(ele);
		}	
	}

}
