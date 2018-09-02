/**
 * 
 */
package Com.crm.qa.TestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com.crm.qa.Base.TestBase;
import Com.crm.qa.Utility.Utility;
import Com.crm.qa.pages.HomePage;
import Com.crm.qa.pages.LoginPage;

/**
 * @AUTHOR : GUPTAAV
 *
 */
public class ContactsPageTest extends TestBase {
	
	SoftAssert asserts=new SoftAssert();
	HomePage homepage;
	Utility uti;
	LoginPage loginpage;
	
	
	
	
	@Test(priority=0)
	public void VerifyHomePageTitleTest() throws InterruptedException{
		
		   Initilization();
		   homepage=new HomePage();
		   uti=new Utility();
		   loginpage=new LoginPage();
		   
		   loginpage.Login(prop.getProperty("Username"), prop.getProperty("Password"));
		   
		  String VerifyHomePageTitle= homepage.VerifyHomePageTitle();
		  asserts.assertEquals(VerifyHomePageTitle, "CRMPRO", "Invalid HomePage Title");
		  asserts.assertAll();
		}
	
	
	@Test(priority=1)
	public void ClickOnContactsTest(){
		
		uti.SwitchTOMainPanelframe();
		homepage.ClickOnContacts();
		
	}
	
	@Test(priority=2)
	public void VerifyContactPageLabelTest() throws InterruptedException{
		
		boolean VerifyContactPageLabel=homepage.VerifyContactPageLabel();
		asserts.assertTrue(VerifyContactPageLabel, "Contacts Label is not getting displayed");
		asserts.assertAll();
		
	}
	
	@Test(priority=3)
	public void VerifyContactsListTest(){
		
	 boolean VerifyContactsList=homepage.VerifyContactsList();
	 asserts.assertTrue(VerifyContactsList, "Contacts Name 'Avi Gupta' is not getting displayed ");
	 asserts.assertAll();
	}

}
