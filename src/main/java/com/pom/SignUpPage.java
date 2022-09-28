package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

		public static WebDriver driver;
	
		@FindBy(xpath = "//a[text()='Sign up for Facebook']")
		private WebElement signUpBtn;
		
		@FindBy(name="firstname")
		private WebElement firstName;
		
		@FindBy(name="lastname")
		private WebElement lastName;
		
		@FindBy(name="reg_email__")
		private WebElement mailId;
		
		@FindBy(name="reg_email_confirmation__")
		private WebElement remailId;
		
		@FindBy(id="password_step_input")
		private WebElement password;
		
		@FindBy(id="day")
		private WebElement day ;
		
		@FindBy(id="month")
		private WebElement month ;
		
		@FindBy(id="year")
		private WebElement year ;
		
		@FindBy(xpath="//label[text()='Male']")
		private WebElement gender;
		
		@FindBy(name="websubmit")
		private WebElement submit;
		
		
		
		
		public SignUpPage(WebDriver driver) {
			this.driver= driver;
			PageFactory.initElements(driver, this);
		}

		public WebElement getSignUpBtn() {
			return signUpBtn;
		}

		public WebElement getFirstName() {
			return firstName;
		}

		public WebElement getLastName() {
			return lastName;
		}

		public WebElement getMailId() {
			return mailId;
		}
		
		public WebElement getReMailId() {
			return remailId;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getDay() {
			return day;
		}

		public WebElement getMonth() {
			return month;
		}

		public WebElement getYear() {
			return year;
		}

		public WebElement getGender() {
			return gender;
		}

		public WebElement getSubmit() {
			return submit;
		}
	
	
	
	
	
	
	
}
