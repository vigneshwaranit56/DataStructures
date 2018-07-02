package com.nonlinear.tree;

public abstract class AbstractTree implements Tree {

	public void preOrder(Node node) {
		if (node != null)
			preOrder(node.left);
		preOrder(node.right);
		System.out.println(node.value);

	}

	public void inOrder(Node node) {
		if (node != null)
		inOrder(node.left);
		System.out.println(node.value);
		inOrder(node.right);
	}

	public void postOrder(Node node) {
		
		if (node != null)
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.value);

	}

	public void levelOrder(Node node) {

	}

	public Integer height(Node node) {

		return 0;

	}

	public Boolean isEmpty(Node node) {

		return false;
	}

}
