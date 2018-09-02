package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleWebTable {
	
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.freecrm.com");
	  
	  driver.findElement(By.name("username")).sendKeys("naveenk");
	  driver.findElement(By.name("password")).sendKeys("test@123");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
	  driver.switchTo().frame(1);
	  Actions act=new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).click().build().perform();
	  Thread.sleep(2000);
	  
	  
	  driver.findElement(By.xpath("//input[@value='52251980']")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//a[contains(text(),'anjali piya')]/parent::"
	  		+ "td//preceding-sibling::td//input[@value='52251976']")).click();
	  
	  Thread.sleep(2000);
	  

	  driver.findElement(By.xpath("//a[contains(text(),'Cena Sharma')]/parent::"
	  		+ "td//preceding-sibling::td//input[@name='contact_id']")).click();

	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//a[contains(text(),'anjali piya')]/parent::td//following-sibling::td//a[contains(text(),'SickKids')]")).click();

	 
	  
	  Thread.sleep(2000);
	  
	  driver.navigate().back();
	  
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("//a[contains(text(),'Cena Sharma')]/parent::"
		  		+ "td//following-sibling::td//a[contains(text(),'Ebay')]")).click();
	  

	  
  }
}
