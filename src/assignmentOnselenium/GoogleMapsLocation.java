package assignmentOnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMapsLocation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/maps/@12.9972372,77.5504667,15z");
		driver.findElement(By.xpath("//div[@id=\"omnibox\"]/div/div/div/div/button/div ")). click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@aria-label='Choose starting point, or click on the map...']")).sendKeys("Bangalore");
		Thread.sleep(5000);
		try {
		driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("vellore"+Keys.ENTER);
		}
	 catch (Exception e) {
			System.out.println("expbgkd");
		}
	}

}
