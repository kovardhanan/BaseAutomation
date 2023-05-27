package advanceSelenium;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotExample {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	   // driver.get("https://www.amazon.com/");
	    driver.get("https://www.youtube.com/");
       TakesScreenshot tcs=(TakesScreenshot)driver;
       File src=tcs.getScreenshotAs(OutputType.FILE);
       File d=new File("./ScreenShot/a1.png");
       FileHandler.copy(src, d);
	}

}
