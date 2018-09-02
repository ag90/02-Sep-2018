package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListener.class)

public class TestNGFailedTestCaseScreenShot extends ScreenShotBase {
	

	@BeforeTest
	public void beforetest() throws InterruptedException{
		   //public   void initilization() throws InterruptedException {
				  
				  System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
				  Options=new ChromeOptions();
				  Options.addArguments("disable-infobars");
				  driver=new ChromeDriver(Options);
				  driver.manage().window().maximize();
				  Thread.sleep(2000);
				  driver.get("http://www.freecrm.com");
		
	}
		
	
	
      
	  @Test(priority=0)
	  public void FreeCrmPage() {
		  
		  String Title=driver.getTitle();
		  System.out.println(Title);
	  }
	  
	  @Test(priority=1)
	  public void FreeCrmLoginPage() throws InterruptedException {
		  
		driver.findElement(By.xpath("//input[substring(@name,string-length(@name)- string-length('name')-3)='username']")).sendKeys("agupta3");
		driver.findElement(By.xpath("//input[starts-with(@name,'pass')]")).sendKeys("test1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'btn btn-small')]")).click();
		
	  }
	  
	  @Test(priority=2)
	  public void FreeCrmHomePage() throws InterruptedException {
		  driver.switchTo().frame(driver.findElement(By.name("mainpanel")));
		  Thread.sleep(2000);
		boolean SearchImage= driver.findElement(By.xpath("//input[@type='image']")).isDisplayed();
		System.out.println(SearchImage);
		
	  }
	  
	  @Test(priority=3)
	  public void FreeCrmHomeCallPage() throws InterruptedException {
		  
		driver.findElement(By.xpath("//a[contains(text(),'Cont')]")).click();
		
		driver.findElement(By.xpath("//a[starts-with(text(),'Cont')]")).click();
		
		driver.findElement(By.xpath("//a[ends-with(text(),'acts')]")).click();
		
		
	  }






}
