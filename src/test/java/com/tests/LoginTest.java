package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.testBase;

public class LoginTest extends testBase{

	public LoginPage loginPage;
	public DashboardPage dashboard;
	
	public static void LauchAppliucation() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Launching the DemoQA application
		driver.get("https://www.saucedemo.com/");
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void Login_With_Valid_Credentails() {
		LauchAppliucation();
		loginPage.EnterUserName("standard_user");
		loginPage.EnterPassword("secret_sauce");
		loginPage.ClickLoginButton();
		dashboard.VerifyProductLableIsDisplayed();
	}
	
	@Test
	public void Login_With_InValid_Credentails() {
		LauchAppliucation();
		loginPage.EnterUserName("standard_userdfd");
		loginPage.EnterPassword("secret_sauce");
		loginPage.ClickLoginButton();
		dashboard.VerifyProductLableIsDisplayed();
	}
	
	@AfterTest
	public void CloseBorwser() {
		
		driver.close();
	}
	
}
