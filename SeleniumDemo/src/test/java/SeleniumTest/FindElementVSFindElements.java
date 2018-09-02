package SeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElementVSFindElements {
	
	WebDriver driver;
	
	
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.freecrm.com");
	  
	 WebElement SingleElement= driver.findElement(By.xpath("//a[@class='navbar-brand']"));
	 System.out.println(SingleElement.isDisplayed());
	 
	 WebElement text=driver.findElement(By.xpath("//font[contains(text(),'Sign')]"));
	 String SignUptext=text.getText();
	 System.out.println(SignUptext);
	 

	 System.out.println("----------------------------------");
	 
	 
	 List<WebElement> MultipleElementOfLinks= driver.findElements(By.tagName("a"));
	 
	 
	 System.out.println("Total No Of Elements --- "+MultipleElementOfLinks.size());
	 
	 
	 System.out.println("----------------------------------");
	 
	 
	 
	 for (WebElement Links1 : MultipleElementOfLinks) {
		 
		 System.out.println(Links1.getAttribute("class"));
		
	 }

	 System.out.println("----------------------------------");
		 
 
	 for (WebElement Links : MultipleElementOfLinks) {
		 
		 System.out.println(Links.getTagName());
		
	}
	 System.out.println("----------------------------------");
		 
		 for (WebElement Links : MultipleElementOfLinks) {
			 
			
			 System.out.println(Links.getText());
			
		}
		 
		 System.out.println("----------------------------------");
		 

		List<WebElement>  MultipleElementOfInputFileds= driver.findElements(By.xpath("//input"));
		 
		 for (WebElement ListOfInputFields : MultipleElementOfInputFileds) {
			 
			 System.out.println(ListOfInputFields.getAttribute("type"));
			
		}
		 
		 System.out.println("----------------------------------");
		 
		
		 
		 for (WebElement ListOfInputFields : MultipleElementOfInputFileds) {
			 
			 System.out.println(ListOfInputFields.getTagName());
			
		}
		 
		 System.out.println("----------------------------------");
		 
		 
         for (WebElement ListOfInputFields : MultipleElementOfInputFileds) {
			 
			 System.out.println(ListOfInputFields.getText());
			
		}
		 
		 
		 
		 driver.close();
		 
		 
		 
	 
	 
  }
}
