/**
 * 
 */
package Com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Com.crm.qa.Base.TestBase;

/**
 * @author guptaav
 *
 */
public class ContactsPage extends TestBase {
	
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	@CacheLookup
	WebElement NewContact;
	
	
	@FindBy(xpath="//a[contains(text(),'Combined Form')]")
	@CacheLookup
	WebElement CombinedForm;
	
	@FindBy(xpath="//a[contains(text(),'Full Search Form')]")
	@CacheLookup
	WebElement FullSearchForm;
	
	@FindBy(xpath="//select[@name='title']")
	@CacheLookup
	WebElement title;
	
	@FindBy(xpath="//input[@id='first_name']")
	@CacheLookup
	WebElement FirstName;
	
	@FindBy(xpath="//input[@id='surname']")
	@CacheLookup
	WebElement LastName;
	
	@FindBy(xpath="//input[@name='client_lookup']")
	@CacheLookup
	WebElement Company;
	
	@FindBy(xpath="//form[@name='contactForm']//input[@value='Save']")
	@CacheLookup
    public WebElement Savebtn;
	
	
	@FindBy(xpath="//td[contains(text(),'Manohar Sharma')]")
	@CacheLookup
     WebElement ContactList;
	
	
	
	public ContactsPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickingOnNewContactPage(){
		
		NewContact.click();
	}
	
	public void NewContactPageForm(String titleText,String firstName,String lastName,String company){
		
		
		Select select=new Select(title);
		select.selectByVisibleText(titleText);
		FirstName.sendKeys(firstName);
		LastName.sendKeys(lastName);
		Company.sendKeys(company);
		//Savebtn.click();
		
	 }
	
	
	
	public boolean VerifyContactList() throws InterruptedException{
		
		return ContactList.isDisplayed();
		
	}
	
    public void ClickingOnSavebtn(){
		
	  Savebtn.click();
	  
	 }
    
	public String VerifyContactListNew(String ContactListName){
		
		driver.findElement(By.xpath("//td[contains(text(),'"+ContactListName+"')]"));
		return ContactListName;
		
	}
	
	
	
	
	
	

	
}
