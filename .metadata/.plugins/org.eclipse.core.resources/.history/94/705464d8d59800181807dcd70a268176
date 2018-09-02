package SeleniumTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PropertiesConfigClass {
	
	WebDriver driver;
	
  @Test
  public void f() throws IOException, InterruptedException {
	  
	  Properties prop=new Properties();
	  FileInputStream fis=new FileInputStream("C:\\Users\\guptaav\\Mars_workspace\\SeleniumDemo\\TestDemo.properties");
	  prop.load(fis);
	  
	  System.setProperty(prop.getProperty("SYSTEMSETPROPERTY"), "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
	  
	  ChromeOptions chrome=new ChromeOptions();
	  chrome.addArguments("disable-infobars");
	  
	  driver=new ChromeDriver(chrome);
	  driver.manage().window().maximize();
	  driver.get(prop.getProperty("URL"));
	  
	 WebElement Username= driver.findElement(By.name(prop.getProperty("USERNAME")));
	 Username.sendKeys(prop.getProperty("USERNAMEDATA"));
	 
	 WebElement Password=driver.findElement(By.name(prop.getProperty("PASSWORD")));
	 Password.sendKeys(prop.getProperty("PASSWORDDATA"));
	 
	 Thread.sleep(2000);
	 
	 WebElement LoginButton=driver.findElement(By.xpath(prop.getProperty("LOGINBUTTON")));
	 LoginButton.click();
	 
	 Thread.sleep(5000);
	 
	 driver.switchTo().frame("mainpanel");
	 
	 WebElement SearchBox=driver.findElement(By.name(prop.getProperty("SEARCHBOX")));
	 SearchBox.sendKeys(prop.getProperty("SEARCHBOXDATA"));
	
	 
	 WebElement Dropdown= driver.findElement(By.name(prop.getProperty("DROPDOWN")));
	 Select select=new Select(Dropdown);
	 select.selectByValue(prop.getProperty("DROPDOWNDATA"));
	 
	 
	 WebElement SearchButton=driver.findElement(By.xpath(prop.getProperty("SEARCHBUTTON")));
	 SearchButton.click();
	 
	 
  }
}
