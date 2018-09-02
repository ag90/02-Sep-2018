/**
 * 
 */
package Com.crm.qa.TestCases;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com.crm.qa.Base.TestBase;
import Com.crm.qa.Utility.Utility;
import Com.crm.qa.pages.ContactsPage;
import Com.crm.qa.pages.HomePage;
import Com.crm.qa.pages.LoginPage;

/**
 * @author guptaav
 *
 */
public class NewContactsPageTest extends TestBase {
	
	SoftAssert asserts=new SoftAssert();
	HomePage homepage;
	ContactsPage contactpage;
	LoginPage loginpage;
	Utility utility;
	
	
	@Test(priority=0)
	public void ClickingOnNewContactPageTest() throws InterruptedException{
		
		Initilization();
		homepage=new HomePage();
		contactpage=new ContactsPage();
		loginpage=new LoginPage();
		utility =new Utility();
		
		loginpage.Login(prop.getProperty("Username"), prop.getProperty("Password"));
		
		utility.SwitchTOMainPanelframe();
		Actions action=new Actions(driver);
		action.moveToElement(homepage.Contacts).build().perform();
		contactpage.ClickingOnNewContactPage();
		
	}
	
	@Test(priority=1)
	public void NewContactPageFormTest() throws InterruptedException{
		
		contactpage.NewContactPageForm(prop.getProperty("title"), prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("company"));
		Thread.sleep(2000);
		contactpage.ClickingOnSavebtn();
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void VerifyContactListTest() throws InterruptedException{
		
		String VerifyContactList= contactpage.VerifyContactListNew(prop.getProperty("Element"));
		asserts.assertEquals(VerifyContactList, prop.getProperty("VerifyContactList"), "VerifyContactList Key of value is not getting Matched");
		asserts.assertAll();
		
		/*boolean VerifyContactList= contactpage.VerifyContactList();
		asserts.assertTrue(VerifyContactList, "ContactList 'Dr. Ansh Sharma' is not getting displayed'");
		asserts.assertAll();*/
		
	}
	
	
	
	
	

}
