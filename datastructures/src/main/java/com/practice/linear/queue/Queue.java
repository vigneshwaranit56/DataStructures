package com.practice.linear.queue;

public interface Queue<T> {

	void enqueue(T data) throws Exception;

	T dequeue() throws Exception;

	T peek();

	Boolean isEmpty();

	Boolean isFull();

	void print();

	Integer size();

	T front();

	T rear();

}
