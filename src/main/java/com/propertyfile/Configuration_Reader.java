package com.propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws Throwable {
	 	File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Mvn_Project\\src\\main\\java\\com\\propertyfile\\confirgation.properties");
		FileInputStream fis = new FileInputStream(f);
		p =new Properties();
		p.load(fis);
	}
	public String get_url_Data() {
        String url = p.getProperty("url");
        return url;
	}
	public String get_username_Data() {
        String username = p.getProperty("username");
		return username;
	}
	public String get_password_Data() {
         String password = p.getProperty("password");
         return password;
	}
	public String firstname_Data() {
         String fname = p.getProperty("firstname");
         return fname;
	}
	public String lastname_Data() {
		String lname = p.getProperty("lastname");
        return lname;
	}
	public String address_Data() {
        String address = p.getProperty("address");
        return address;
	}
	public String ccnumber_Data() {
		String ccnum = p.getProperty("ccnum");
        return ccnum;
	}
	public String cctype_Data() {
		String cctype = p.getProperty("cctype");
        return cctype;
	}
	public String expiry_Month() {
        String expmon = p.getProperty("expmon");
        return expmon;
	}
	public String expiry_Year() {
		String expyr = p.getProperty("expyr");
        return expyr;
	}
	public String ccv_Number() {
		String ccv = p.getProperty("ccv");
        return ccv;
	}
	
	
	
	
	
	
	

}
