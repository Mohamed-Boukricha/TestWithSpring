package suitFibonacci.test;

import junit.framework.*;
public class BinStringTest extends TestCase {
	private BinString binString;
	
	public BinStringTest(String name) {
	super (name);
									}
 protected void setUp() {
	 		binString = new BinString ();
 						}
 public void testSumFunction () {
	 /**
	  * The first test is with a empty field like "".
	  * The expected result is the asci code of "" 0
	  */
	 	
	 	int expected = 0;
	 	assertEquals(expected, binString.sum(""));
	 	
	 	/**
		  * The Second  test is with a caracter like "d".
		  * The expected result is the asci code of "d" 100
		  */
		 		 
	 	expected = 100;
	 	assertEquals(expected, binString.sum("d"));
	 	/**
		  * The Third   test is with a caracter like "Add".
		  * The expected result is the asci code of the sum "Add" "265"
		  */
	 	
	 	expected = 265;
	 	assertEquals(expected , binString.sum("Add"));
	 							}
public void testBinariseFunction () {
	
		String expected = "101";
		assertEquals(expected, binString.binarise(5));
		expected = "11111100";
		assertEquals(expected, binString.binarise(252));
	 								}
public void testTotalConversion () {
		String expected = "1000001";
		assertEquals(expected, binString.convert("A"));
	 }
}