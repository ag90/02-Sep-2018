/**
 * 
 */
package Com.crm.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import Com.crm.qa.Utility.WebEventListener;


/**
 * @author guptaav
 *
 */
public class TestBase {
	
	      public static Properties prop;
		  public  static WebDriver driver;
		  public static ChromeOptions options;
		  public static long IMPLICIT_WAIT=10;
		  /*public static EventFiringWebDriver e_driver;
		  public static WebEventListener eventListener;*/
			  
	
	public  TestBase(){
		
		try {
			
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\guptaav\\Mars_workspace\\FreeCRMTest\\src\\main\\java\\Com\\crm\\qa\\Config\\ConfigFile.properties");
		prop.load(fis);

			
		}
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}
			
		
		public static void Initilization(){
			
		
		String browserName=prop.getProperty("Browser");
		String UrlName=prop.getProperty("Url");
		
			
		if (browserName.equalsIgnoreCase("chrome")) {
				
			System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
			options=new ChromeOptions();
			options.addArguments("disable-infobars");
			driver=new ChromeDriver(options);			
			}
		
		else if (browserName.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		/*e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;*/
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(UrlName);
			
		}
		
	
	
	
	
	

}
