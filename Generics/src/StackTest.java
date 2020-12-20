import java.util.NoSuchElementException;

public class StackTest {

	public static void main(String[] args) {
		Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
		Integer[] integerElements = {1,2,3,4};
		
		Stack<Double> doubleStack = new Stack<>(5);
		Stack<Integer> integerStack = new Stack<>();
		
		testPush("doubleStack", doubleStack, doubleElements); //add - push on
		testPop("doubleStack", doubleStack);//pop off - remove
		
		testPush("integerStack", integerStack, integerElements); //add - push on
		testPop("integerStack", integerStack);//pop off - remove

	}

	private static <E> void testPush(String name, Stack<E> stack, E[] elements) {
		System.out.printf("%nPushing elements onto %s", name);
		
		for (E element: elements) {
			System.out.printf("%s ", element);
			stack.push(element);
			
		}				
	}
	
	private static <E> void testPop(String name, Stack<E> stack) {
		try {
			System.out.printf("%nPopping elements from %s", name);
			E popValue;
			while (true) {
				popValue = stack.pop();
				System.out.printf("%s ", popValue);
			}
		}
		catch(NoSuchElementException noSuchElementException) {
			System.err.println();
			noSuchElementException.printStackTrace();
		}
	}

}
