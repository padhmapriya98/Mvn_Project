package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confrim {
	
	public WebDriver driver;
	
	@FindBy(name="first_name")
	private WebElement fname;

	public WebElement getFname() {
		return fname;
	}
	public Booking_Confrim(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="last_name")
	private WebElement lname;
	
	@FindBy(name="address")
	private WebElement address;
	
	@FindBy(name="cc_num")
	private WebElement ccnum;
	
	@FindBy(name="cc_type")
	private WebElement cctype;
	
	@FindBy(name="cc_exp_month")
	private WebElement expmon;

	@FindBy(name="cc_exp_year")
	private WebElement expyr;
	
	@FindBy(name="cc_cvv")
	private WebElement ccv;
	
	@FindBy(name="book_now")
	private WebElement book;

	@FindBy(name="my_itinerary")
	private WebElement itinerary;
	
	public WebElement getItinerary() {
		return itinerary;
		
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcnum() {
		return ccnum;
	}
	public WebElement getCctype() {
		return cctype;
	}
	public WebElement getExpmon() {
		return expmon;
	}
	public WebElement getExpyr() {
		return expyr;
	}
	public WebElement getCcv() {
		return ccv;
	}
	public WebElement getBook() {
		return book;
	}
	
	
	
	
	
	
	
	
	

}
