package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestNGWithParameters {
	 WebDriver driver;
	ChromeOptions Options;
	
	
	
  @Test
  @Parameters({"username","password"})
  public void f(String usernamee,String password) throws InterruptedException {
	  
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys(usernamee);
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
	  
  }
  @Test
  @Parameters({"browser","Url"})
  public void beforeTest(String browser,String Url) throws InterruptedException {
	  
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
		  Options=new ChromeOptions();
		  Options.addArguments("disable-infobars");
		  driver=new ChromeDriver(Options);
		  driver.manage().window().maximize();
		  
	  }
	  
	  else if (browser.equalsIgnoreCase("firefox")) {
		  
		  System.setProperty("webdriver.gecko.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		  Options=new ChromeOptions();
		  Options.addArguments("disable-infobars");
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		
	}
	  driver.get(Url);
  }
 
}
