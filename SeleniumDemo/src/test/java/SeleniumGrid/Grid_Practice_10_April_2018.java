package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid_Practice_10_April_2018 {
	
	WebDriver driver;
	
	
  @Test
  public void f() throws MalformedURLException {
	  
	  DesiredCapabilities cap=new DesiredCapabilities();
	  cap.setBrowserName("chrome");
	  cap.setPlatform(Platform.WINDOWS);
	  driver= new RemoteWebDriver(new URL("http://10.92.97.229:4444/wd/hub/"), cap);
	  
	  driver.manage().window().maximize();
	  String URL="https://www.google.co.in/";
	  driver.get(URL);
	  String TitleOfGoogle=driver.getTitle();
	  System.out.println("TitleOfGoogle Is Printed => " +TitleOfGoogle);
	  driver.quit();
	  
  }
}
