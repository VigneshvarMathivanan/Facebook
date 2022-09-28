package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Sdp {

	public static WebDriver driver;
	
	public Sdp(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public LoginPage getLoginPage() {
		LoginPage lp = new LoginPage(driver);
		return lp;
	}
	
	public SignUpPage getSignUpPage() {
		SignUpPage sup = new SignUpPage(driver);
		return sup;
	}
	
}
