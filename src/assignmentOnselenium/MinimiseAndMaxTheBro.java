package assignmentOnselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MinimiseAndMaxTheBro {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    Robot b=new Robot();
	    Thread.sleep(2000);
	    b.keyPress(KeyEvent.VK_ALT);
	    b.keyPress(KeyEvent.VK_SPACE);
	    b.keyRelease(KeyEvent.VK_ALT);
	    b.keyRelease(KeyEvent.VK_SPACE);
	    Thread.sleep(2000);
	    b.keyPress(KeyEvent.VK_N);
	    b.keyRelease(KeyEvent.VK_N);
	    driver.manage().window().maximize();
	    
	    
	}

}
