package com.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.configuration.Configuration_Helper;
import com.facebook.FaceBook.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//feature//Fb.feature",glue="com.stepdefinition",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","json:ValarMorghulis/Fb.json"})

public class Runner {
	public static WebDriver driver;
	@BeforeClass
	public static void setUp() throws IOException {
		String browser = Configuration_Helper.configReader().getBrowser();
		driver=BaseClass.launchBrowser(browser);
	}

	@AfterClass
	public static void tearDown() {
		BaseClass.closeBrowser();
	}
}
