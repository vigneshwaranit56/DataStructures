package com.nonlinear.tree;

public interface Tree {
	
	public  void preOrder(Node node);

	public  void inOrder(Node node);

	public void postOrder(Node node);

	public  void levelOrder(Node node);

	public  Node delete(Node node, Integer value);

	Node insert(Node node, Integer key);

	Boolean search(Node node, Integer key);
	
	Integer height(Node node);

	Boolean isEmpty(Node node);
	
	 public int countNodes(Node r);


}
