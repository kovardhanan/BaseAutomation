package assignmentOnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("hayya hayya");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//ytd-badge-supported-renderer[@id='badges']/../../../../../..//div/div/div[1]/div[1]/di")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@aria-pressed='false']")).click();
		driver.findElement(By.xpath("//ytd-button-renderer[@id='button' and @class='style-scope ytd-modal-with-title-and-button-renderer']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kovardhan2000@gmail.com"+Keys.ENTER);
		
		
	}

}
