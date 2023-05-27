package locatorExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
	WebElement el=	driver.findElement(By.xpath("//input[@id='search']"));
      String s=el.getAttribute("class");
    String s1=  el.getTagName();
            String n = el.getText();
           Point p = el.getLocation();
         String hi=el.getCssValue("fort-size");
             
            System.out.println(s+"\n"+s1+"\n"+n+"\n"+p);
            
	}

}
