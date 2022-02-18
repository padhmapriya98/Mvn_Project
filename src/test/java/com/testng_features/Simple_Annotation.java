package com.testng_features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation {
	
	@BeforeSuite
	private void set_Properties() {
		System.out.println("Set property");
	}
	@AfterSuite
	private void get_Properties() {
		System.out.println("get property");
	}
	@BeforeTest
	private void browser_Launch() {
        System.out.println("Browser launch");		
	}
	@AfterTest
	private void browser_close() {
		System.out.println("close");
	}
	@BeforeClass
	private void geturl() {
		System.out.println("geturl");
	}
	@AfterClass
	private void verify_Homepage() {
		System.out.println("Home page");
	}
	@Test
	private void women() {
		System.out.println("women");
	}
	@BeforeMethod
	private void signin() {
		System.out.println("signin");
	}
	@AfterMethod
	private void signout() {
		System.out.println("signout");
	}
    @Test
    private void child() {
    	System.out.println("child");
	}
    @Test
    private void men() {
    	System.out.println("men");
	}
}
