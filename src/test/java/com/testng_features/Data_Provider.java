package com.testng_features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	@Test(dataProvider = "data_Value")
    private void Credentials(String username , String password ) {
       
		System.out.println("username : "+username);
		System.out.println("password : "+password);
	}
	@DataProvider
	private Object[][] data_Value() {
		
		return new Object[][] {
			
			{"smith", "1234"},
			{"watson", "as12"},
			{"starc" , "asdf"}
			
		
		};

	
	}
	
	
}
