package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.leafground.com/link.xhtml;jsessionid=node01cii4rfwbsitxu0uaqw8h5tu16407.node0");
      WebElement link=driver.findElement(By.linkText("How many links in this page?"));
      Thread.sleep(3000);
  
       link.click();
      
   
         
	}

}
