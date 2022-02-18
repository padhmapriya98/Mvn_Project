package com.runner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import com.base.BaseClass;
import com.pom.PageObjectManager;
import com.propertyfile.File_Reader_Manager;

public class Runner extends BaseClass {
	
	
	  public static WebDriver driver = BaseClass.getBrowser("chrome");
	  public static PageObjectManager pom = new PageObjectManager(driver);
	  static Logger log1 = Logger.getLogger(Runner.class);
	
	  public static void main(String[] args) throws Throwable {
		  
		  PropertyConfigurator.configure("log4j.properties");
		  
		  String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().get_url_Data();
		  geturl(url);
		  log1.info("Browser Launch");
		  
	     String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().get_username_Data();
        inputvalue(pom.getInstanceLogin().getUname(), username);
        
        String pass = File_Reader_Manager.getInstanceFRM().getInstanceCR().get_password_Data();
        inputvalue(pom.getInstanceLogin().getPass(), pass);
        
        log1.info("fetch the username and password from excel");
        
	    elementclick(pom.getInstanceLogin().getLogin());
	    
	    String location = particular_value("C:\\Users\\ELCOT\\Desktop\\Automation Test cases.xlsx", 5, 5);
	    inputvalue(pom.getInstanceSearch().getLocation(),location);
	    
	    String hotel = particular_value("C:\\Users\\ELCOT\\Desktop\\Automation Test cases.xlsx", 6, 5);
        inputvalue(pom.getInstanceSearch().getHotels(), hotel);
	    
		log1.info("fetch the location and hotels from excel");
		
	    String room = particular_value("C:\\Users\\ELCOT\\Desktop\\Automation Test cases.xlsx", 7, 5);
		inputvalue(pom.getInstanceSearch().getRoom_type(), room);
		
	    String  room_no= particular_value("C:\\Users\\ELCOT\\Desktop\\Automation Test cases.xlsx", 8, 5);
        inputvalue(pom.getInstanceSearch().getRoom_nos(), room_no);
        
        log1.info("fetch the roomtype and roomno from excel");
        
        String check_in_date = particular_value("C:\\Users\\ELCOT\\Desktop\\Automation Test cases.xlsx", 9, 5);
		inputvalue(pom.getInstanceSearch().getDatepick_in(), check_in_date);
		
		String check_out_date = particular_value("C:\\Users\\ELCOT\\Desktop\\Automation Test cases.xlsx", 10, 5);
		inputvalue(pom.getInstanceSearch().getDatepick_out(), check_out_date);
		
		log1.info("fetch the check-in and check-out date in excel");
		
		String adult = particular_value("C:\\Users\\ELCOT\\Desktop\\Automation Test cases.xlsx", 11, 5);
        inputvalue(pom.getInstanceSearch().getAdult_room(), adult);	
        
        String child = particular_value("C:\\Users\\ELCOT\\Desktop\\Automation Test cases.xlsx", 12, 5);
		inputvalue(pom.getInstanceSearch().getChild_room(), child);
		
		log1.debug("fetch the adult and children room from excel");
		
		elementclick(pom.getInstanceSearch().getSubmit());
		
		elementclick(pom.getInstanceBooking().getRadiobutton());
		
		elementclick(pom.getInstanceBooking().getClick());
		
		String fname = File_Reader_Manager.getInstanceFRM().getInstanceCR().firstname_Data();
		inputvalue(pom.getInstantConfirm().getFname(), fname);
		
		String lname = File_Reader_Manager.getInstanceFRM().getInstanceCR().lastname_Data();
		inputvalue(pom.getInstantConfirm().getLname(), lname);

		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().address_Data();
		inputvalue(pom.getInstantConfirm().getAddress(), address);
		
		inputvalue(pom.getInstantConfirm().getCcnum(),"1234567890123456");
		
		String cctype = File_Reader_Manager.getInstanceFRM().getInstanceCR().cctype_Data();
		inputvalue(pom.getInstantConfirm().getCctype(),cctype );
		
		inputvalue(pom.getInstantConfirm().getExpmon(), "May");
		
		inputvalue(pom.getInstantConfirm().getExpyr(), "2022");
		
		inputvalue(pom.getInstantConfirm().getCcv(), "321");
		
		elementclick(pom.getInstantConfirm().getBook());
		
       
		
	}
}
