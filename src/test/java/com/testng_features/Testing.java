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

public class Testing {
	@Test
	private void browserLauch() {
		System.out.println();
	}
	@BeforeMethod
	private void signin() {
		System.out.println("signin");
	}
	@AfterMethod
	private void signout() {
		System.out.println("signout");
	}
	@AfterClass
	private void dress() {
		System.out.println("dress");
	}
	@AfterSuite
	private void women() {
		System.out.println("women");
	}
	@AfterTest
	private void tshirt() {
		System.out.println("tshirt");
	}
	@BeforeClass
	private void cart() {
		System.out.println("cart");
	}
	@BeforeTest
	private void driver() {
		System.out.println("driver");
	}
	@BeforeSuite
	private void delete() {
		System.out.println("delete");
	}
	
	
	
	
	
	
	
}
