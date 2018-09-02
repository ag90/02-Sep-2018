package SeleniumTest;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleIframe {
	
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
	 
	  ChromeOptions chrome=new ChromeOptions();
	  chrome.addArguments("disable-infobars");
	  
	  
	  driver=new ChromeDriver(chrome);
	  driver.manage().window().maximize();
	  driver.get("https://www.freecrm.com/");
	  
	  driver.findElement(By.name("username")).sendKeys("naveenk");
	  driver.findElement(By.name("password")).sendKeys("test@123");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
	  List<WebElement> frame= driver.findElements(By.tagName("frame"));
	  System.out.println(frame.size());
	 
	  
	  
	  driver.switchTo().frame(1);
	  Actions act=new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
	  
	 
	  
	  Thread.sleep(2000);
	  
	  
	 
	  driver.findElement(By.xpath("//a[contains(text(),'«Shortlist')]")).click();
	  
	  Thread.sleep(2000);
	  
	  driver.switchTo().parentFrame();//we have to switch to initial or parent frameset.
	  
	  //driver.switchTo().frame("leftpanel");
	   driver.switchTo().frame(driver.findElement(By.name("leftpanel")));
	  
	  Thread.sleep(2000);
	  
	  Select select=new Select(driver.findElement(By.xpath("//select[@name='doaction']")));
	  select.selectByVisibleText("Save");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
	  
	  
	  
  }
}
