package com.code.Calculator;

import static org.junit.Assert.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

	
	public class testcalculator {
	public void test() {
		Calculatorcalculation cal = new Calculatorcalculation();

		int answer = cal.add(29,20);

		assertEquals(49,answer);

		answer = cal.subtract(5, 2);
				
		assertEquals(3, answer);

		answer = cal.multiply(3, 2);

		assertEquals(6,answer);

		answer = cal.divide(89, 49);

		assertEquals(1, answer);
		
        answer = cal.modulus(8, 4);
          
        assertEquals(0, answer);
	}

}
