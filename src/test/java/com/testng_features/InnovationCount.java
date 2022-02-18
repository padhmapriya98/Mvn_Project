package com.testng_features;

import org.testng.annotations.Test;

public class InnovationCount {
	@Test(priority = -1)
	private void setProperty() {
		System.out.println("set property");

	}
	@Test(priority = 0)
	private void getUrl() {
		System.out.println("url");
	}
    @Test(priority = 0)
	private void browserLaunch() {
    	System.out.println("browser launch");
	}
    @Test(priority = 2, invocationCount = 3)
    private void refresh() {
    	System.out.println("refresh");

	}
}
