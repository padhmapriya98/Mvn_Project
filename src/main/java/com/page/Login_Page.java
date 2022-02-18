package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

public WebDriver driver;
	
	@FindBy(name="username")
	private WebElement uname;

	public WebElement getUname() {
		return uname;
	}
	public Login_Page(WebDriver driver) {
      
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
	
	}
		
		@FindBy(name="password")
	private WebElement pass;

	public WebElement getPass() {
		return pass;
	}
	@FindBy(name="login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	
}
