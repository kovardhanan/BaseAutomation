package testngexample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public abstract class FbLoginGendric extends Generic{
  @Test
  public void test1() {
	 
	  driver.get("https://www.facebook.com");//input[id='email'] //input[name='pass']  //button[type='submit']
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8940618099");
	    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("surya2000");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
}
