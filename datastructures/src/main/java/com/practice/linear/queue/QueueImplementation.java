package com.practice.linear.queue;

public class QueueImplementation<T> implements Queue<T> {

	
	
	private T[] arr;
	private Integer size;
	private Integer front;
	private Integer rear;
	public QueueImplementation(Integer size) {
		super();
		this.size = size;
		this.front = -1;
		this.rear = -1;
		this.arr = (T[])new Object[size];
	}
	@Override
	public void enqueue(T data) throws Exception {
		if(isFull())
			throw new Exception("queue is full");
		System.out.println();
		arr[++rear] = data;
	}


	@Override
	public T dequeue() throws Exception {
		if(isEmpty())
			throw new Exception("queue is empty");

		return arr[++front];
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return arr[rear];
	}

	@Override
	public Boolean isEmpty() {
		// TODO Auto-generated method stub
		return rear == -1;
	}

	@Override
	public Boolean isFull() {
		// TODO Auto-generated method stub
		return size-1 == rear;
	}

	@Override
	public void print() {
		System.out.println(front);
		for (int i = (front == -1)? 0:front; i <=rear; i++) {
			System.out.print(arr[i] + " ");
		}	
		System.out.println();
	}

	@Override
	public Integer size() {
		// TODO Auto-generated method stub
		return rear-front;
	}
	@Override
	public T front() {
		// TODO Auto-generated method stub
		return arr[front];
	}
	@Override
	public T rear() {
		// TODO Auto-generated method stub
		return arr[rear];
	}

}
