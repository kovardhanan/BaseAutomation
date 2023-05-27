package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDemoDummyHtml {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();  
	    driver.get("file:///C:/Users/ELCOT/Desktop/fblink.html");
	     WebElement un = driver.findElement(By.tagName("input"));
	     un.sendKeys("hello");
	     un.clear();
	     WebElement pass=driver.findElement(By.id("a"));
	     pass.sendKeys("uggofho");
	     pass.clear();
	    driver.findElement(By.tagName("a")).click();
	   // driver.findElement(By.id("face")).click();
     
	}
}
