package com.practice.linear.queue;

public class QueueApplication {
	public static void main(String args[]) throws Exception {
		
		QueueImplementation<Integer> queueImplementation = new QueueImplementation<>(5);
		
		queueImplementation.enqueue(5);
		queueImplementation.print();
		queueImplementation.enqueue(5);
		queueImplementation.enqueue(5);

		queueImplementation.print();

		queueImplementation.dequeue();
		queueImplementation.dequeue();
		queueImplementation.print();

		queueImplementation.enqueue(4);

		queueImplementation.print();

		System.out.println(queueImplementation.peek());
		System.out.println(queueImplementation.front());
		System.out.println(queueImplementation.rear());

	}

}
