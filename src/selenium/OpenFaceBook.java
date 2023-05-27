package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();  
	    driver.get("https://www.facebook.com");
	    driver.findElement(By.id("email")).sendKeys("8940618099");
	   // driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("pass")).sendKeys("surya2000"+Keys.ENTER);
	    
	}

}
