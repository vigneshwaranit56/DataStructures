package com.nonlinear.tree;

public class BinarySearchTree extends AbstractTree implements Tree {

	public void insert(Integer key) {
		insert(root, key);
	}

	@Override
	public Node insert(Node node, Integer key) {

		if (isEmpty(node))
			node = new Node(key);
		else if (node.value <= key)
			node.left = insert(node.left, key);
		else
			node.right = insert(node.right, key);

		return node;
	}

	public boolean search(Integer val) {
		return search(root, val);
	}

	@Override
	public Boolean search(Node node, Integer key) {

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

	public void delete(int key) {

		if (search(key))
			delete(root, key);
		else
			System.out.println("key not present");

	}

	public Node minimumElement(Node node) {

		if (node.left == null)
			return node;
		else
			return minimumElement(node.left);

	}

	@Override
	public Node delete(Node node, Integer value) {

		if (isEmpty(node))
			return null;

		if (node.value < value)
			delete(node.left, value);
		else if (node.value > value)
			delete(node.right, value);
		else {
			if (!isEmpty(node.left) && !isEmpty(node.right)) {
				Node temp = root;

				Node minNode = minimumElement(temp.right);

				node.value = minNode.value;
				delete(root.right, minNode.value);

				System.out.println();
			} else if (!isEmpty(node.left))
				root = node.left;

			else if (!isEmpty(node.right))
				root = node.left;

			else
				root = null;
		}

		return node;
	}

}
