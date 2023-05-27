package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BothBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
		ChromeDriver wed =new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","./toolselenium/geckodriver.exe");
		FirefoxDriver driver1=new FirefoxDriver();
	}

}
