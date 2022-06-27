package chromeTestCases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingWindows extends testBase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//click on new tab
		driver.findElement(By.xpath("tabButton")).click();
		Thread.sleep(5000);
		
		WebElement sampleText = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
		
		Set<String> noOfWindows = driver.getWindowHandles();
		
		Iterator<String> I1= noOfWindows.iterator();
		
		while(I1.hasNext())
		{
			
			//String childWindow = I1.noOfWindows.
			
		}
		
	}

}
