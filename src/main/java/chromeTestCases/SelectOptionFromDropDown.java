package chromeTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectOptionFromDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement dropDownOne = driver.findElement(By.id("dropdowm-menu-1"));
		
		Select s = new Select(dropDownOne);
		s.selectByValue("python");
		//SelectByVisibletext
		
	}

}
