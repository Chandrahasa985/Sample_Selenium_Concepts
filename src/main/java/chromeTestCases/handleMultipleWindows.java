package chromeTestCases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleMultipleWindows extends testBase{
	
	public static WebDriverWait wait;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		//Implicit wait - Static
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//click on new tab
		//explicit wait
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='tabButton']")));

		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		
		
		
		String parentWindow = driver.getWindowHandle();
		
		System.out.println("Parent Window is "+parentWindow);
		
		Set<String> childWindow = driver.getWindowHandles();
	
		Thread.sleep(8000);
		//Iterator
		Iterator<String> iterator = childWindow.iterator();
		
		//while(iterator.hasNext()) {
		
			String childWindowOne = iterator.next();
			
			System.out.println("Child window is "+childWindowOne);
			
			if(!parentWindow.equals(childWindowOne)) {
				
	
				driver.switchTo().window(childWindowOne);
				WebElement head = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
				if(head.isDisplayed())
				{
					System.out.println("Moved to next window");
					
					driver.close();
				}
				else
				{
					System.out.println("Not moved to next window");
					//driver.close();
				}
				
				
			}
	//	}
		
		driver.switchTo().window(parentWindow);
		driver.close();
		
}}
