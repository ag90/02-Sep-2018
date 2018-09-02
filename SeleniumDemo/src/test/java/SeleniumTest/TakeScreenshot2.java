package SeleniumTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class TakeScreenshot2 {
	
	WebDriver driver;
	
  @Test
  public void f() throws IOException, InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.freecrm.com");
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
	 
	   
	  File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(file, new File("C://Users//guptaav//Mars_workspace//SeleniumDemo//src//test//java//SeleniumTest//"+"CRM1"+".png"));
	   
	  FileUtils.copyFile(file, new File("C:\\Users\\guptaav\\Mars_workspace\\SeleniumDemo\\src\\test\\java\\SeleniumTest\\"+"CRM2"+".png"));

	  FileUtils.copyFile(file, new File(".//Screeshot//"+"CRM3"+".png"));
	  
	  FileUtils.copyFile(file, new File(".\\Screeshotsss\\"+"CRM4"+".png"));

	 
       
	   
  }
}
