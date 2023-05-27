package advanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {
	
	@Test
	public void tset() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();  
	    driver.get("https://www.facebook.com");
	    Pom p=new Pom(driver);
	    Thread.sleep(3000);
	    p.user();
	    p.pass();
	    p.login();
	    Thread.sleep(3000);
	    driver.navigate().refresh();
	    p.user();
	    p.pass();
	    p.login();
	    
	    
	}
	
	
	
	
	

}
