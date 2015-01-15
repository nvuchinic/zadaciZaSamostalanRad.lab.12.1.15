package zadatak1;

public class TestMyQueue {
	public static void main(String[] args) {
		MyQueue mq = new MyQueue();
		mq.push(43);
		mq.push(23);
		mq.push(11);
		mq.push(64);
		System.out.println("Vrijednosti u stacku: " + mq.stack1.printStack());

		System.out.println("Vrijednosti u MyQueue-u: ");
		System.out.println(mq.printMyQueue());
		// System.out.println(mq.stack1.printStack());

		// System.out.println(mq.stack2.printStack());

		System.out.println();
		// mq.printMyQueue();
		System.out.println("Skidam sa MyQueue-a: " + mq.popMyQueue());
		System.out.println("Skidam sa MyQueue-a: " + mq.popMyQueue());
		// System.out.println(mq.pop());
		// System.out.println(mq.pop());

		// System.out.println("Vrijednosti u MYQueu-u "+mq.printMyQueue());
	}
}
