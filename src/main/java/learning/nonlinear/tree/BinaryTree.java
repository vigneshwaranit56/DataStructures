package learning.nonlinear.tree;

public class BinaryTree extends AbstractTree implements Tree {


	Node root;
	
	public void insert(Integer key) {
		 root = insert(root,key);
		
	}

	public Node insert(Node node, Integer key) {

		if (isEmpty(node))
			return new BNode(key);
		else {
			
			if (isEmpty(node.right))
				node.right = insert(node.right, key);
			else
				node.left = insert(node.left, key);

		}

		return node;
	}

	@Override
	public Boolean search(Integer key) {
		
		return search(root,key);
	}

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

	public Node delete(Node node, Integer value) {

		
		return null;
	}


}
