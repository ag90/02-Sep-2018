package Com.crm.qa.Utility;

import org.openqa.selenium.Alert;

import Com.crm.qa.Base.TestBase;

public class Utility extends TestBase {
	
	Alert alert;
	
	
	
	public   void SwitchTOMainPanelframe(){
		
		driver.switchTo().frame(prop.getProperty("Mainframe"));


	}
	
	public void SwitchToLeftPanelframe(){
		
		driver.switchTo().frame(prop.getProperty("Leftframe"));
	}
	
	public String UserNameAlreadyAlert(){
		
		alert= driver.switchTo().alert();
		String Alert_Text=alert.getText();
		System.out.println(Alert_Text);
		alert.accept();
		return Alert_Text;

	}
	
	public void backNavigation(){
		
		driver.navigate().back();
		
	}
	
    public void forwardNavigation(){
		
		driver.navigate().forward();
		
	}
    
    public void refreshToPageNavigation(){
 		
		driver.navigate().refresh();
		
	}
    
    

}
