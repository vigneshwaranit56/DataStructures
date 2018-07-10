package com.linear.linkedlist.test;

import org.junit.Assert;
import org.junit.Test;

import com.linear.linkedlist.SinglelyLinkList;
import com.test.TestDataStructure;

public class SingleyLinkListTest implements TestDataStructure{
	SinglelyLinkList linkListTest = new SinglelyLinkList();

	public void add() {
		linkListTest.add(5);
		linkListTest.add(6);
		linkListTest.add(7);
		linkListTest.add(8);
		linkListTest.add(9);
	}

	@Test
	public void insertTest() {
		add();
		Assert.assertEquals("98765", linkListTest.print());

	}

	@Test
	public void containsTest() {
		add();
		Assert.assertEquals(false, linkListTest.contains(10));
	}

	@Test
	public void deleteTest() {
		add();
		linkListTest.remove(9);
		Assert.assertEquals("8765", linkListTest.print());
	}

	@Test
	public void sizeTest() {
		add();
		Assert.assertEquals(5, linkListTest.size());
	}

}
