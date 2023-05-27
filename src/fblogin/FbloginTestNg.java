package fblogin;



import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class FbloginTestNg extends Generic1  {
	@Test
	public void test1() {
	driver.get("https://www.facebook.com");//input[id='email'] //input[name='pass']  //button[type='submit']
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8940618099");
    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("surya2000");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
