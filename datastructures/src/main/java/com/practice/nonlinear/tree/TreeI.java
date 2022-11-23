package com.practice.nonlinear.tree;

public interface TreeI<T>{
	
	void insert(T t)throws Exception;
	
	void delete(T t);
	
	Boolean search(T t);
	
	void print();
	
	void preOrder();
	
	void inOrder();
	
	void postOrder();
	

}
