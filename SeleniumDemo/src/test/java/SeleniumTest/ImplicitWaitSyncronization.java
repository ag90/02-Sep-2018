package SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWaitSyncronization {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://paytm.com/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  WebElement ReadMore=driver.findElement(By.xpath("//a[contains(text(),'read more')]"));
	  ReadMore.click();
	  
	  
	  driver.quit();
	  
	  
  }
}
