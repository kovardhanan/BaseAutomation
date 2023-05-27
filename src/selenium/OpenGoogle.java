package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./toolselenium/chromedriver.exe";
	System.setProperty(key,value);
	ChromeDriver wed =new ChromeDriver();
	
	}

}
