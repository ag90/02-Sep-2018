package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.testng.annotations.Test;

public class Keyborad_Handling {
	
	WebDriver driver;
	
	
	
  @Test
  public void f() throws InterruptedException {
	  
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions chrome=new ChromeOptions();
		chrome.addArguments("disable-infobars");
		driver=new ChromeDriver(chrome);
		driver.manage().window().maximize();
		String URL="https://the-internet.herokuapp.com/key_presses";
		driver.get(URL);
		
		System.out.println(driver.getCurrentUrl());
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(5000);
		action.sendKeys(Keys.F2).build().perform();
		Thread.sleep(5000);
		action.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(5000);
		action.sendKeys(Keys.TAB).build().perform();
		
		driver.navigate().to("http://www.freecrm.com");
		Thread.sleep(5000);
		action.sendKeys(driver.findElement(By.name("username")),Keys.SPACE).build().perform();
		Thread.sleep(5000);
		action.sendKeys(driver.findElement(By.name("username")), Keys.SEMICOLON).build().perform();
		Thread.sleep(5000);
		action.sendKeys(driver.findElement(By.name("password")), Keys.TAB).build().perform();
		Thread.sleep(5000);
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		action.sendKeys(driver.findElement(By.name("username")), Keys.NUMPAD7).build().perform();
		
  }
}
