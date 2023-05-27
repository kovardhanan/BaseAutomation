package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./toolselenium/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.leafground.com/radio.xhtml;jsessionid=node01dl0xrxityf3p1g7g3pzqf7qxf20302.node0");
        /*
         *here we select one  
         * */
        
       WebElement radioselect= driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[1]/div/div[2]/span"));
        radioselect.click();
        /*
         * here we check the default selected radio buttton
         * after check the if condition
         * */
        Thread.sleep(2000);
       WebElement radioselect2= driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[1]/div/div[2]/span"));
      
       radioselect2.click();
      boolean f= radioselect2.isSelected();
     
      Thread.sleep(2000);
       WebElement radioselect3= driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[2]/div/div[2]/span"));
       radioselect3.click();
       boolean g= radioselect3.isSelected();
       Thread.sleep(2000);
       WebElement radioselect4= driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[3]/div/div[2]"));
       radioselect4.click();
       boolean h= radioselect4.isSelected();
       Thread.sleep(2000);
       WebElement radioselect5= driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[4]/div/div[2]"));
       radioselect5.click();
       boolean t= radioselect5.isSelected();
       Thread.sleep(2000);
        System.out.println(f+" \n"+g+"\n"+h+"\n"+t);
       WebElement radioselect6= driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[1]/label"));
       radioselect6.click();
       boolean k=  radioselect6.isSelected();
       Thread.sleep(2000);
      WebElement radioselect7= driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[2]/div/div[2]/span"));
      radioselect7.click();
      boolean u=  radioselect7.isSelected();
      System.out.println(k+"\n"+u);
	}

}
