package testngexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic {
	WebDriver driver;
	@BeforeMethod
	public void open() {
		System.setProperty("webdriver.chrome.driver","./toolselenium/chromedriver.exe" );
		driver=new ChromeDriver();
	}
	@AfterMethod
	public void close() {
		driver.close();
	}

}
