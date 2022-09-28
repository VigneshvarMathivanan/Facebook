package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.configuration.Configuration_Helper;
import com.facebook.FaceBook.BaseClass;
import com.pom.Sdp;
import com.runner.Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	public static WebDriver driver = Runner.driver;
	Sdp sdp = new Sdp(driver);
	

	@Given("user Launch The Url")
	public void user_launch_the_url() throws IOException {
		String url= Configuration_Helper.configReader().getUrl();
		launchUrl(url);
		}
	
	@When("user Enter The MailOrPhoneNo")
	public void user_enter_the_mail_or_phone_no() throws IOException {
		String usrname = Configuration_Helper.configReader().getUsernm();
		WebElement mailOrNumber = sdp.getLoginPage().getUserName();
		passInput(mailOrNumber, usrname);
	}
	
	@When("user Enter The Password")
	public void user_enter_the_password() throws IOException {
		 String pass1= Configuration_Helper.configReader().getPass1();
	     WebElement password = sdp.getLoginPage().getPassword();
	     passInput(password, pass1);
	}
	
	@When("user Click The LogIn Button")
	public void user_click_the_log_in_button() {
	     clickOnElement(sdp.getLoginPage().getLognbtn());
	}
	
	@When("user get The Screenshot")
	public void user_get_the_screenshot() throws InterruptedException, IOException {
		 Thread.sleep(3000);
	     explicitWait(sdp.getLoginPage().getFbText(),"1");
	     screenShot("fb1.png");
	}
	
	@When("user NavigateBack")
	public void user_navigate_back() {
	     navigateBack();
	}
	
	@Then("user Click On SignUp Button")
	public void user_click_on_sign_up_button() {
	     clickOnElement(sdp.getSignUpPage().getSignUpBtn());
	}

	@When("user Enter The FirstName and LastName")
	public void user_enter_the_first_name_and_last_name() throws IOException {
		String fstnm= Configuration_Helper.configReader().getFirstName();
	     passInput(sdp.getSignUpPage().getFirstName(), fstnm);
	     
	     String lstnm= Configuration_Helper.configReader().getLastNm();
	     passInput(sdp.getSignUpPage().getLastName(), lstnm);
	}
	
	@When("user Enter The Mail and Password")
	public void user_enter_the_mail_and_password() throws IOException {
		 String mail= Configuration_Helper.configReader().getMail();
	     passInput(sdp.getSignUpPage().getMailId(), mail);
	     passInput(sdp.getSignUpPage().getReMailId(), mail);
	     
	     String pas2= Configuration_Helper.configReader().getPass2();
	     passInput(sdp.getSignUpPage().getPassword(), pas2);
	}
	
	@When("user Select The Date Of Birth")
	public void user_select_the_date_of_birth() throws IOException {
		 String day= Configuration_Helper.configReader().getDay();
	     selectByVisibleText(sdp.getSignUpPage().getDay(), day);
	     
	     String month= Configuration_Helper.configReader().getMonth();
	     selectByVisibleText(sdp.getSignUpPage().getMonth(), month);
	     
	     String year= Configuration_Helper.configReader().getYear();
	     selectByVisibleText(sdp.getSignUpPage().getYear(), year);
	}
	
	@When("user Click The Gender and SubmitButton")
	public void user_click_the_gender_and_submit_button() {
		 clickOnElement(sdp.getSignUpPage().getGender());
	     clickOnElement(sdp.getSignUpPage().getSubmit());
	}
	
	@Then("user Take The ScreenShot")
	public void user_take_the_screen_shot() throws IOException {
	     screenShot("fb2.png");
	}






}
