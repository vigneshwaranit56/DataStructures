package com.linear.queue;

import java.util.Stack;

public class QueueUsingTwoStack<T> {

	Stack<T> stack1 = new Stack<T>();
	Stack<T> stack2 = new Stack<T>();

	public void enQueue(T n) {
		stack1.push(n);

	}

	public T peek() {
		if (stack2.isEmpty())
			shift();
		return stack2.peek();
	}

	public T deQueue(T n) {

		if (stack2.isEmpty())
			shift();

		return stack2.pop();

	}

	public void shift() {

		if (stack2.isEmpty()) {
			while (!stack1.isEmpty())
				stack2.push(stack1.pop());
		}

	}

	public int size() {

		return stack1.size() + stack2.size();

	}
}
