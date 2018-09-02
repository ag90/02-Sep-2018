package com.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ItestListenerFailedScreenshot.class)


public class FailedTestCases extends FailedTestcasesScreenshot {

	
	
	@Test()
	
  public void f() {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
		  Options=new ChromeOptions();
		  Options.addArguments("disable-infobars");
		  driver=new ChromeDriver(Options);
		  driver.manage().window().maximize();
		  driver.get("http://www.freecrm.com");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenk");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@class='btn btn-smalll']")).click();
  }
}
