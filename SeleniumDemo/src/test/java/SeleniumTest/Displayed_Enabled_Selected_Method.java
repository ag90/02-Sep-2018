package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Displayed_Enabled_Selected_Method {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  
		  System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
		 
		  ChromeOptions chrome=new ChromeOptions();
		  chrome.addArguments("disable-infobars");
	  
		  driver=new ChromeDriver(chrome);
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		
		  driver.get("https://www.freecrm.com/register/");
	  
		 boolean Displayed=driver.findElement(By.name("first_name")).isDisplayed();																													
		 System.out.println(Displayed);
		 
		 boolean Enabled= driver.findElement(By.xpath("//button[text()='SUBMIT']")).isEnabled();
		 System.out.println(Enabled);
		 
		boolean Selected= driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(Selected);
		
		String Url=	driver.getCurrentUrl();
		System.out.println(Url);
		driver.quit();
	
	
	 
	 
	 
  
  }
}
