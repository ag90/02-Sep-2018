package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Dynamic_Xapth {
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
	  
	  ChromeOptions option=new ChromeOptions();
	  option.addArguments("disable-infobars");
	  
	  driver=new ChromeDriver(option);
	  driver.manage().window().maximize();
	  driver.get("https://www.ebay.com/");
	  
	  boolean Searchbox= driver.findElement(By.xpath("//input[@name='_nkw']")).isDisplayed();//relative
	  System.out.println(Searchbox);
	  
	  boolean Searchbox1= driver.findElement(By.xpath("//input[@type='text']")).isDisplayed();//relative with type function
	  System.out.println(Searchbox1);
	  
	  boolean Advanced= driver.findElement(By.xpath("//a[text()='Advanced']")).isDisplayed();//relative with text function
	  System.out.println(Advanced);
	  
	  
	  boolean BusinessIndustrial =driver.findElement(By.xpath("//a[contains(text(),' Daily Deals')]")).isDisplayed();//relative with contains function
	  System.out.println(BusinessIndustrial);
	  
	  driver.findElement(By.xpath("//a[@class='hl-cat-nav__js-tab' or text()='Collectibles & Art']")).click();//relative with or function
	  
	  boolean Searchbox2= driver.findElement(By.xpath("//input[@id='gh-ac' and @type='text']")).isDisplayed();//relative with and function
	  System.out.println(Searchbox2);
	  
	  driver.findElement(By.xpath("//td[@id='gh-cat-td']//div[@id='gh-cat-box']//select[@name='_sacat']")).click();//relative with decendent function
	  
	  driver.findElement(By.xpath("//input[starts-with(@id,'gh-b')]")).click();	  //relative with starts-with function
	  
  }
}
