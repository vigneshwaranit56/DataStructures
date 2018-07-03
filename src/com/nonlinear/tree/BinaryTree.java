package com.nonlinear.tree;

public class BinaryTree extends AbstractTree implements Tree {


	
	public void insert(Integer key) {
		 root = insert(root,key);
		
	}
	@Override
	public Node insert(Node node, Integer key) {

		if (isEmpty(node))
			return new Node(key);
		else {
			
			if (isEmpty(node.right))
				node.right = insert(node.right, key);
			else
				node.left = insert(node.left, key);

		}

		return node;
	}

	public Boolean search(int key) {
		
		return search(root,key);
	}
	@Override
	public Boolean search(Node node, Integer key) {

		if (isEmpty(node))
			return false;

		if (node.value == key)
			return true;
		if (!isEmpty(node.right))
			if (search(node.right, key))
				return true;

		if (!isEmpty(node.left))
			if (search(node.left, key))
				return true;

		return false;
	} 
	
	public void delete(Integer key) {
		delete(root, key);
		
	}

	public int countNodes() {
		return countNodes(root);
	}
	@Override
	public Node delete(Node node, Integer value) {

		
		return null;
	}

}
