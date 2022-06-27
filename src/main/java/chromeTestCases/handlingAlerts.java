package chromeTestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingAlerts extends testBase {

	public static void main(String args[]) throws InterruptedException {

		hndlingAlertsAndPopuPs("Press a button!");
		handleAlert("//button[@id='alertButton']","You clicked a button");
		handleAlert("//button[@id='timerAlertButton']", "This alert appeared after 5 seconds");
	}

	public static void hndlingAlertsAndPopuPs(String expectedAlertText) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// click on forward arrow
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		/*
		 * WebElement confirmAlert =
		 * driver.findElement(By.xpath("//span[@id='button4']")); confirmAlert.click();
		 * // we have one Alert class--alert handling methods // not creating an object
		 * // Assigning an Alert class instance to driver.swithto.alert Alert al =
		 * driver.switchTo().alert();
		 * 
		 * Thread.sleep(8000);
		 * 
		 * // al.dismiss(); // al.getText(); String actualAlertText = al.getText();
		 * System.out.println("The text on the alert is " + actualAlertText);
		 * al.accept(); Thread.sleep(5000); // Expected alerrt text is Press a button!
		 * //Actual alert text if(expectedAlertText.equalsIgnoreCase(actualAlertText)) {
		 * System.out.println("Alert text is matched"); } else {
		 * System.out.println("Alert next not matched"); }
		 */

	}
	
	public static void handleAlert(String locator, String expectedAlertText) throws InterruptedException {
	
		WebElement confirmAlert = driver.findElement(By.xpath(locator));
		confirmAlert.click();
		Thread.sleep(15000);
		Alert al = driver.switchTo().alert();
		Thread.sleep(15000);
		String actualAlertText = al.getText();
		System.out.println("The text on the alert is " + actualAlertText);
		al.accept();
		Thread.sleep(5000);
		if(expectedAlertText.equalsIgnoreCase(actualAlertText))
		{
			System.out.println("Alert text is matched");
		}
		else {
			System.out.println("Alert next not matched");
		}
		
	}
}
