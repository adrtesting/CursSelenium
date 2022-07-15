package curs8;


import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AssertionExample {
	
	String unu = "Test";
	String doi = "Alt test";
	
	@Test
	public void checkStringAreEqual() {
		
		if(unu.equals(doi)) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}
	}
	
	@Test
	public void checkStringAreEqual2() {
		assertEquals(unu, doi);
		assertTrue(false);
		assertFalse(false);
		assertNull(doi);
	}

}
