package com.testng_features;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept {
	
	
	@Test
	private void username() {
		String actual_Username="watson";
		String expected_Username="watson12";
		
//		Assert.assertEquals(actual_Username, expected_Username);
        
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual_Username, expected_Username);
		
		System.out.println("username validation");
	}
	@Test
	private void password() {
		String actual_Password="watson12";
		String expected_Password="watson12";
		
//		Assert.assertEquals(actual_Password, expected_Password);

		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual_Password, expected_Password);
	
		System.out.println("password validation");
	}

}

