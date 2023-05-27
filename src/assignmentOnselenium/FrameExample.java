package assignmentOnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();  
	    driver.get("file:///C:/Users/ELCOT/Desktop/mainframe.html");
        driver.findElement(By.id("m1")).sendKeys("hello");
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        driver.findElement(By.id("s1")).sendKeys("bye");
        driver.quit();
	}

}
