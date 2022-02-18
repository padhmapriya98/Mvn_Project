package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Page {
	
public WebDriver driver;
	
	@FindBy(name="radiobutton_0")
	private WebElement radiobutton;

	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public Booking_Page(WebDriver driver3) {
	     this.driver= driver3;
	     PageFactory.initElements(driver, this);
	}
    @FindBy(name="continue")
    private WebElement click;

	public WebElement getClick() {
		return click;
	}

}
