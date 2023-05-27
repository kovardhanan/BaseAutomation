package selenium;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.leafground.com/select.xhtml");
        
       WebElement drop1=driver.findElement(By.className("ui-selectonemenu"));
       Select value= new Select(drop1);
         
       value.selectByIndex(2);
       Thread.sleep(2000);
       
       value.selectByVisibleText("Selenium");
       Thread.sleep(2000);
       drop1.sendKeys("Puppeteer");
        
       WebElement MultiSelect=driver.findElement(By.id("j_idt87:auto-complete_input"));
       Select multi= new Select(MultiSelect);
       multi.selectByIndex(1);
       multi.selectByIndex(3);
       multi.selectByIndex(0);
       
       List<WebElement> listoption = value.getOptions();
       System.out.println(listoption.size()); 
       
      
	}

}
