package com.testng_features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	
	@Ignore
	@Test
	private void whatapp() {
		System.out.println("whatapp");
	}
    @Test
    private void facebook() {
    	System.out.println("facebook");
	}
    @Test
    private void instagram() {
    	System.out.println("instagram");
	}
    @Test(enabled=false)
    private void telegram() {
    	System.out.println("telegram");
	}
    @Test
    private void snapchat() {
    	System.out.println("snapchat");
	}
    @Test
    private void sharechat() {
    	System.out.println("sharechat");
	}
    @Test
    private void mxplayer() {
    	System.out.println("mxplayer");
	}
    
	}
    
    
    
    
    
    
    

