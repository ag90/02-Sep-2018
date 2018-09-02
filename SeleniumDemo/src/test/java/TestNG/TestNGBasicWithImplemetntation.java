package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGBasicWithImplemetntation {
	
	 WebDriver driver;
	 ChromeOptions options;
	
  @Test()
  public void FreeCrmPage() {
	  
	  String Title=driver.getTitle();
	  System.out.println(Title);
  }
  
  @Test()
  public void FreeCrmLoginPage() throws InterruptedException {
	  
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenk");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
	
  }
  
  @Test()
  public void FreeCrmHomePage() throws InterruptedException {
	  driver.switchTo().frame("mainpanel");
	  Thread.sleep(2000);
	boolean Upgradeyouraccount= driver.findElement(By.xpath("//input[@type='image']")).isDisplayed();
	System.out.println(Upgradeyouraccount);
	
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
	  options=new ChromeOptions();
	  options.addArguments("disable-infobars");
	  driver=new ChromeDriver(options);
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.get("http://www.freecrm.com");
  }

  @AfterMethod
  public void afterMethod() {
	 driver.quit();
  }

  @AfterClass
  public void afterClass() {
	  
  }

  @BeforeClass
  public void beforeClass() {
	 
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	
  }

  @AfterTest
  public void afterTest() {
	
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("Test Execution is started");
	  
	  
	  
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("Test Execution is Completed");
	  
  }

}
