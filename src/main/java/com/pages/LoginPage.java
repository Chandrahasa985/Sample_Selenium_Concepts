package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.testBase;

public class LoginPage extends testBase implements LoginPageLocator {

	public static void EnterUserName(String value) {
		
		WebElement username = driver.findElement(By.xpath(username_Input_xpath));
		username.sendKeys(value);
		
	}
	
	public static void EnterPassword(String value) {
		
		WebElement password = driver.findElement(By.xpath(password_Input_xpath));
		password.sendKeys(value);
		
	}
	
	public static void ClickLoginButton() {
		
		WebElement LoginButton = driver.findElement(By.xpath(Login_Button_xpath));
		LoginButton.click();
	}
	
	
}
