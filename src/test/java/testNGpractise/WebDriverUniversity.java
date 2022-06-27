package testNGpractise;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebDriverUniversity extends launchApplication {
 
	
	@BeforeClass
	public void navigateToURL() throws InterruptedException {
		
		driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);
	}
	
	
	@Test(description="This testcase handle dropdown", enabled = false)
	public void HandleDropdownMenus_Testcase_One() throws InterruptedException {
		
		//launchBrowserAndApplication();
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		
		Select select = new Select(dropDown);
		select.selectByIndex(2);
		Thread.sleep(10000);
				
	}
	@Test
	public void HandleDropdownMenus_Testcase_Two() throws InterruptedException {
		
		//launchBrowserAndApplication();
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
		
		Select select = new Select(dropDown);
		select.selectByIndex(3);
		Thread.sleep(10000);
				
	}
	
	@AfterClass
	public void closeDriver() {
		
		driver.quit();
	}
	
}
