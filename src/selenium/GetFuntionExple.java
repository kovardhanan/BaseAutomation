package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetFuntionExple {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String url=driver.getCurrentUrl();
		//String title=driver.getTitle();
		//String src=driver.getPageSource();
     System.out.println(url);
	}

}
