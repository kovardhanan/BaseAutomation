package locatorExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com");
	driver.findElement(By.xpath("//input[@aria-required='true']")).sendKeys("8940618099");
	driver.findElement(By.xpath("//input[@aria-label=\"Password\"]")).sendKeys("surya2000");
	driver.findElement(By.xpath("//button[@type=\"submit\"]")). click();
	}

}
