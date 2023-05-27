package assignmentOnselenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableTextField {
public static void main(String[] args) throws InterruptedException {
	
			System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        JavascriptExecutor jse=(JavascriptExecutor) driver;
	        driver.get("file:///C:/Users/ELCOT/Desktop/Disable.html");
	        Thread.sleep(2000);
	        jse.executeScript("document.getElementById('a1').value='abc'");
	        
	        
}
}
