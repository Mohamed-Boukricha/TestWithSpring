package suitFibonacci;

import junit.framework.TestCase;


public class SuitFibonacciTest extends TestCase {
private SuitFibonacci suitfibonacci;

	protected void setUp() {
	suitfibonacci = new SuitFibonacci();
	}
	public void testSuit () {
		/**
		 * First Test 
		 */
		int expected[] = {0,1,1,2,3,5};
		
		int resultset[]=suitfibonacci.suitfibo(6);
		
		int i;
		for (i=0 ; i<6; i++)
		{
			assertEquals(expected[i],resultset[i]);
			
		}
		
		
	
		//assertEquals(expected, resultset);
	
	 //	assertEquals(expected, );
		
	}
	
	
	
}
