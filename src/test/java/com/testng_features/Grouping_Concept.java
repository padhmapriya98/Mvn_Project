package com.testng_features;

import org.testng.annotations.Test;

public class Grouping_Concept {


	@Test(groups = "Social Media")
	private void whatapp() {
		System.out.println("whatapp");
	}
    @Test(groups = "Social Media")
    private void facebook() {
    	System.out.println("facebook");
	}
    @Test(groups = "Social Media")
    private void instagram() {
    	System.out.println("instagram");
	}
    @Test
    private void telegram() {
    	System.out.println("telegram");
	}
    @Test(groups = "camera")
    private void snapchat() {
    	System.out.println("snapchat");
	}
    @Test(groups = "camera")
    private void sharechat() {
    	System.out.println("sharechat");
	}
    @Test
    private void mxplayer() {
    	System.out.println("mxplayer");
	}
    
}
