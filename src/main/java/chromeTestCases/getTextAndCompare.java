package chromeTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import okhttp3.internal.http2.Header;

public class getTextAndCompare {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/checkbox-and-radio-button-webdriver.html");
		
		Thread.sleep(8000);
		
		WebElement mainHearder = driver.findElement(By.xpath("//h1[@class='entry-title']"));
		
		String actualHeader = mainHearder.getText();
		
		System.out.println("The actual header name is "+actualHeader);
		
		String expectedHeader = "How to Select CheckBox and Radio Button in Selenium WebDriver";
		
		//how to compate 2 string in java
		if(actualHeader.equals(expectedHeader))
		{
			System.out.println("Test case is passed and Header is matched");
		}
		else{
			
			System.out.println("Test case is failed and header is not matched");
		}
		
		
		
	}

}
