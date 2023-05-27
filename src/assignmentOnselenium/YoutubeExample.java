package assignmentOnselenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.cssSelector("input[id='search']")) .sendKeys("hayya hayya");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("yt-icon[class='style-scope ytd-searchbox']")).click();
	//Thread.sleep(4000);
      driver.findElement(By.linkText("Hayya Hayya (Better Together) | FIFA World Cup 2022™ Official Soundtrack")).click();
	}

}
