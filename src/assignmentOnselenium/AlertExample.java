package assignmentOnselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./toolselenium/chromedriver.exe");
          
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_cutomer.php");
		
		driver.findElement(By.name("submit")).click();
		Alert a=driver.switchTo().alert();
		String s=a.getText();
		System.out.println(s);
		a.accept();
		//a.dismiss();		
		
		
		
		
		
	}

}
