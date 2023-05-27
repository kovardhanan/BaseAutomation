package advanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyFoodOrder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[.='Login']")).click();
		driver.findElement(By.xpath("//input[@id=\"mobile\"]")).sendKeys("8940618099");
		driver.findElement(By.xpath("//div/a[.='Login']/input/..")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@placeholder=\"Enter your delivery location\"]"))
		.sendKeys("Rajajinagar,Bangaluru,Karnataka,india");
		
		driver.findElement(By.xpath("//span[.='Rajajinagar, Bengaluru, Karnataka, India']")).click();
		
		driver.findElement(By.xpath("//span[.='Search']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder=\"Search for restaurants and food\"]"))
		.sendKeys("Al-Bek"+Keys.ENTER);
		driver.findElement(By.xpath("//div[.='Al-Bek']/div[1]")).click();
	}

}
