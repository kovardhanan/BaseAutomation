package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NestedIframe {
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver","./toolselenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.switchTo().frame(0);
	}

}
