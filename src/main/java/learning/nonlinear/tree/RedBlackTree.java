package learning.nonlinear.tree;

public class RedBlackTree extends AbstractTree implements Tree {

	@Override
	public void delete(Integer value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insert(Integer item) {

        current = parent = grand = header;
        nullNode.element = item;
        while (current.element != item)
        {            
            great = grand; 
            grand = parent; 
            parent = current;
            current = item < current.element ? current.left : current.right;
            // Check if two red children and fix if so            
            if (current.left.color == RED && current.right.color == RED)
                handleReorient( item );
        }
        // Insertion fails if already present
        if (current != nullNode)
            return;
        current = new RedBlackNode(item, nullNode, nullNode);
        // Attach to parent
        if (item < parent.element)
            parent.left = current;
        else
            parent.right = current;        
        handleReorient( item );
    
	}

	@Override
	public Boolean search(Integer key)
	{
		return search(header.right, key);
	}

    private RedBlackNode current;
    private RedBlackNode parent;
    private RedBlackNode grand;
    private RedBlackNode great;
    private RedBlackNode header;    
    private static RedBlackNode nullNode;
    /* static initializer for nullNode */
    static 
    {
        nullNode = new RedBlackNode(0);
        nullNode.left = nullNode;
        nullNode.right = nullNode;
    }
    /* Black - 1  RED - 0 */
    static final int BLACK = 1;    
    static final int RED   = 0;

    /* Constructor */
    public RedBlackTree(int negInf)
    {
        header = new RedBlackNode(negInf);
        header.left = nullNode;
        header.right = nullNode;
    }
    /* Function to check if tree is empty */
    public boolean isEmpty()
    {
        return header.right == nullNode;
    }
    /* Make the tree logically empty */
    public void makeEmpty()
    {
        header.right = nullNode;
    }
    /* Function to insert item */

    private void handleReorient(int item)
    {
        // Do the color flip
        current.color = RED;
        current.left.color = BLACK;
        current.right.color = BLACK;

        if (parent.color == RED)   
        {
            // Have to rotate
            grand.color = RED;
            if (item < grand.element != item < parent.element)
                parent = rotate( item, grand );  // Start dbl rotate
            current = rotate(item, great );
            current.color = BLACK;
        }
        // Make root black
        header.right.color = BLACK; 
    }      
    private RedBlackNode rotate(int item, RedBlackNode parent)
    {
        if(item < parent.element)
            return parent.left = item < parent.left.element ? rotateWithLeftChild(parent.left) : rotateWithRightChild(parent.left) ;  
        else
            return parent.right = item < parent.right.element ? rotateWithLeftChild(parent.right) : rotateWithRightChild(parent.right);  
    }
    /* Rotate binary tree node with left child */
    private RedBlackNode rotateWithLeftChild(RedBlackNode k2)
    {
        RedBlackNode k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        return k1;
    }
    /* Rotate binary tree node with right child */
    private RedBlackNode rotateWithRightChild(RedBlackNode k1)
    {
        RedBlackNode k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
        return k2;
    }
    /* Functions to count number of nodes */
    public int countNodes()
    {
        return countNodes(header.right);
    }
    private int countNodes(RedBlackNode r)
    {
        if (r == nullNode)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(r.left);
            l += countNodes(r.right);
            return l;
        }
    }
  
    private boolean search(RedBlackNode r, int val)
    {
        boolean found = false;
        while ((r != nullNode) && !found)
        {
            int rval = r.element;
            if (val < rval)
                r = r.left;
            else if (val > rval)
                r = r.right;
            else
            {
                found = true;
                break;
            }
            found = search(r, val);
        }
        return found;
    }
    /* Function for inorder traversal */
    public void inorder()
    {
        inorder(header.right);
    }
    private void inorder(RedBlackNode r)
    {
        if (r != nullNode)
        {
            inorder(r.left);
            char c = 'B';
            if (r.color == 0)
                c = 'R';
            System.out.print(r.element +""+c+" ");
            inorder(r.right);
        }
    }
    /* Function for preorder traversal */
    public void preorder()
    {
        preorder(header.right);
    }
    private void preorder(RedBlackNode r)
    {
        if (r != nullNode)
        {
            char c = 'B';
            if (r.color == 0)
                c = 'R';
            System.out.print(r.element +""+c+" ");
            preorder(r.left);             
            preorder(r.right);
        }
    }
    /* Function for postorder traversal */
    public void postorder()
    {
        postorder(header.right);
    }
    private void postorder(RedBlackNode r)
    {
        if (r != nullNode)
        {
            postorder(r.left);             
            postorder(r.right);
            char c = 'B';
            if (r.color == 0)
                c = 'R';
            System.out.print(r.element +""+c+" ");
        }
    }     
}



