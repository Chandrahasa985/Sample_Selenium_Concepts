package chromeTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingIframes extends testBase {
	
	public static void main(String args[]) throws InterruptedException {
		
		iframeHandling();
		
	}
	
	public static void iframeHandling() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//click on forward arrow
		driver.get("http://webdriveruniversity.com/IFrame/index.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame");
		WebElement forwardArrow = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-chevron-right']"));
		forwardArrow.click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);
		
		
	}
	
	

}
