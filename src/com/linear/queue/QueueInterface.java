package com.linear.queue;

public abstract class QueueInterface {
	
	int arr[];
	int front =-1;
	int rear = -1;
	int size = 0;
	
	public QueueInterface(int size) {
		arr= new int[size];
		this.size = size;

	}

	abstract void enQueue(int n);

	abstract Integer deQueue();
	
	public void display(){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println(); 
	}

	int peek() {
	return arr[rear];
	}

	public boolean isEmpty() {
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
