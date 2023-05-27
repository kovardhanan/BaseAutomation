package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookCreateAccountAdavnceXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	WebElement creataccount=driver.findElement(By.xpath("//a[.='Create New Account']"));
	creataccount.click();
	Thread.sleep(3000);
	WebElement fristname=driver.findElement(By.xpath("//input[@aria-label='First name']"));
	fristname.sendKeys("kovardhanan");
	WebElement  lastname=driver.findElement(By.xpath("//input[@aria-label='Surname' and @name='lastname']"));
	lastname.sendKeys("surya");
	WebElement  mobile=driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));	
	mobile.sendKeys("8940618099");
	WebElement  password=driver.findElement(By.xpath("//input[@data-type='password']"));
	password.sendKeys("@Surya2000");
	WebElement  date=driver.findElement(By.xpath("//select[@id='day']"));	
    Select select=new Select(date);
    select.selectByValue("17");
    WebElement  month=driver.findElement(By.xpath("//select[@id='month']"));
    Select select1=new Select(month);
    select1.selectByValue("8");
    WebElement  year=driver.findElement(By.xpath("//select[@id='year']"));
    Select select2=new Select(year);
    select2.selectByValue("2000");   //label[.='Male']
    WebElement  Gender=driver.findElement(By.xpath("//label[.='Male']"));
     Gender.click();
    WebElement  SignUp=driver.findElement(By.xpath("//button[@name='websubmit']"));
     SignUp.click();  
	}
}
