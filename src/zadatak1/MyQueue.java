package zadatak1;

public class MyQueue {
	StackInt stack1;
	StackInt stack2;

	public MyQueue() {
		stack1 = new StackInt();
		stack2 = new StackInt();
	}

	public void push(int value) {
		stack1.push(value);
	}

	public void loadTheQueue() {
		int size = stack1.getSize();
		while (size > 0) {
			stack2.push(stack1.pop());
			size--;
		}
	}

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
