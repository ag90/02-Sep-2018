package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class Grid_Practice_20_April_2018 {
	
		public static void main (String []args) throws MalformedURLException{
			
			WebDriver driver;
			
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WIN10);
			driver =new RemoteWebDriver(new URL("http://10.141.233.96:4444/wd/hub/"),cap);
			
			driver.manage().window().maximize();
			String URL="http://www.google.co.in";
			driver.get(URL);
			String TitleOfGoogle=driver.getTitle();
			System.out.println(TitleOfGoogle);
			driver.quit();
			
		}
		
		
		
	}
	
	
	
	
	
	
	
		
	
		
	
	
	
	
	


