package com.nonlinear.tree;

public class AVLTree extends AbstractTree implements Tree {
	
	
	AVLNode root;
	
	@Override
	public void insert(Integer key) {
		root = insert(root, key);
		
	}


	@Override
	public void delete( Integer value) {
		delete(root,value);

	}
	
	private void delete(AVLNode root, Integer value) {
		
	}


	@Override
	public Boolean search(Integer key) {
		return search(root, key);
	}

	public Boolean search(AVLNode node, Integer key) {

		if (isEmpty(node))
			return false;

		if (node.value == key)
			return true;

		if (key < node.value)
			if (!isEmpty(node.left))
				if (search(node.left, key))
					return true;

		if (key > node.value)
			if (!isEmpty(node.right))
				if (search(node.right, key))
					return true;

		return false;
	}

	 private int heightA(AVLNode t )
     {
         return t == null ? -1 : t.height;
     }
	 
	
	


	private AVLNode insert(AVLNode node, Integer key) {

		if (isEmpty(node)) {
			node = new AVLNode(key);

		} else if (key < node.value) {
			
			node.left = insert((AVLNode)node.left, key);


			if (heightA((AVLNode) node.left) - heightA((AVLNode) node.right) == 2) {
				if (key < node.left.value)
					node = rotateWithLeftChild(node);
				else
					node = doubleWithLeftChild(node);
			}

		} else if (key > node.value) {

			node.right = insert((AVLNode)node.right, key);
			if (heightA((AVLNode) node.right) - heightA((AVLNode) node.left) == 2) {

			if (key > node.left.value)
				node = rotateWithRightChild(node);
			else
				node = doubleWithRightChild(node);
			}

		}

		node.height = Math.max(heightA(node.left), heightA(node.right)) + 1;

		return node;

	}


	private AVLNode doubleWithRightChild(AVLNode node) {
		node.left = doubleWithLeftChild((AVLNode) node.left);
		return doubleWithRightChild((AVLNode) node.right);

	}


	private AVLNode rotateWithRightChild(AVLNode node) {

		AVLNode node2 = (AVLNode) node.right;
		node.right = node2.left;
		node.left = node2;
		node.height = Math.max(heightA(node.left), heightA(node.right)) + 1;
		node2.height = Math.max(heightA(node2.left), node.height) + 1;

		return node2;

	}


	private AVLNode doubleWithLeftChild(AVLNode node) {
		
		node.left = doubleWithRightChild((AVLNode) node.left);
		return doubleWithLeftChild((AVLNode)node.right);
		
	}


	private AVLNode rotateWithLeftChild(AVLNode node) {
		 AVLNode node2 = (AVLNode) node.left;
	        node.left = node2.right;
	        node2.right = node;
	        node.height = Math.max( heightA( node2.left ), heightA( node2.right ) ) + 1;
	        node2.height =Math. max( heightA( node.left ), node2.height ) + 1;
	        
	return node2;
	}

}
