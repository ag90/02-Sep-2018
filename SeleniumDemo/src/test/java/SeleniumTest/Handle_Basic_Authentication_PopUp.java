/**
 * 
 */
package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author guptaav
 *
 */
public class Handle_Basic_Authentication_PopUp {
	
	WebDriver driver;
	
	@Test
	public void test(){
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Handle_Basic_Authentication_PopUp: we have to write username and password as well with URL 
		//Format: "http://username:password@URL"
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String AssertText=driver.findElement(By.cssSelector("#content > div > p")).getText();
		System.out.println(AssertText);
		Assert.assertEquals(AssertText, "Congratulations! You must have the proper credentials","Invalid text");
		
	}

}
