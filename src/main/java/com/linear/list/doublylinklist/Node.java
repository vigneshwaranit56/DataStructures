package com.linear.list.doublylinklist;

public class Node<T> {

	private Node<T> prev;
	
	private T data;

	private Node<T> next;

	public Node(T t) {
		super();
		this.data = t;
		this.prev = null;
		this.prev = null;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Node<T> getPrev() {
		return prev;
	}

	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
