package assignmentOnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCartProduct {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/"); //input[@id='twotabsearchtextbox']
		Thread.sleep(4000);
      driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone 13"+Keys.ENTER);
      Thread.sleep(4000);
      driver.findElement(By.xpath("//img[@alt='Sponsored Ad - Apple iPhone 13 (256GB) - Blue']")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	}

}
