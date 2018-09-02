package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGWithInvocationCount {
	
  WebDriver driver;
  ChromeOptions Options;
  
	  @Test(invocationCount=5)
	  public void FreeCrmLoginPage() throws InterruptedException {
		  
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenk");
		/*driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();*/
		
	  }
	  
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
		  Options=new ChromeOptions();
		  Options.addArguments("disable-infobars");
		  driver=new ChromeDriver(Options);
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.get("http://www.freecrm.com");
		  
		  
	  }
	  
	
}
