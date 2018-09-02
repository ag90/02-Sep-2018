/**
 * 
 */
package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

/**
 * @author guptaav
 *
 */
public class Grid_26_July_2018 {
	
	
	@Test
	public void test() throws MalformedURLException{
		
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		WebDriver driver=new RemoteWebDriver(new URL("http://172.19.114.209:4444/wd/hub/"), cap);
		
		driver.get("http://www.freecrm.com");
		String title=driver.getTitle();
		System.out.println(title);
	}

}
