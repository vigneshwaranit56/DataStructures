package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.problems.StringEdits;

public class StringManipulationTest {

	
	@Test
	public void testManiulation() {
		
		StringEdits strEdits = new StringEdits();
		int count = strEdits.countOfEdits("bale","belf");
		assertEquals(count, 1);
		
		
	}
}

