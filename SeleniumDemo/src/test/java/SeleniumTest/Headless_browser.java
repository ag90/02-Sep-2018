package SeleniumTest;



import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class Headless_browser {
	
	WebDriver driver;
	
	@Test
	public void headless_browser(){
		
	System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
	driver=new HtmlUnitDriver();


/*	System.setProperty("phantomjs.binary.path", "C:\\Avi Gupta\\Automation\\Automation Software\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
	driver=new PhantomJSDriver();*/
	
	driver.get("https://www.irctc.co.in/");
	
	System.out.println(driver.getTitle());
	
	Actions act=new Actions(driver);
	WebElement Trains=driver.findElement(By.xpath("//a[contains(text(),'TRAINS')]"));
	
	act.clickAndHold(Trains).build().perform();
	
	}

}
