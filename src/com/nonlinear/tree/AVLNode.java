package com.nonlinear.tree;

public class AVLNode {
	Integer value;
	AVLNode left;
	AVLNode right;
	int height;
	
    public AVLNode()
    {
        left = null;
        right = null;
        value = 0;
        height = 0;
    }
   
    public AVLNode(Integer n)
    {
        left = null;
        right = null;
        value = n;
        height = 0;
    }     

}
