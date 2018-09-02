package PropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Properties_11_04_2018 {
	
	 static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {


		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\guptaav\\Mars_workspace\\SeleniumDemo\\src\\main\\java\\PropertiesFile\\Config_Properties_Data_File_11_04_2018");
		prop.load(fis);
		
		System.out.println(prop.getProperty("Url"));
		System.out.println(prop.getProperty("Username"));
		System.out.println(prop.getProperty("Password"));
		System.out.println(prop.getProperty("1stbrowser"));
		System.out.println(prop.getProperty("2 ndbrowser"));
		
		System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		String Url=prop.getProperty("Url");
		driver.get(Url);
		driver.findElement(By.xpath(prop.getProperty("UsernameXpath"))).sendKeys(prop.getProperty("UsernameData"));
		driver.findElement(By.xpath(prop.getProperty("PasswordXpath"))).sendKeys(prop.getProperty("PasswordData"));
		driver.findElement(By.xpath(prop.getProperty("LogInButton"))).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
