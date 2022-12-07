package com.linear.list.singlylinklist;

import java.util.Collection;

import com.linear.list.ListI;

public class SinglyLinkList<T> implements ListI<T> {

	private int size = 0;

	private Node<T> head;

	private T[] a;

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public boolean contains(Object o) {
		Node<T> temp = head;
		while (temp != null) {
			if (temp.getT() == o) {
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}

	@Override
	public T[] toArray(T[] a) {
		int index = 0;
		Node<T> temp = head;

		while (temp != null) {
			a[index++] = temp.getT();
			temp = temp.getNext();

		}

		return a;
	}

	@Override
	public boolean add(T t) {
		Node<T> temp = head;
		boolean isfound = false;
		while (temp != null) {
			if (temp.getT() == t) {
				isfound = true;
				break;
			}
			temp = temp.getNext();
		}
		Node<T> newNode = new Node<T>(t);
		newNode.setNext(head);
		head = newNode;
		size++;
		return isfound;
	}

	@Override
	public boolean remove(Object o) {
		Node<T> temp = head;
		Node<T> prev = null;
		boolean isfound = false;

		if (head.getT() == o) {
			head = temp.getNext();
			return Boolean.TRUE;
		}

		while (temp != null) {

			if (temp.getT() == o) {
				isfound = true;
				break;
			}
			prev = temp;
			temp = temp.getNext();
		}

		prev.setNext(temp.getNext());

		return isfound;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		head = null;
	}

	@Override
	public T get(int index) {
		if(a == null) {
			toArray();
			}
		if (size == a.length + 1)
			return a[index];
		toArray();
		return a[index];
	}

	@Override
	public T remove(int index) {
		if(a == null) {
			toArray();
			}

		if (size == a.length + 1) {
			T t = a[index];
			a[index] = null;
			return t;
		}
		T t = a[index];
		a[index] = null;
		return t;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T[] toArray() {

		if(a == null) {
		a = (T[]) new Object[size];
		}

		if (size == a.length + 1)
			return a;

		int index = 0;
		Node<T> temp = head;

		while (temp != null) {
			a[index++] = temp.getT();
			temp = temp.getNext();

		}

		return a;

	}

	@Override
	public void print() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.getT() + "   ");
			temp = temp.getNext();
		}
		System.out.println();
	}

}
