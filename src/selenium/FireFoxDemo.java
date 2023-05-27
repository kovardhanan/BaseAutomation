package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./toolselenium/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
	}

}
