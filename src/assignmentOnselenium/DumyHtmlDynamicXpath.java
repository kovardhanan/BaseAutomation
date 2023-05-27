package assignmentOnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DumyHtmlDynamicXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./toolselenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ELCOT/Desktop/dynamic.html");
		driver.findElement(By.xpath("//td[.='kantara']//")).click();
	    
		
		
		
		

	}

}
