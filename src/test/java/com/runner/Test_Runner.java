package com.runner;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.base.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin",
         glue = "com.adactin.sd"
         
         
		)
public class Test_Runner {
	
	public static Logger log= Logger.getLogger(Test_Runner.class);
	
	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() {
		log.info("information");
		driver= BaseClass.getBrowser("chrome");
		
	}	
	@AfterClass
	public static void tear_Down() {
		
		driver.quit();

	}
	
}
	






