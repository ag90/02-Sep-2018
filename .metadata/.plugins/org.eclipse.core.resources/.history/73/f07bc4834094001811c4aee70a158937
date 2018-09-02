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


public class TakeScreenshot {
	
	WebDriver Driver;
	
	
  @Test
  public void f() throws IOException, InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
	   Driver=new ChromeDriver();
	   Driver.manage().window().maximize();
	   Driver.get("https://www.freecrm.com");
	   
	   Thread.sleep(2000);
	   Driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
	   
	   File file=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
	   //Store the screenshot in file object 'file', declare the takesscreenshot interface
	   //with type casting and take a method of takesscreenshot method 
	   //'getScreenshotAs' in which format you want to store the screenshot as File.
	   FileUtils.copyFile(file, new File(".//TakeScreenshots//"+"FREECRMS"+".png"));
	   
	   
	   /*
	    1: ./ or //Single will create folder to save the screenshots.
	    EX: //SeleniumTest//Filename
	    
	    2: If you give full path till your package name then will not create a folder it will save the screenshots in that mentioned package.
	    EX: "C:\\Users\\guptaav\\Mars_workspace\\SeleniumDemo\\src\\test\\java\\SeleniumTest\\Filename
	   
	   */
	   
	   Driver.quit();
	   
       
	   
  }
}
