package com.linear.linkedlist.test;

import org.junit.Assert;
import org.junit.Test;

import com.linear.linkedlist.DoublyLinkList;
import com.test.TestDataStructure;

public class DoublyLinkListTest implements TestDataStructure {

	DoublyLinkList dll = new DoublyLinkList();

	public void add() {
		
		dll.add(5);
		dll.add(6);
		dll.add(7);
		dll.add(8);
		dll.add(9);

	}

	@Test
	public void insertTest() {
		add();
		Assert.assertEquals("56789", dll.print());
	}

	@Test
	public void containsTest() {
		add();
		Assert.assertEquals(true, dll.contains(9));
	}

	@Test
	public void deleteTest() {
		add();
		dll.remove(8);
		Assert.assertEquals("5679", dll.print());

	}

	public void sizeTest() {
		// TODO Auto-generated method stub

	}

}
