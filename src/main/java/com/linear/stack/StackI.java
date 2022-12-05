package com.linear.stack;

public interface StackI<T> {
	
	void push(T data) throws Exception; // insert

	T pop()throws Exception; //delete

	T peek(); // last inserted data

	Boolean isEmpty(); // empty?

	Boolean isFull(); // full?
	
	void print(); // print entire 
	
	Integer size(); // size
}
