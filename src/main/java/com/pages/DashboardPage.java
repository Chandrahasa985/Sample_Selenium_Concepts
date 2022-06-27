package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.testBase;

public class DashboardPage extends testBase implements DashboardPageLocators, LoginPageLocator{

	public static void VerifyProductLableIsDisplayed() {
		
		WebElement ProductLabel = driver.findElement(By.xpath(Product_header_xpath));
	
		if(ProductLabel.isDisplayed())
		{
			System.out.println("Test case is passed");
		}
		else {
			
			System.out.println("Test case is failed");
			}
			
	}
	
	
}
