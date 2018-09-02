package Com.crm.qa.TestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com.crm.qa.Base.TestBase;
import Com.crm.qa.Utility.Utility;
import Com.crm.qa.pages.LoginPage;



public class LoginPageTest extends TestBase {
	
	SoftAssert asserts =new SoftAssert(); 
	LoginPage loginpage;
	Utility uti;
  
	/*public  LoginPageTest() {
		super();
	}*/
	

	
	@Test(priority=0)
  public  void FreeCRMTitleTest() {
	Initilization();
	loginpage=new LoginPage();
	uti=new Utility();
	String title=loginpage.GetFreeCRMTitle();
	asserts.assertEquals(title, "Free CRM software in the cloud powers sales and customer service", "Invalid LoginPage CRM-Title");
	asserts.assertAll();
	
	
  }
	
	@Test(priority=1)
	public void CRMLogoTest(){
		
		boolean Logo=loginpage.FreeCRMLogo();
		asserts.assertTrue(Logo, "CRM-Logo is not displayed");
	}
	
	@Test(priority=2)
	public void LoginTest() throws InterruptedException{
		
		loginpage.Login(prop.getProperty("Username"), prop.getProperty("Password"));
		
	}
	
	
	@Test(priority=3)
	public void VerifyusernameLabelTest(){
	uti.SwitchTOMainPanelframe();
	boolean AccessLabel=LoginPage.VerifyCorrectAccountAccessLabel();
	asserts.assertEquals(AccessLabel,"Correct Username Label is not Verified");
		
	}
	
	
	
}
