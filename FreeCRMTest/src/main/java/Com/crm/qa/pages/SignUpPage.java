/**
 * 
 */
package Com.crm.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.crm.qa.Base.TestBase;

/**
 * @author guptaav
 *
 */
public class SignUpPage extends TestBase {
	
	
	
	@FindBy(xpath="//div[@id='navbar-collapse']//font[contains(text(),'Sign Up')]")
	 WebElement SignUpbutton;
	
	@FindBy(xpath="//select[@id='payment_plan_id']")
	WebElement EditionDropdown;
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@name='surname']")
	WebElement LastName;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@name='email_confirm']")
	WebElement EmailConfirm;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement Username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@name='passwordconfirm']")
	WebElement ConfirmPassword;

	@FindBy(xpath="//span[contains(text(),'All fields are required.')]")
	WebElement AllFieldsAreRequiredLabel;
	
	@FindBy(xpath="//input[@name='agreeTerms']")
	WebElement IAgreeCheckbox;
	
	@FindBy(xpath="//a[contains(text(),'terms and conditions')]")
	WebElement TermsAndConditions;
	
	@FindBy(xpath="//button[contains(text(),'SUBMIT')]")
	WebElement Submitbutton;
	
	
	public SignUpPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	
	public String SignUpTitle(){
		
		return driver.getTitle();
	}
	
	public void ClickOnSignUpbutton(){
		SignUpbutton.click();
	}
	
	public void SignUpEditionDropdownValues(){
		
		List<WebElement> SignUpEditionDropdownValues= driver.findElements(By.xpath("//select[@name='payment_plan_id']//option"));
		System.out.println("Total No. Of Dropdown Values --- "+SignUpEditionDropdownValues.size());
		
		for (WebElement Values : SignUpEditionDropdownValues) {
			
		   String ValuesGetText=Values.getText();
		   System.out.println("List of Dropdown Values --- "+ValuesGetText);
		}
	}
	
	public void SignUpEditionDropdown(String Values){
		
		Select select=new Select(EditionDropdown);
		select.selectByVisibleText(Values);
		
	}
	
	
	
	public void SignUpForm(String firstname,String lastname,String email,String Confirmemail,String username,
			String password, String confirmpassword){
		
		FirstName.sendKeys(firstname);
		LastName.sendKeys(lastname);
		Email.sendKeys(email);
		EmailConfirm.sendKeys(Confirmemail);
		Username.sendKeys(username);
		Password.sendKeys(password);
		ConfirmPassword.sendKeys(confirmpassword);
		
	}
	
	
	
	public boolean VerifyAllFieldsAreRequiredLabel(){
		
		return AllFieldsAreRequiredLabel.isDisplayed();
		
	}
	
	public boolean VerifyDisabledIAgreeCheckbox(){
		
		return IAgreeCheckbox.isSelected();
		
	}
	
	public boolean VerifyEnabledIAgreeCheckbox(){


		return IAgreeCheckbox.isSelected();
		
	}
	

	public void ClickingOnCheckbox(){
		
		 IAgreeCheckbox.click();
	}
	
	public boolean VerifyTermsAndConditionsLink(){
		
		return TermsAndConditions.isDisplayed();
	}
	
	public boolean VerifyDisabledSubmitbutton(){
		
		return Submitbutton.isEnabled();
		
	}
	
	public boolean VerifyEnabledSubmitbutton(){
		
		return Submitbutton.isEnabled();
		
	}
	
	public void ClickOnSubmitbutton(){
		
		Submitbutton.click();
		
	}
	
	
	
	
	
	


		
	}
	
	

