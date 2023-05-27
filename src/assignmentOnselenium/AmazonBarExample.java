package assignmentOnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBarExample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    JavascriptExecutor jse=(JavascriptExecutor) driver;
    driver.get("https://www.amazon.com/");
    Thread.sleep(2000);
    for (int i = 0; i <8; i++) {
        Thread.sleep(2000);
    	jse.executeScript("window.scrollBy(0,500)");	
	}
   /* for (int i = 0; i < 3; i++) {
        Thread.sleep(2000);
    	  jse.executeScript("window.scrollBy(0,-500)");
	}*/
    driver.findElement(By.xpath("//a[.='About Amazon']")).click();
  
    
}
}
