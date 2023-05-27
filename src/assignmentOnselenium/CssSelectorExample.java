package assignmentOnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();  
	    driver.get("https://www.facebook.com");//input[id='email'] //input[name='pass']  //button[type='submit']
	    driver.findElement(By.cssSelector("input[id='email']")).sendKeys("kok");
	    
	}

}
