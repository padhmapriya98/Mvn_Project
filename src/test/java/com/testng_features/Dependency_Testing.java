package com.testng_features;

import org.testng.annotations.Test;

public class Dependency_Testing{
	
	@Test(dependsOnMethods = "watch")
	private void offer() {
		System.out.println("offer");

	}
    @Test
    private void mobile() {
    	System.out.println("mobile");
    	
	}
    @Test
    private void watch() {
    	System.out.println("watch");

	}

}
