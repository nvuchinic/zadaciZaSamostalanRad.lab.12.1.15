package zadatak1;

public class StackInt {
	private Node head;

	public StackInt() {
		head = null;
	}

	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}

	public void push(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}

	public int pop() {
		if (head == null)
			throw new IllegalArgumentException("Stack is empty!");
		Node current = head;
		head = head.next;
		int value = current.value;
		current = null;
		return value;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public int peek() {
		if (head == null)
			throw new IllegalArgumentException("Stack is empty!");
		return head.value;
	}

	public int getSize() {
		if (head == null)
			return 0;
		return getSize(head, 0);
	}

	private int getSize(Node current, int counter) {
		if (current == null)
			return counter;
		return getSize(current.next, counter + 1);
	}

	public boolean contains(int value) {
		if (head.value == value)
			return true;
		return contains(head, value);
	}

	private boolean contains(Node current, int value) {
		if (current == null)
			return false;
		if (current.value == value)
			return true;
		return contains(current.next, value);
	}

	public String printStack() {
		String stackToString = "";
		Node current = head;
		while (current != null) {
			stackToString += current.value + ",";
			current = current.next;
		}
		return stackToString;
	}

	class Node {
		public int value;
		public Node next;

		public Node(int value) {
			this.value = value;
			next = null;
		}
	}
}
