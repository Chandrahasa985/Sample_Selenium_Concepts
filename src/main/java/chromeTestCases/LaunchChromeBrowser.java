package chromeTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Automation_WorkSpace\\learnSelenium\\src\\main\\java\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximise the browser
		
		//Gmail Launch
		driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&continue=https%3A%2F%2Fmail.google.com&service=mail&ec=GAlAFw&flowName=GlifWebSignIn&flowEntry=AddSession");
		
		
		Thread.sleep(5000);
		
		//Enter Email ID
		//driver.findElement(By.id("identifierId"));
		WebElement username = driver.findElement(By.xpath("//input[@id='identifierId']"));
		username.sendKeys("testautomation204@gmail.com");
		
		WebElement Next = driver.findElement(By.xpath("//span[text()='Next']"));
		Next.click();
		
		Thread.sleep(10000);
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Welcome@123");

		Thread.sleep(5000);
		
		WebElement Next1 = driver.findElement(By.xpath("//span[text()='Next']"));
		Next1.click();
		Thread.sleep(15000);
		
		driver.quit();
		
		//We can not create object for an interface
		//Here WebDriver is an Interface
		//ChromeDriver is a class

		
		
		
		
		
		
		
		
	}

}
