package com.facebook.FaceBook;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.configuration.Configuration_Helper;
import com.pom.Sdp;

public class Fb_Test extends BaseClass {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		String browser = Configuration_Helper.configReader().getBrowser();
		driver=launchBrowser(browser);
		Sdp sdp = new Sdp(driver);
		String url= Configuration_Helper.configReader().getUrl();
		launchUrl(url);
		
		String usrname = Configuration_Helper.configReader().getUsernm();
		WebElement mailOrNumber = sdp.getLoginPage().getUserName();
		passInput(mailOrNumber, usrname);
		 
		String pass1= Configuration_Helper.configReader().getPass1();
	     WebElement password = sdp.getLoginPage().getPassword();
	     passInput(password, pass1);
	     
	     clickOnElement(sdp.getLoginPage().getLognbtn());
	     
	     Thread.sleep(3000);
	     explicitWait(sdp.getLoginPage().getFbText(),"1");
	     
	     screenShot("fb1.png");
	     
	     navigateBack();
	     
	     clickOnElement(sdp.getSignUpPage().getSignUpBtn());
	     
	     String fstnm= Configuration_Helper.configReader().getFirstName();
	     passInput(sdp.getSignUpPage().getFirstName(), fstnm);
	     
	     String lstnm= Configuration_Helper.configReader().getLastNm();
	     passInput(sdp.getSignUpPage().getLastName(), lstnm);
	     
	     String mail= Configuration_Helper.configReader().getMail();
	     passInput(sdp.getSignUpPage().getMailId(), mail);
	     passInput(sdp.getSignUpPage().getReMailId(), mail);
	     
	     String pas2= Configuration_Helper.configReader().getPass2();
	     passInput(sdp.getSignUpPage().getPassword(), pas2);
	     
	     String day= Configuration_Helper.configReader().getDay();
	     selectByVisibleText(sdp.getSignUpPage().getDay(), day);
	     
	     String month= Configuration_Helper.configReader().getMonth();
	     selectByVisibleText(sdp.getSignUpPage().getMonth(), month);
	     
	     String year= Configuration_Helper.configReader().getYear();
	     selectByVisibleText(sdp.getSignUpPage().getYear(), year);
	     
	     clickOnElement(sdp.getSignUpPage().getGender());
	     
	     clickOnElement(sdp.getSignUpPage().getSubmit());
	     
	     screenShot("fb2.png");
	}

}
