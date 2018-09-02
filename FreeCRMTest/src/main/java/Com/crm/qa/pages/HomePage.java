/**
 * 
 */
package Com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.crm.qa.Base.TestBase;

/**
 * @author guptaav
 *
 */
public class HomePage extends TestBase {
	
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement Home;
	
	@FindBy(xpath="//a[contains(text(),'Calendar')]")
	WebElement Calendar;
	
	@FindBy(xpath="//a[contains(text(),'Companies')]")
	WebElement Companies;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	public WebElement Contacts;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement Deals;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement Tasks;
	
	@FindBy(xpath="//a[contains(text(),'Cases')]")
	WebElement Cases;
	
	@FindBy(xpath="//a[contains(text(),'Call')]")
	WebElement Call;
	
	@FindBy(xpath="//a[contains(text(),'Email')]")
	WebElement Email;
	
	@FindBy(xpath="//a[contains(text(),'Text/SMS')]")
	WebElement TextSMS;
	
	@FindBy(xpath="//a[contains(text(),'Print')]")
	WebElement Print;
	
	@FindBy(xpath="//a[contains(text(),'Campaigns')]")
	WebElement Campaigns;
	
	@FindBy(xpath="//a[contains(text(),'Docs')]")
	WebElement Docs;
	
	@FindBy(xpath="//a[contains(text(),'Forms')]")
	WebElement Forms;
	
	@FindBy(xpath="//a[contains(text(),'Reports')]")
	WebElement Reports;
	
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement ContactsLabel;
	
	@FindBy(xpath="//a[contains(text(),'Avi Gupta')]")
	WebElement ContactsList;
	
	public HomePage(){
		
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnHome(){
		Home.click();
	}
	
	public void ClickOnCalendar(){
		Calendar.click();
	}
	public void ClickOnCompanies(){
		Companies.click();
	}
	public void ClickOnContacts(){
		Contacts.click();
	}
	public void ClickOnDeals(){
		Deals.click();
	}
	public void ClickOnTasks(){
		Tasks.click();
	}
	public void ClickOnCases(){
		Cases.click();
	}
	public void ClickOnCall(){
		Call.click();
	}
	public void ClickOnEmail(){
		Email.click();
	}
	public void ClickOnTextSMS(){
		TextSMS.click();
	}
	public void ClickOnPrint(){
		Print.click();
	}
	
	public void ClickOnCampaigns(){
		Campaigns.click();
	}
	public void ClickOnDocs(){
		Docs.click();
	}
	public void ClickOnForms(){
		Forms.click();
	}
	public void ClickOnReports(){
		Reports.click();
	}
	

	public String VerifyHomePageTitle(){
		
		return driver.getTitle();
		
	}
	
	
	public boolean VerifyContactPageLabel(){
		
         return ContactsLabel.isDisplayed();
	}
	
	public boolean VerifyContactsList(){
		
		return ContactsList.isDisplayed();
		
	}
	
	

}
