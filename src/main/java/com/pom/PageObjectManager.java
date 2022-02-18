package com.pom;

import org.openqa.selenium.WebDriver;

import com.page.Booking_Confrim;
import com.page.Booking_Page;
import com.page.Login_Page;
import com.page.Search_Page;

public class PageObjectManager {

	public WebDriver driver;
	private Login_Page login;
	private Search_Page search;
    private	Booking_Page booking;
    private Booking_Confrim confirm;
	
	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
	}
	public Login_Page getInstanceLogin() {
		if (login==null) {
			login = new Login_Page(driver);
		}
		return login;
}
	public Search_Page getInstanceSearch() {
		if (search==null) {
			search = new Search_Page(driver);
		}
		return search;
	}
	public Booking_Page getInstanceBooking() {
		if (booking==null) {
			booking = new Booking_Page(driver);
		}
		return booking;
	}
	public Booking_Confrim getInstantConfirm() {
		if (confirm==null) {
			confirm= new Booking_Confrim(driver);
		} 
        return confirm;
	}
	
	
	
	
}