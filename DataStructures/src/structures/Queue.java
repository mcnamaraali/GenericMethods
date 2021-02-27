package structures;

import java.util.NoSuchElementException;

public class Queue<E> {
	
	private List<E> queueList;
	
	public Queue() {
		queueList = new List<E>("queue");
	}
	
	public void queue(E object) { 
		queueList.insertAtBack(object);
		}
	
	public E unqueue() throws NoSuchElementException {
		return queueList.removeFromFront();
	}
	
	public boolean isEmpty() {
		return queueList.isEmpty();
		}
	
	public void print() {
		queueList.print();
	}

}
