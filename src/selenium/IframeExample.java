package selenium;




import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class IframeExample {
	
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver","./toolselenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		
		driver.switchTo().frame("frame2");
	    JavascriptExecutor jsx=(JavascriptExecutor)driver;
	   jsx.executeScript("window.scrollBy(0,500)");
		}
	
	
	
	

}
