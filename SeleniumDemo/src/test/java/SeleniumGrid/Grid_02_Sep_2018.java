package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid_02_Sep_2018 {
	
	
	@Test
	public void testonGrid() throws MalformedURLException{
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setPlatform(Platform.WIN10);
		cap.setBrowserName("chrome");
		WebDriver driver=new RemoteWebDriver(new URL("http://172.19.114.209:4444/wd/hub/"),cap); 
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in");
		String Title=driver.getTitle();
		System.out.println(Title);
	}
	
	}


