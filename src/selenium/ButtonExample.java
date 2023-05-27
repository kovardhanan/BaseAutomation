package selenium;

//import java.awt.Point;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
    WebDriver driver=new ChromeDriver();  
    driver.get("https://www.leafground.com/button.xhtml");
      
    WebElement button=driver.findElement(By.id("j_idt88:j_idt90"));
    //to get location of the of the component
          Point point=button.getLocation();
          System.out.println(point.getX()+"   "+point.getY()); 
  // button.getCssValue(null)
   //To select or click on the button
    Thread.sleep(2000);
    button.click();
}
}
