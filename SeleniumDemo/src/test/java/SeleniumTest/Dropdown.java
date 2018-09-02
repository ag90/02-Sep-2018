          package SeleniumTest;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
	
	
	WebDriver driver;
	
	 @Test
	  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
	  
	  ChromeOptions option=new ChromeOptions();
	  option.addArguments("disable-infobars");
	  
	  driver=new ChromeDriver(option);
	  driver.manage().window().maximize();
	  driver.get("https://www.freecrm.com");
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
	  
	  Select select2=new Select(driver.findElement(By.name("payment_plan_id")));
	  
	  WebElement EditionDropdown=select2.getFirstSelectedOption();//getFirstSelectedOption 
	  //it will return webelement, we can use it this method where we need to verify default dropdown value.
	  System.out.println(EditionDropdown.getText());
	  
	  Select select=new Select(driver.findElement(By.name("payment_plan_id")));
	  select.selectByIndex(2);
	  
	  Thread.sleep(5000);
	  
	  Select select1=new Select(driver.findElement(By.name("payment_plan_id")));
	  select1.selectByValue("1");
	  
	  Thread.sleep(5000);
	  
	  Select select3=new Select(driver.findElement(By.name("payment_plan_id")));
	  select3.selectByVisibleText("CRMPRO - $29.95 user/mo.");
	  
	  
	  WebElement EditionDropdown1=select3.getFirstSelectedOption();//getFirstSelectedOption 
	  //it will return webelement, we can use it this method where we need to verify default dropdown value.
	  String text=EditionDropdown1.getText();
	  System.out.println(text);
	  assertEquals(text, "CRMPRO - $29.95 user/mo.","by default drodown value is incorrect");
	  
	  
	  List<WebElement>DropdownAllValues=select3.getOptions();
	  int sizeofdropdown=DropdownAllValues.size();
	  System.out.println("size of dropdown"+sizeofdropdown);
	  
	  for (WebElement options : DropdownAllValues) {
		
		  String optionstext=options.getText();
		  System.out.println("Dropdown values are : "+optionstext);
	}
	  
}
	 
}