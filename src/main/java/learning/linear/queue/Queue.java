package learning.linear.queue;

public  class Queue {
	
	int arr[];
	int front =-1;
	int rear = -1;
	int size = 0;
	
	public Queue(int size) {
		arr= new int[size];
		this.size = size;

	}

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
