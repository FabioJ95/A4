public class A4Stack<T> implements Stack<T> {
	
	private Node<T> head;

	public A4Stack() {
		head = null;
	}
	
	public void push(T v) {
		// TODO: implement this
	}
	
	public T pop() {
		if (isEmpty()) {
			// exception handling is done for you -- we will learn about
			// expections in the next unit. Don't change this.
			throw new EmptyStackException("Can't pop - stack is empty");
		}
		// TODO: implement this	

		return null; // so it compiles
	}
	
	public void popAll() {
		// TODO: implement this	
	}
	
	public boolean isEmpty() {
		// TODO: implement this	

		return false; // so it compiles
	}
	
	public T top() {
		if (isEmpty()) {
			// exception handling is done for you -- we will learn about
			// expections in the next unit. Don't change this.
			throw new EmptyStackException("Can't pop - stack is empty");
		}
		// TODO: implement this	

		return null; // so it compiles
	}
}