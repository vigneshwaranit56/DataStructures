package com.linear.list;

import java.util.Collection;

public interface ListI<T> {

	int size();

	boolean isEmpty();

	boolean contains(Object o);

	T[] toArray(T[] a);

	T[] toArray();

	boolean add(T t);

	boolean remove(Object o);

	boolean containsAll(Collection<?> c);

	void clear();

	boolean equals(Object o);

	int hashCode();

	T get(int index);

	T remove(int index);

	int indexOf(Object o);

	int lastIndexOf(Object o);
	
	void print(); 

}
