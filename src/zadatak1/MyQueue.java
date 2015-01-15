package zadatak1;
/**
 * class consisting of two stacks simulating the queue data structure
 * */
public class MyQueue {
	StackInt stack1;
	StackInt stack2;

/**
 * constructor method for creating MyQueue objects
 * */
	public MyQueue() {
		stack1 = new StackInt();
		stack2 = new StackInt();
	}
/**
 * inserts value into stack1 
 * */
 	public void push(int value) {
		stack1.push(value);
	}
/**
 * loads queue(insert elements from stack1 to stack2)
 * */
	public void loadTheQueue() {
		int size = stack1.getSize();
		while (size > 0) {
			stack2.push(stack1.pop());
			size--;
		}
	}
/**
 * returns and removes element from the queue
 * */
	public int popMyQueue() {
		if (stack2.isEmpty() == true) {
			if (stack1.isEmpty() == true) {
				throw new IllegalArgumentException("MyQueue is empty!");
			} else {
				loadTheQueue();
				return stack2.pop();
			}
		}

		else {
			return stack2.pop();
		}
	}
	/**
	 * prints the elements of queue
	 * */
	public String printMyQueue() {
		if (!stack2.isEmpty()) {
			return stack2.printStack();
		} else {
			if (stack1.isEmpty()) {
				throw new IllegalStateException("MyQueue is empty");
			} else {
				loadTheQueue();
			}
			return stack2.printStack();
		}

	}

	
}
