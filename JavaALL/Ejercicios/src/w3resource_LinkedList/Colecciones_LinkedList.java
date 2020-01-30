package w3resource_LinkedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.print.DocFlavor.STRING;

public class Colecciones_LinkedList {
	static List<String> l_list = createAnEmptyLinkedList(); //Create LinkedList
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addElementsToLinkedList("Red,Green,Black,White,Pink,Yellow", l_list);
		System.out.println(l_list);/*
		iterateAllElementsInALinkedList(5);
		inReverseOrderiterateAllElementsInALinkedList();
		insertElementSpecifiedPosition(5, "Amarillo");
		insertElementInFirstAndLastPosition("FirstElement","LastElement");
		insertElementInTheFrom("Prueba");
		iterateAllElementsInALinkedList(l_list.size());
		insertTheSpecifiedElementAtTheEnd("Elemento"); 
		insertAelementSpecifiedPosition("NewEelement", l_list.size());
		getTheFirstAndLastOccurrenceOftheSpecifiedElement(); 
		displayElementsAndtheirPositions();
		removeAspecifiedElement(2); 
		removeFirstAndLastElement();
		removeAllTheElements() ; 
		swapTwoElements(5, 3);
		//shuffleTheElements();
		joiTwoLinkedLists(); 
		cloneLinkedList(l_list);
		removeAndReturnFirstElement(l_list);
		retrieveButDoesNotRemoveFirstElemen(l_list);
		retrieveButDoesNotRemoveLasttElemen(l_list);
		//System.out.println(checkIfAparticularElementExistsInAlinkedList(l_list, "Rojo"));
		//convertAlinkedListToArrayList(l_list);
		List<String> l_listToCompare = createAnEmptyLinkedList();
		;
		List<String> l_listToCompare = createAnEmptyLinkedList();
		addElementsToLinkedList("Red,Green,Black,White,Pink,Yellow", l_listToCompare);
		System.out.println(compareTwoLinkedLists(l_list,l_listToCompare));
		System.out.println(testAnLinkedListIsEmptyOrNot(l_list));*/
		replaceAnElementInALinkedList(l_list, 0, "Rojo");
	}
	public static List<String>  createAnEmptyLinkedList() {
		/*Create new LinkenList
		 * */
		List<String> NewLinkedList = new LinkedList<String>();
		System.out.println("A LinkedList Create!");
		return NewLinkedList;
	}
	
	public static void addElementsToLinkedList(String element, List<String> linkedListToAdd) {
		/*Add elements separate for ","
		 * */
		String[] elements = element.split(",");
		for (String ele : elements) {
			linkedListToAdd.add(ele);
		}	
	}
	public static void iterateAllElementsInALinkedList(int pos) {
		/*Iterate all elements in A LinkedList
		 * */
		Iterator<String> it = l_list.listIterator(pos);
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void inReverseOrderiterateAllElementsInALinkedList() {
		/*4. Write a Java program to retrieve an element (at a specified index) from a given array list. 
		 * */
		Iterator<String> it = ((LinkedList<String>) l_list).descendingIterator();
		while (it.hasNext()) {
			System.out.println(it.next()+" Elemento");
		}
	}
	
	public static void insertElementSpecifiedPosition(int pos, String element) {
		/*5. Write a Java program to insert the specified element at the specified position in the linked list.
		 * */
		System.out.println(l_list);
		l_list.add(pos, element);
		System.out.println(l_list+" Elemento");
	}
	
	public static void insertElementInFirstAndLastPosition(String firstElement, String lastElement) {
		/*6. Write a Java program to insert elements into the linked list at the first and last position.
		 * */
		System.out.println(l_list);
		((LinkedList<String>) l_list).addFirst(firstElement);
		((LinkedList<String>) l_list).addLast(lastElement);
		System.out.println(l_list+" Elemento");
	}
	
	public static void insertElementInTheFrom(String element) {
		/*7. Write a Java program to insert elements into the linked list at the first and last position.
		 * */
		System.out.println(l_list);
		((LinkedList<String>) l_list).offerFirst(element);
		System.out.println(l_list);
	}
	public static void insertTheSpecifiedElementAtTheEnd(String element) {
		/*8. Write a Java program to insert the specified element at the end of a linked list.
		 * */
		System.out.println("Antes"+l_list);
		((LinkedList<String>) l_list).offerLast(element);
		System.out.println("Despues "+l_list);
	}
	public static void insertAelementSpecifiedPosition(String element, int posositio) {
		/*9. Write a Java program to insert some elements at the specified position into a linked list.*/
		List<String> new_l_list = new LinkedList<String>();
		new_l_list.add("New LinkedList");
		System.out.println(l_list + "Antes");
		l_list.addAll(posositio, new_l_list);
		System.out.println(l_list + "Depues");
	}
	public static void getTheFirstAndLastOccurrenceOftheSpecifiedElement() {
		/*10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.*/
		Object firstElement = ((LinkedList<String>) l_list).getFirst();
		Object lastElement = ((LinkedList<String>) l_list).getLast();
		System.out.println("firstElement\n" +firstElement+"lastElement\n" +lastElement);
	}
	public static void displayElementsAndtheirPositions() {
		//11. Write a Java program to display the elements and their positions in a linked list.
		for (int i = 0; i < l_list.size(); i++) {
			System.out.println("Element " + l_list.get(i) + " Position " + i);
		}
	}
	public static void removeAspecifiedElement(int element) {
		//12. Write a Java program to remove a specified element from a linked list
		System.out.println(l_list + "Antes");
		l_list.remove(element);
		System.out.println(l_list + "Depues");
	}
	public static void  removeFirstAndLastElement() {
		//13. Write a Java program to remove first and last element from a linked list. 
		System.out.println(l_list + "Antes");
		((LinkedList<String>) l_list).removeFirst();
		((LinkedList<String>) l_list).removeLast();
		System.out.println(l_list + "Depues");
	}
	public static void removeAllTheElements() {
		//14. Write a Java program to remove all the elements from a linked list.
		System.out.println(l_list + "Antes");
		l_list.clear();
		System.out.println(l_list + "Depues");
	}
	public static void  swapTwoElements(int positionElementToswap, int newPosition) {
		//15. Write a Java program of swap two elements in an linked list.
		System.out.println(l_list + "Antes");
		Collections.swap(l_list, positionElementToswap, newPosition);
		System.out.println(l_list + "Depues");
	}
	public static void shuffleTheElements() {
		//16. Write a Java program to shuffle the elements in a linked list.
		System.out.println(l_list + "Antes");
		Collections.shuffle(l_list);
		System.out.println(l_list + "Depues");
	}
	public static void joiTwoLinkedLists() {
		//17. Write a Java program to join two linked lists.
		List<String> newLinknList = new LinkedList<String>();
		addElementsToLinkedList("Rojo,Verde,Negro,Blanco,Rosa,Amarillo", newLinknList);
		List<String> newLinknListJoin = new LinkedList<String>();
		
		System.out.println(newLinknListJoin + "Antes");
		newLinknListJoin.addAll(l_list);
		newLinknListJoin.addAll(newLinknList);
		System.out.println(newLinknListJoin + "Depues");
	}
	public static void cloneLinkedList(List<String> linknList) {
		//18. Write a Java program to clone an linked list to another linked list.
		List<String> Clone_l_list = null;
		System.out.println(Clone_l_list + " Antes");
		Clone_l_list = new LinkedList<String>(l_list);
		System.out.println(Clone_l_list  + "Depues");
	}
	public static void removeAndReturnFirstElement(List<String> linList) {
		//19. Write a Java program to remove and return the first element of a linked list.
		System.out.println(linList + " Antes");
		System.out.println(((LinkedList<String>) linList).pop() + " Elemento eliminado");
		System.out.println(linList + " Antes");
	}
	public static void retrieveButDoesNotRemoveFirstElemen(List<String> linkLis) {
		//20. Write a Java program to retrieve but does not remove, the first element of a linked list. 
		System.out.println(linkLis + " Antes");
		//linkLis.clear();
		System.out.println(((LinkedList<String>) linkLis).peekFirst());
	}
	public static void retrieveButDoesNotRemoveLasttElemen(List<String> linkLis) {
		//21. Write a Java program to retrieve but does not remove, the last element of a linked list.
		System.out.println(linkLis + " Antes");
		//linkLis.clear();
		System.out.println(((LinkedList<String>) linkLis).peekLast());
	}
	public static boolean checkIfAparticularElementExistsInAlinkedList(List<String> linkLis, String element) {
		//22. Write a Java program to check if a particular element exists in a linked list. 
		return linkLis.contains(element);
	}
	public static void convertAlinkedListToArrayList(List<String> linkLis) {
		//23. Write a Java program to convert a linked list to array list.
		List<String> arrayList = new ArrayList<String>(linkLis);
		System.out.println(arrayList.getClass());
		System.out.println(arrayList);
	}
	public static List<String> compareTwoLinkedLists(List<String> linkLis0, List<String> linkLis1) {
		//24. Write a Java program to compare two linked lists.
		List<String> linkLisCompare = new LinkedList<String>();
		for (String element : linkLis0) {
			linkLisCompare.add(linkLis1.contains(element) ? "Yes" : "No");
	    }
		//System.out.println(linkLisCompare);
		return linkLisCompare;
	}
	public static boolean testAnLinkedListIsEmptyOrNot(List<String> linkLis) {
		//25. Write a Java program to test an linked list is empty or not.
		return linkLis.isEmpty();
	}
	public static void replaceAnElementInALinkedList(List<String> linkLis, int index, String element) {
		//26. Write a Java program to replace an element in a linked list.
		System.out.println(l_list+"Antes");
		linkLis.set(index, element);
		System.out.println(l_list+"Despues");
	}
}
