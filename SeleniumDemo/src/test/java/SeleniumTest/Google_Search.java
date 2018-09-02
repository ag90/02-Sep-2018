/**
 * 
 */
package SeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author guptaav
 *
 */
public class Google_Search {
	
	WebDriver driver;
	
	
	@Test
	public void test() throws InterruptedException{
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.google.co.in");
		  
		  driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		  Thread.sleep(2000);
		  
		  //driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
		//ul[@role='listbox']//li[@class='sbsb_c gsfs']//div[@class='sbqs_c']
		  
		 List<WebElement> SearchboxList= driver.findElements(By.xpath("//ul[@role='listbox']//li[@class='sbsb_c gsfs']//div[@class='sbqs_c']"));
		 int SearchboxListSize=SearchboxList.size();
		 System.out.println(SearchboxListSize);
		 
		 for (WebElement element : SearchboxList) {
			
			 String seleniumtext=element.getText();
			 System.out.println(seleniumtext);
			 
			 if (seleniumtext.contentEquals("selenium element")) 
			{
			
				 element.click();
				 break;
				 
			}
		}
			 
			
			
		}
		  
		  
		
		  
	}


