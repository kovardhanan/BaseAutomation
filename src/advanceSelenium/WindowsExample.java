package advanceSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	      
	    driver.get("https://www.leafground.com/window.xhtml;jsessionid=node01bxlqpvsh8em1qtfbb5kwyeqa75728.node0");
	    Thread.sleep(4000);
  driver.findElement(By.xpath("//span[.='Open']")).click();
       String ko = driver.getWindowHandle();
      Set<String> ch = driver.getWindowHandles();
      System.out.println(ch.size());
      for(String x:ch) {
    	  driver.switchTo().window(x);
    	System.out.println(driver.getTitle());
    	
    	if(!x.equals(ko)) {
    		Thread.sleep(4000);
    		
    		  driver.findElement(By.xpath("//span[.='Daily Quiz']")).click();
    		  Thread.sleep(4000);
    		driver.close();
    	}
      }
      
	}

}
