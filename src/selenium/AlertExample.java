package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
       driver.get("https://www.leafground.com/alert.xhtml");
       WebElement send=driver.findElement(By.id("j_idt88:j_idt91"));
     //  WebElement pwd=driver.findElement(By.id("pass"));
      send.click();
      Thread.sleep(2000);
      Alert alert=driver.switchTo().alert();
      alert.accept();
      
      WebElement send2=driver.findElement(By.id("j_idt88:j_idt93"));
      send2.click();
      Alert cancel=driver.switchTo().alert();
      cancel.dismiss();    
      
      }
}
