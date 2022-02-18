package com.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Configure {
	
	// factory design pattern
	
	static Logger log = Logger.getLogger(Basic_Configure.class);
	
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		
	      log.debug("Debuging");
		
	      log.info("Information");
		
	      log.warn("warning");
	      
	      log.error("Error");
	      
	      log.fatal("Fatal inform");
	}

}
