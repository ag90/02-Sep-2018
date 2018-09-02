package SeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleCalandar {
	
	WebDriver driver;
	
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.spicejet.com");
	  
	 /* driver.findElement(By.name("username")).sendKeys("naveenk");
	  driver.findElement(By.name("password")).sendKeys("test@123");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
	  driver.switchTo().frame(1);
	  Actions act=new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Calendar')]"))).click().build().perform();
	  Thread.sleep(2000);
	  
	  List<WebElement> CalendarMonths=driver.findElements(By.xpath("//td[@class='calendartitle']//select[@name='slctMonth']//option"));
	  int CalendarMonthscount =CalendarMonths.size();
	  System.out.println(CalendarMonthscount);
	  
	  for (WebElement Months : CalendarMonths) {
		  
		  System.out.println(Months.getText());
		  
		  if (Months.getText().equalsIgnoreCase("December")) {
			  			 
		     Select select=new Select(driver.findElement(By.xpath("//td[@class='calendartitle']//select[@name='slctMonth']")));
			select.selectByVisibleText("December");
			
		}
		  
		
	}
	  
	  
		  List<WebElement> calendarDates=driver.findElements(By.xpath("//td[@class='calendarcell']"));
		  int calendarDatescount =calendarDates.size();
		  System.out.println(calendarDatescount);
	  
		  for (WebElement element : calendarDates) {
			
			System.out.println(element.getText());
			
			if (element.getText().equalsIgnoreCase("22")) {
				
				element.click();
			}
			
		}
		 
	  
	      Thread.sleep(2000);
	      
		  driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date1']")).click();
		  
		  Thread.sleep(2000);
		  
		  List<WebElement> calendar=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//tbody//td"));
		  System.out.println(calendar.size());
		  
		  for (WebElement ele : calendar) {
			
			  System.out.println(ele.getText());
			  
			  if (ele.getText().equalsIgnoreCase("27")) {
				  
				  ele.click();
				  
				
			}
			  
		}
		  
		  
		   */
	  
	  Thread.sleep(2000);
      
	  driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date1']")).click();
	  
	  Thread.sleep(2000);
	  
	  List<WebElement> calendar=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//tbody//td"));
	  System.out.println(calendar.size());
	  
	  for (WebElement ele : calendar) {
		
		  System.out.println(ele.getText());
		  
		 
	}
	  
	  
	  
	  for (WebElement ele1 : calendar) {
			
		 if (ele1.getText().equalsIgnoreCase("27")) 
		 
		 {
			ele1.click();
			System.out.println("27 Date is Clicked");
			break;
		}
		  
		 
	}
	  
	  
	  
		 
		
	  
	
	  
	  
	  
  }
  }

