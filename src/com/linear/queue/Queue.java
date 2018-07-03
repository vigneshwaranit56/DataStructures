package com.linear.queue;

public class Queue extends QueueInterface {

	public Queue(Integer size) {
		super(size);

	}

	@Override
	public void enQueue(int n) {

		if (isFull()) {
			try {
				throw new Exception("overflow");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else
			arr[++rear] = n;

	}

	@Override
	public Integer deQueue() {
		int del = 0;
		if (isEmpty()) {
			try {
				throw new Exception("overflow");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			int index = ++front;
			del = arr[index];
			arr[index] = 0;

		}

		return del;

	}

	public static void main(String args[]) {

		QueueInterface interface1 = new Queue(5);

		interface1.enQueue(5);
		interface1.enQueue(8);
		interface1.enQueue(9);
		interface1.enQueue(10);

		System.out.println(interface1.peek());

	}

}
