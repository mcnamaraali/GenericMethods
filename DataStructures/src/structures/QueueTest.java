package structures;

import java.util.NoSuchElementException;

public class QueueTest {

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<>();
		
		queue.queue(1); //Person 1
		queue.print();
		queue.queue(2); //Person 2
		queue.print();
		queue.queue(3); //Person 3
		queue.print();
		queue.queue(4); //Person 4
		queue.print();
		queue.queue(5); //Person 5
		queue.print();
		queue.queue(6); //Person 6
		queue.print();
		
		boolean continueLoop = true;
		
		while(continueLoop) {
			try {
				int removedItem = queue.unqueue();
				System.out.printf("%n%d unqueuing %n", removedItem);
				queue.print();
			} catch (NoSuchElementException e) {
				continueLoop = false;
				e.printStackTrace();
			}
		}

	}

}
