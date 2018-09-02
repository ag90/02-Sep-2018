package SeleniumTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hanlde_Alert_popup {
	
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
      
      driver.findElement(By.xpath("//button[contains(text(),'Simple Alert')]")).click();
      
      Thread.sleep(5000);
      
      Alert SimpleAlert= driver.switchTo().alert();
      String AlertText=SimpleAlert.getText();
      System.out.println(AlertText);
      SimpleAlert.accept();
      
      
      driver.findElement(By.xpath("//button[contains(text(),'Confirm Pop up')]")).click();
      
      Thread.sleep(5000);

      
      Alert ConfirmationAlert=driver.switchTo().alert();
      String ConfirmAlertText=ConfirmationAlert.getText();
      System.out.println(ConfirmAlertText);
      ConfirmationAlert.dismiss();
      
      driver.findElement(By.xpath("//button[contains(text(),'Prompt Pop up')]")).click();
      
      Thread.sleep(5000);

      
      Alert PromptAlert=driver.switchTo().alert();
      String PromptAlertText=PromptAlert.getText();
      System.out.println(PromptAlertText);
      PromptAlert.sendKeys("Accepting the alert");
      Thread.sleep(5000);
      PromptAlert.accept();
      
      driver.navigate().to("http://the-internet.herokuapp.com/upload");
      
      driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\guptaav\\Downloads\\Capture.PNG");
      
      Thread.sleep(5000);
      
      
      driver.quit();

      
      
      
      
      
      
      
      
  }
}
