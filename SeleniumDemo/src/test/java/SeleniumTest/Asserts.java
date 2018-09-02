package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asserts {
	
	WebDriver driver;
	
  @Test
  public void a() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	 // System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.freecrm.com/register/");
	  
	Dimension dm=new Dimension(500, 1000);
	driver.manage().window().setSize(dm);
	  
	 
	  
	  
	  driver.findElement(By.name("agreeTerms")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.name("submitButton")).click();
	  

	  String ActualErrorMsg1=driver.findElement(By.xpath("//small[contains(text(),'Please enter your first name')]")).getText();
	  
	  
	  String ExpectedErrorMsg1="Please enter your first name1";
	  
	  SoftAssert softassert=new SoftAssert();
	  softassert.assertEquals(ActualErrorMsg1, ExpectedErrorMsg1, "*** Invalid Error Msg Displayed ***");
	  
	 softassert.assertAll();
	  System.out.println("------------------------------------");
  }
		
	  @Test
	  public void f() throws InterruptedException {
	  driver.navigate().to("https://www.freecrm.com/register/");
	  
	  driver.findElement(By.name("agreeTerms")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.name("submitButton")).click();
	  
	  String ActualErrorMsg=driver.findElement(By.xpath("//small[contains(text(),'Please enter your first name')]")).getText();
	  
	  
	  String ExpectedErrorMsg="Please enter your first name1";
	  
	  Assert.assertEquals(ActualErrorMsg, ExpectedErrorMsg,"Wrong Error Msg.");
	  Thread.sleep(1000);
	  
	  
	 driver.quit();
	  
	
	  
	  
	 
	  
	  
	  
  }
}
