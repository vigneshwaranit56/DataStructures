package com.nonlinear.tree;

import java.util.ArrayDeque;

public abstract class AbstractTree  {
	
	public Node root;

	

	public <T> void preOrder(T n) {
		
		if(n.getClass().isInstance(Node.class)) {
			Node node = (Node)n;
			if (node != null)
				preOrder(node.left);
			preOrder(node.right);
			System.out.println(node.value);
			
			
		}else if(n.getClass().isInstance(AVLNode.class)) {
			
			AVLNode node = (AVLNode)n;
			if (node != null)
				preOrder(node.left);
			preOrder(node.right);
			System.out.println(node.value);
		}
		
		
		
		

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

		ArrayDeque<Node> arr = new ArrayDeque<Node>();
		arr.add(node);

		while (!arr.isEmpty()) {

			Node child = arr.poll();

			System.out.print(child.value + " ");

			if (child.left != null)
				arr.add(child.left);

			if (child.right != null)
				arr.add(child.right);

		}

	}

	public Integer height(Node node) {

		if (node != null)
			return -1;

		int left = height(node);
		int right = height(node);

		int height = 1 + Math.max(left, right);

		return height;

	}

	public <T> Boolean isEmpty(T node) {

		return node == null;
	}

	public void topView(Node node) {

		if (!isEmpty(node)) {
			printLeft(node.left);
			System.out.println();
			printRight(node.right);
		}

	}

	private void printRight(Node right) {

		if (!isEmpty(right)) {
			printRight(right);
			System.out.println(right.value);
		}
	}

	private void printLeft(Node left) {

		if (!isEmpty(left)) {
			printLeft(left);
			System.out.println(left.value);

		}

	}
	
	 public int countNodes(Node r)
     {
         if (r == null)
             return 0;
         else
         {
             int l = 1;
             l += countNodes(r.getLeft());
             l += countNodes(r.getRight());
             return l;
         }
     }

}
