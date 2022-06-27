package chromeTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchFireFox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "D:\\Automation\\Automation_WorkSpace\\learnSelenium\\src\\main\\java\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		driver.quit();

	}
}
