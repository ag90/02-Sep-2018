package SeleniumTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class TakeScreenshot {
	
	WebDriver driver;
	
	
  @Test
  public void f(String freeCRM) throws IOException, InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.freecrm.com");
	   ChromeOptions opt=new ChromeOptions();
	   opt.addArguments("disable-infobars");
	   
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
	   
	   File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   //Store the screenshot in file object 'file', declare the takesscreenshot interface
	   //with type casting and take a method of takesscreenshot method 
	   //'getScreenshotAs' in which format you want to store the screenshot as File.
	   FileUtils.copyFile(file, new File(".//TakeScreenshots//"+freeCRM+".png"));
	   
	   
	   /*
	    1: ./ single forward or .//double forward or .\single backward or .//double backward slash will create folder to save the screenshots.
	    EX: ".//SeleniumTest//"+String file name+".png"
	    
	    2: If you give full path till your package name with //double forward or \\double backward  then will not create a folder it will save the screenshots in that mentioned package.
	    EX: "C:\\Users\\guptaav\\Mars_workspace\\SeleniumDemo\\src\\test\\java\\SeleniumTest\\Filename
	    EX: "C://Users//guptaav//Mars_workspace//SeleniumDemo//src//test//java//SeleniumTest//Filename
	   
	   */
	   
	   driver.quit();
	   
       
	   
  }
}
