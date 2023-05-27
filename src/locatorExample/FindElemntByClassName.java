package locatorExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElemntByClassName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	       driver.get("file:///C:/Users/ELCOT/Desktop/Find.html");
	       WebElement send=driver.findElement(By.className("c1"));

	}

}
