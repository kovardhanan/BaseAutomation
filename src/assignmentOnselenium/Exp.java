package assignmentOnselenium;

import java.util.concurrent.TimeUnit;

import javax.swing.tree.ExpandVetoException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exp {
     public static void main(String[] args) {
    	 System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
 	    WebDriver driver=new ChromeDriver();
 	   // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 	    driver.get("https://www.instagram.com/");
 	   String S = driver.getTitle();
 	     WebDriverWait wait=new WebDriverWait(driver, 10);
 	     
 	     wait.until(ExpectedConditions.titleContains(S));
 	     driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("8940618099");
 	     driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("surya2000");
         driver.findElement(By.xpath("//div[.='Log in']/../div[3]")).click();
	}
	
	
	
	
	
	
	
}
