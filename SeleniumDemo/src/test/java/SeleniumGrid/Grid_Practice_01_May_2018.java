package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid_Practice_01_May_2018 {
	
	
	WebDriver driver;
	
	@Test
	public void grid() throws MalformedURLException{
		
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WIN10);
	driver=new RemoteWebDriver(new URL("http://172.26.208.1:4444/wd/hub/"), cap);
	
	ChromeOptions chr=new ChromeOptions();
	chr.addArguments("disable-infobars");
	
	driver.manage().window().maximize();
	String URL="http://google.co.in";
	driver.get(URL);
	String Title=driver.getTitle();
	System.out.println("Google Title:" + Title);
	driver.quit();
		
	}

}
