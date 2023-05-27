package assignmentOnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFuntionExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("hayya hayya");
		
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		driver.findElement(By.xpath("//yt-formatted-string[text()='Hayya Hayya (Better Together) | FIFA World Cup 2022™ Official Soundtrack']")).click();
		
		

	}//yt-formatted-string[text()='Hayya Hayya (Better Together) | FIFA World Cup 2022™ Official Soundtrack']

}
