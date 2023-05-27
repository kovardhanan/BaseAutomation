package assignmentOnselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQaExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
	WebElement fn=driver.findElement(By.id("firstName"));
	fn.sendKeys("kovardhanan");
;
	WebElement ln=driver.findElement(By.id("lastName"));
	ln.sendKeys("S");
	WebElement  email=driver.findElement(By.id("userEmail"));
	
	email.sendKeys("kovardhan@gmai.com");
	WebElement  sex=driver.findElement(By.xpath("//label[.='Male']"));	
	sex.click();
	driver.findElement(By.xpath("//input[@placeholder=\"Mobile Number\"]")).sendKeys("8940618099");
	
	JavascriptExecutor jsc=(JavascriptExecutor)driver;
	jsc.executeScript("window.scrollBy(0,500)");
	WebElement  password=driver.findElement(By.xpath("//input[@id=\"dateOfBirthInput\"]"));
	password.click();
	
	WebElement month=driver.findElement(By.xpath("//div/div[1]/select[1]"));
   Select select=new Select(month);
    select.selectByVisibleText("August");
    WebElement  year=driver.findElement(By.xpath("//div/select/../following-sibling::div[1]/select[1]"));
    Select select1=new Select(year);
    select1.selectByVisibleText("2000");
    WebElement  date=driver.findElement(By.xpath("//div[.='17']"));	
	date.click();
   // driver.findElement(By.xpath("//div[@id=\"subjectsWrapper\"]/div/following-sibling::div[1]/div[1]/div")).sendKeys("gudiyattam");
  driver.findElement(By.xpath("//label[@for=\"hobbies-checkbox-1\"]")).click();
  driver.findElement(By.xpath("//textarea[@id=\"currentAddress\"]")).sendKeys("TamilNadu");
  WebElement state= driver.findElement(By.xpath("//div[@id=\"stateCity-wrapper\"]/div[2]"));
  state.sendKeys("Uttar Pradesh");
 
 
    
	}

}
