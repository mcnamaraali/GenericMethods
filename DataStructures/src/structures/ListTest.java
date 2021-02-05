package structures;

import java.util.NoSuchElementException;

public class ListTest {

	public static void main(String[] args) {
		List<Integer> list = new List<>();
		
		//Insert integers in list
		list.insertAtFront(-1);
		list.print();
		list.insertAtFront(0);
		list.print();
		list.insertAtBack(1);
		list.print();
		list.insertAtBack(5);
		list.print();
		
		try {
			int removedItem = list.removeFromFront();
			System.out.printf("%n%d removed %n", removedItem);
			list.print();
			
			removedItem = list.removeFromFront();
			System.out.printf("%n%d removed %n", removedItem);
			list.print();
			
			removedItem = list.removeFromFront();
			System.out.printf("%n%d removed %n", removedItem);
			list.print();
		}
		catch (NoSuchElementException noSuchElementException) {
			noSuchElementException.printStackTrace();
		}

	}

}
