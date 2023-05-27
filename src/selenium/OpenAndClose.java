package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.ClickAction;

public class OpenAndClose {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./toolselenium/chromedriver.exe" );
       WebDriver diver=new ChromeDriver();
       diver.get("https://www.facebook.com/");
       
   WebElement username  =   diver.findElement(By.id("email"));
   username.sendKeys("8940618099"+Keys.TAB);
   
   WebElement password=  diver.findElement(By.id("pass"));
   password.sendKeys("surya2000"+Keys.ENTER);  
   
      //((WebElement) diver.findElements(By.xpath("//*[@id=\'mount_0_0_mC\']/div[1]/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]/div/svg/g/image"))).click();
      Thread.sleep(10000);
      diver.close();
	}

}
