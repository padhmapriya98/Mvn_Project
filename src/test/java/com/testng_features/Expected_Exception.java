package com.testng_features;

import org.testng.annotations.Test;

public class Expected_Exception {
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void features() {
	      
		int a =20;
		
		System.out.println(a/0);

	}

}
