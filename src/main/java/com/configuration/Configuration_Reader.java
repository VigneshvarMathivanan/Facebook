package com.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hpsf.Property;

public class Configuration_Reader {

	public static Properties p;
	
	public Configuration_Reader() throws IOException {
		
		File f = new File("C:\\Users\\91769\\eclipse-workspace\\FaceBook\\src\\main\\java\\com\\configuration\\Fb.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public  String getBrowser() {
		String browser=p.getProperty("browser");
		return browser;
	}
	
	public  String getUrl() {
		String url=p.getProperty("url");
		return url;
	}
	
	public  String getUsernm() {
		String usrnm=p.getProperty("username");
		return usrnm;
	}
	
	public  String getPass1() {
		String pas1=p.getProperty("password1");
		return pas1;
	}
	
	public  String getFirstName() {
		String fstnm=p.getProperty("firstname");
		return fstnm;
	}
	
	public  String getLastNm() {
		String lstnm=p.getProperty("lastname");
		return lstnm;
	}
	
	public  String getMail() {
		String mail=p.getProperty("mail");
		return mail;
	}
	
	public  String getPass2() {
		String pas2=p.getProperty("password2");
		return pas2;
	}
	
	public  String getDay() {
		String day=p.getProperty("day");
		return day;
	}
	
	public  String getMonth() {
		String month=p.getProperty("month");
		return month;
	}
	
	public  String getYear() {
		String year=p.getProperty("year");
		return year;
	}
	
	
}
