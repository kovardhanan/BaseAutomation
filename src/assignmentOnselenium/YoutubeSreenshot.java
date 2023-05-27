package assignmentOnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeSreenshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	   // driver.get("https://www.amazon.com/");
	    driver.get("https://www.youtube.com/");
	    driver.findElement(By.xpath("//input[@id='search']")).sendKeys("hayya hayya"+Keys.ENTER);
	    
	}

}
