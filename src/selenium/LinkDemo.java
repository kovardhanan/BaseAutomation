package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();  
	    driver.get("file:///C:/Users/ELCOT/Desktop/google.html");
	    driver.findElement(By.linkText("Google 2022")).click();
	    //driver.findElement(By.partialLinkText("Google ")).click();
	}

}
