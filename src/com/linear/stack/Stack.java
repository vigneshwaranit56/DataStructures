package com.linear.stack;

public class Stack {

	int[] arr;
	int size;
	int top = -1;

	Stack(int size) {
		arr = new int[size];
		this.size = size;
	}

	public void push(int n) {
		try {
			if (isFull())
				throw new Exception("over flow");
		} catch (Exception e) {
			e.printStackTrace();
		}

		arr[++top] = n;
	}

	public int pop() {

		try {
			if (isFull())
				throw new Exception("over flow");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return arr[top--];

	}

	public int size() {

		return top + 1;
	}

	public int peek() {

		return arr[top];
	}

	public boolean isFull() {
		return top == size - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public static void main(String args[]) {

		Stack stk = new Stack(5);

		stk.push(5);
		stk.push(4);
		stk.push(3);
		stk.push(2);
		stk.push(1);
		stk.pop();

		System.out.println(stk.size());

	}
}
