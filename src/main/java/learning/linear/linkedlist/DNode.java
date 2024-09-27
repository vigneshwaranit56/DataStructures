package learning.linear.linkedlist;

public class DNode  {

	DNode prev;
	DNode next;
	Integer data;

	DNode(Integer data){
		this.data = data;
		next = null;
		prev =null;
	}
}
