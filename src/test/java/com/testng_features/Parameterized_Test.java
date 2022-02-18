package com.testng_features;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameterized_Test {
	
	@Test
	@Parameters({"username","password"})
	private void Credentials(@Optional("watson")String username ,String age ) {
		
		System.out.println("username : "+ username);
		
//        System.out.println("password : "+password);
		
		int value = Integer.parseInt(age);
		
		System.out.println(value);
	}
	

}
