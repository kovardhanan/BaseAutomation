package assignmentOnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysExampleFinal {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();  
	    driver.get("file:///C:/Users/ELCOT/Desktop/KeysExample.html");
	    WebElement ele1=driver.findElement(By.xpath("//a[.='Google']"));
	  //  ele1.sendKeys(Keys.ENTER);
	    WebElement ele2=driver.findElement(By.id("a1"));
	    ele2.sendKeys(Keys.CONTROL+"a"+"c");
	    WebElement ele3=driver.findElement(By.id("a2"));
	    ele3.clear();
	    ele3.sendKeys(Keys.CONTROL+"v");

	}

}
