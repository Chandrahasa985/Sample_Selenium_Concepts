package testNGpractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchApplication {

	public static WebDriver driver;
	@BeforeSuite
	public static void launchBrowserAndApplication() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
				
	}
	
	
}
