package com.testng_features;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority =1)
	private void college() {
		System.out.println("college");
	}
    @Test(priority = -1)
    private void sslc() {
    	System.out.println("sslc");
	}
    
    @Test(priority = 2)
    private void job() {
    	System.out.println("job");
	}
    
    @Test(priority = 0)
    private void hsc() {
    	System.out.println("hsc");
	}
    
}
