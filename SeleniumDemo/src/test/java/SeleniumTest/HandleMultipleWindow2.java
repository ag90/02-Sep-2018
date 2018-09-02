package SeleniumTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleMultipleWindow2 {
	
	WebDriver driver;
	
	
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.naukri.com/");
      
      String ParentWindow1=driver.getWindowHandle();
      System.out.println(ParentWindow1); 
      
      
      Set<String> HandlingTwoWindows=driver.getWindowHandles();
      System.out.println(HandlingTwoWindows.size());
      System.out.println(HandlingTwoWindows);
      
    
      for ( String HotelandLoungeWindow : HandlingTwoWindows) {
    	  
    	  
    	  
    	  if (!ParentWindow1.equalsIgnoreCase(HotelandLoungeWindow)) 
    	  {
			
    		  driver.switchTo().window(HotelandLoungeWindow);
    		  System.out.println("HotelandLounge Window Title is : "+driver.getTitle());
    		  
    	  }
    	  
      }
     
  
      driver.switchTo().window(ParentWindow1);
      
	  System.out.println("HotelandLounge Window Title is : "+driver.getTitle());
	  driver.quit();
  
  } 
  
  }

