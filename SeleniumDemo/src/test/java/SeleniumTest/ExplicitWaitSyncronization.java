package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitSyncronization {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://paytm.com/");
      
      WebElement ReadMore=driver.findElement(By.xpath("//a[contains(text(),' here')]"));
      String ReadMore1="//a[contains(text(),' here')]";
      
      WebDriverWait wait=new WebDriverWait(driver, 20);
     WebElement ele= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ReadMore1)));
     ele.click();
      
      driver.quit();
  
  }
}
