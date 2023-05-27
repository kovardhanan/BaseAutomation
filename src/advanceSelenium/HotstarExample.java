package advanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HotstarExample {

	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();  
	    driver.get("https://www.hotstar.com/");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath
	    		("//button[.='Subscribe']/../div/following-sibling::div[4]")).click();
	    driver.findElement(By.xpath("//input[@id='phoneNo']")).sendKeys("8940618099"+Keys.ENTER);
	    Thread.sleep(12000);
	    driver.findElement(By.xpath("//span[contains(.,'Continue')]")).click();
	    driver.findElement(By.xpath("//div[@class='close-btn']")).click();
	}
	

}
