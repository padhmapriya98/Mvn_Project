package com.testng_features;

import org.testng.annotations.Test;

public class TimeOut_Test {
	
	@Test(timeOut = 9000)
	private void browserLaunch() throws Throwable {

		System.out.println("browser launch");
		Thread.sleep(2000);
		
		System.out.println("username");
		System.out.println("password");
		System.out.println("login");
		
		Thread.sleep(4000);
		
		Thread.sleep(1000);
		
		System.out.println("navigate to home page");
	}
	
	
	
	
	
	
	
	

}
