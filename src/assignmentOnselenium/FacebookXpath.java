package assignmentOnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();  
	    driver.get("https://www.facebook.com");//input[id='email'] //input[name='pass']  //button[type='submit']
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8940618099");
	    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("surya2000");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.xpath("//div[@aria-label='Messenger']")).click();
	    //    //input[@placeholder="Search Messenger"]
	    Thread.sleep(5000);
	   WebElement name= driver.findElement(By.xpath("//input[@placeholder='Search Messenger']"));
	 name.sendKeys("n");
	 /*  Thread.sleep(7000);
	  driver.findElement(By.xpath("(//span[.='Naresh Neo'])[1]")).click();
	/* Thread.sleep(7000);
	WebElement text= driver.findElement(By.xpath(""));
	  text.sendKeys(" hi this is automation");*/
	}

}
