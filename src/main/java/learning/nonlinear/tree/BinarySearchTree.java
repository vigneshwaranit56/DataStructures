package learning.nonlinear.tree;

public class BinarySearchTree extends AbstractTree implements Tree {
	Node root;

	@Override
	public void insert(Integer key) {
		root = insert(root, key);
	}

	
	public Node insert(Node node, Integer key) {

		if (isEmpty(node))
			node = new BNode(key);
		else if (node.value <= key)
			node.left = insert(node.left, key);
		else
			node.right = insert(node.right, key);

		return node;
	}

	@Override
	public Boolean search(Integer key) {
		return search(root, key);
	}

	
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

	@Override
	public void delete(Integer value) {
		delete(root, value);
	}

}
