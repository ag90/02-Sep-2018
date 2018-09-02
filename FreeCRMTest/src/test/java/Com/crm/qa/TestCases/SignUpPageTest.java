/**
 * 
 */
package Com.crm.qa.TestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com.crm.qa.Base.TestBase;
import Com.crm.qa.Utility.Utility;
import Com.crm.qa.pages.LoginPage;
import Com.crm.qa.pages.SignUpPage;



/**
 * @author guptaav
 *
 */
public class SignUpPageTest extends TestBase {
	
	SoftAssert asserts=new SoftAssert();
	SignUpPage signUpPage;
	LoginPage loginpage;
	Utility util;
	
	@Test(priority=1)
	public void SignUpbutton() throws InterruptedException{
		Initilization();
		signUpPage=new SignUpPage();
		loginpage=new LoginPage();
		util =new Utility();
		String title=loginpage.GetFreeCRMTitle();
		asserts.assertEquals(title, "#1 Free CRM software in the cloud for sales and service","Invalid LoginPage CRM-Title");
		asserts.assertAll();
		Thread.sleep(2000);
		signUpPage.ClickOnSignUpbutton();
	}
	
	
	@Test(priority=2)
	public void SignUpGetTitleTest(){
	 
		String SignUpGetTitleTest= signUpPage.SignUpTitle();
		asserts.assertEquals(SignUpGetTitleTest, "CRMPRO - CRM Pro for customer relationship management, sales, and support","Invalid SignUpPage CRM-Title");
		asserts.assertAll();
	}
	
	@Test(priority=3)
	public void SignUpEditionDropdownValuesTest(){
		
		signUpPage.SignUpEditionDropdownValues();
	}
	
	@Test(priority=4)
	public void VerifyAllFieldsAreRequiredLabelTest(){
		
		boolean FieldsAreRequiredLabel=signUpPage.VerifyAllFieldsAreRequiredLabel();
		asserts.assertTrue(FieldsAreRequiredLabel, "FieldsAreRequiredLabel is not getting displayed");
		asserts.assertAll();
	}
	

	@Test(priority=5)
	public void VerifyTermsAndConditionsLinkTest(){
		
		boolean VerifyTermsAndConditionsLink=signUpPage.VerifyTermsAndConditionsLink();
		asserts.assertTrue(VerifyTermsAndConditionsLink, "TermsAndConditionsLink is not getting displayed");
		asserts.assertAll();
	}
	
	@Test(priority=6)
	public void VerifyDisabledIAgreeCheckboxTest(){
		
		boolean DisabledIAgreeCheckboxTest=signUpPage.VerifyDisabledIAgreeCheckbox();
		asserts.assertFalse(DisabledIAgreeCheckboxTest, "IAgreeCheckbox is not getting disabled");
		asserts.assertAll();
	}
	
	@Test(priority=7)
	public void VerifyDisabledSubmitbuttonTest(){
		
		boolean VerifyDisabledSubmitbutton=signUpPage.VerifyDisabledSubmitbutton();
		asserts.assertFalse(VerifyDisabledSubmitbutton, "Submitbutton is not getting disabled");
		asserts.assertAll();
	}	
	
	
	

	
	@Test(priority=8)
	public void SignUpEditionDropdownTest(){
		
		signUpPage.SignUpEditionDropdown(prop.getProperty("EditionDropdownValue1"));
	}
	
	
	
	@Test(priority=9)
	public void SignUpFormTest(){
		signUpPage.SignUpForm(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("email"), 
		prop.getProperty("confirmemail"), prop.getProperty("username"), prop.getProperty("password"), 
		prop.getProperty("confirmpassword"));
	}

	
	
	@Test(priority=10)
	public void VerifyEnabledIAgreeCheckboxTest(){
		
		boolean EnabledIAgreeCheckbox=signUpPage.VerifyEnabledIAgreeCheckbox();
		asserts.assertFalse(EnabledIAgreeCheckbox, "IAgreeCheckbox is not getting enabled");
		asserts.assertAll();
	}
	
			
	
	@Test(priority=11)
	public void ClickingOnCheckboxTest(){
		
		signUpPage.ClickingOnCheckbox();
	}
	
	@Test(priority=12)
	public void VerifyEnabledSubmitbuttonTest(){
		
		boolean VerifyEnabledSubmitbutton=signUpPage.VerifyEnabledSubmitbutton();
		asserts.assertTrue(VerifyEnabledSubmitbutton, "Submitbutton is not getting enabled");
		asserts.assertAll();
	}
	
	@Test(priority=13)
	public void SubmitbuttonTest(){
	
		signUpPage.ClickOnSubmitbutton();
	
	}
	
	
	
	@Test(priority=14)
	public void VerifyAlert() throws InterruptedException{
		
	String Verify_Alert_Text=util.UserNameAlreadyAlert();
	asserts.assertEquals(Verify_Alert_Text,"Errors were encountered: This username is already in use by another user. Please select a different username.", "Alert Msg Is Getting Displayed Wrong");
	asserts.assertAll();
	}
	
	@Test(priority=15)
	public void backToLoginPage(){
		
		util.backNavigation();
		util.backNavigation();
	}
	
	
	
}
