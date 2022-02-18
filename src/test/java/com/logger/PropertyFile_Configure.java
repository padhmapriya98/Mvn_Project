package com.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyFile_Configure {
	
	// factory design pattern
	
	static Logger log = Logger.getLogger(PropertyFile_Configure.class);
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		
	    log.debug("Debug");
		
		log.info("Information");
		
		log.warn("Warning");
		
		log.error("Error");
		
		log.fatal("Fatal");
	}

}
