package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaOpen {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.instagram.com");
   WebElement un= driver.findElement(By.className("_aa4b _add6 _ac4d"));
    un.sendKeys("8940618099"+Keys.TAB);
}
}
