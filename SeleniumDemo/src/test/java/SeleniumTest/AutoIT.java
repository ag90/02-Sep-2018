package SeleniumTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AutoIT {
	
	ChromeDriver driver;
	WebDriver dri;
	@Test
	public void autoIT() throws InterruptedException, IOException{
		
	
	  System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
		 
	  ChromeOptions chrome=new ChromeOptions();
	  chrome.addArguments("disable-infobars");
	  
	   driver=new ChromeDriver();
	
	  
	  /* driver= new ChromeDriver();
	  driver=new FirefoxDriver();
	  driver=new InternetExplorerDriver();
	  driver=new SafariDriver();*/
	   
	   
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("https://www.freecrm.com/");
	  
	  driver.findElement(By.name("username")).sendKeys("agupta3");
	  driver.findElement(By.name("password")).sendKeys("test1234");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
	  driver.switchTo().frame("mainpanel");
	  driver.findElement(By.xpath("//a[contains(text(),'Docs')]")).click();
	 
	  
	  driver.findElement(By.xpath("//input[contains(@value,'New Document')]")).click();
	  
	  driver.findElement(By.xpath("//input[contains(@type,'file')]")).click();
	  
	  Thread.sleep(5000);
	  Runtime.getRuntime().exec("C:\\Users\\guptaav\\Desktop\\AutoIT\\FileUpload.exe");
	  
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//input[contains(@type,'file')]")).sendKeys("C:\\Users\\guptaav\\Pictures\\Screenshots\\Screenshot (1).png");
	  
	  String load=driver.getCurrentUrl();
	  System.out.println(load);
	  
	  driver.navigate().to(driver.getCurrentUrl());

	  driver.findElement(By.xpath("//textarea[contains(@name,'description')]")).sendKeys(Keys.F5);

	  

	  Actions act=new Actions(driver);
	  act.sendKeys(Keys.F5).build().perform();
	  act.sendKeys(driver.findElement(By.xpath("//textarea[contains(@name,'description')]")), Keys.F5);

}
	
}