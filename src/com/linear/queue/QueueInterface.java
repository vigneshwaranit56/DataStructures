package com.linear.queue;

public abstract class QueueInterface {
	
	int arr[];
	int front;
	int rear = -1;
	int size = -1;
	
	public QueueInterface(int size) {
		arr= new int[size];
		this.size = size;

	}

	abstract void enQueue(int n);

	abstract void deQueue(int n);
	
	public void display(){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println(); 
	}

	int peek() {
	return arr[rear];
	}

	boolean isEmpty() {
		return front == rear || front == size-1;
	}

	boolean isFull() {
		return rear == size - 1;
	}

	int front() {
		return arr[front];
	}

	int rear() {
		return arr[rear];
	}

}
