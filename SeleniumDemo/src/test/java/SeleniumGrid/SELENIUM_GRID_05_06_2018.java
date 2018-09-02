package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SELENIUM_GRID_05_06_2018 {
	
	WebDriver driver;
	
	@Test
	public void GridTest() throws MalformedURLException{
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		driver=new RemoteWebDriver(new URL("http://172.26.208.1:4444/wd/hub/"),cap);
		
		driver.manage().window().maximize();
		String WebUrl="http:www.google.co.in";
		driver.get(WebUrl);
		String GoogleTitle=driver.getTitle();
		System.out.println(GoogleTitle);
		driver.quit();
	}

}
