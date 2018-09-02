/**
 * 
 */
package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

/**
 * @author guptaav
 *
 */
public class JS {
	
	WebDriver driver;
	@Test
	public void JSExecutor() throws InterruptedException{
		
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
		 
		  ChromeOptions chrome=new ChromeOptions();
		  chrome.addArguments("disable-infobars");
		  
		  driver=new ChromeDriver(chrome);
		  driver.manage().window().maximize();
		  driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("scroll(0,200)");
		js.executeScript("document.getElementById('identifierId').value='avigupta@gmail.com'");
		js.executeScript("document.getElementById('identifierNext').click()");		
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");

		
	}
}
