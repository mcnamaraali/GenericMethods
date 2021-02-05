package structures;

import java.util.NoSuchElementException;

public class StackTest {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(-3);
		stack.print();
		stack.push(-2);
		stack.print();
		stack.push(-1);
		stack.print();
		stack.push(0);
		stack.print();
		stack.push(1);
		stack.print();
		stack.push(2);
		stack.print();
		stack.push(3);
		stack.print();
		
		boolean continueLoop = true;
		
		while (continueLoop) {
			try {
				int removedItem = stack.pop();
				System.out.printf("%n%d popped%n", removedItem);
				stack.print();
			} catch (NoSuchElementException e) {
				continueLoop = false;
				e.printStackTrace();
			}
		}

	}

}
