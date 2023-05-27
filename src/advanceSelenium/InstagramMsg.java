package advanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramMsg {
   public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://www.instagram.com/");
	   
	   driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("8940618099");
	   driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("surya2000");
       driver.findElement(By.xpath("//div[.='Log in']/../div[3]")).click();
       
       
       driver.findElement(By.xpath("//div[.='Messages']/../a")).click();
      
       driver.findElement(By.xpath("//button[.='Not Now']")).click();
       
       driver.findElement(By.xpath("//div[.='🥰நரேஷ்🥰']/../div[2]")).click();
      
       driver.findElement(By.xpath("//textarea[@placeholder=\"Message...\"]")).sendKeys("nare");
       
       driver.findElement(By.xpath("//button[.='Send']")).click();
      
       driver.findElement(By.xpath("//img[@alt=\"i__am__koo__'s profile picture\"]")).click();
    

       driver.findElement(By.xpath("//a//div[contains(.,'followers')]/span[1]")).click();
      
     
       
	   driver.findElement(By.xpath("//a//div[1][.='akshata_chougale']/..")).click();
	   
	   driver.findElement(By.xpath("//section//article//div[2]/div[1]/a")).click();
	  
	  driver.findElement(By.xpath("//section/span[1]//button[@type=\"button\"]")).click();
	}
}
