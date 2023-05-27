package advanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
           @FindBy(xpath = "//input[@id='email']")
           private WebElement ele1;
           @FindBy(xpath = "//input[@name='pass']")
           private WebElement ele2;
           @FindBy(xpath = "//button[@type='submit']")
           private WebElement ele3;
           Pom(WebDriver driver){
        	       PageFactory.initElements(driver,this);
        	   
        	  }
           public void user() {
        	   ele1.sendKeys("8890");
           }
           public void pass() {
        	   ele2.sendKeys("surya2000");
           }
           public void login() {
        	   ele3.click();
           }
	
}
