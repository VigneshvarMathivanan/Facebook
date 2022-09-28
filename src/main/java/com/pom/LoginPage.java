package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='pass']")
	private WebElement password;
	
	@FindBy(id = "loginbutton")
	private WebElement lognbtn;
	
	@FindBy(xpath = "//img[@alt='Facebook']")
	private WebElement fbText;
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserName() {
		return username;
	}
	
	public WebElement getPassword() {
		return password;
	}

	public WebElement getLognbtn() {
		return lognbtn;
	}
	
	public WebElement getFbText() {
		return fbText;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
