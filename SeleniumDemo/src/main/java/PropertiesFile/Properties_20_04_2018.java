package PropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Properties_20_04_2018 {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\guptaav\\Mars_workspace\\SeleniumDemo\\src\\main\\java\\PropertiesFile\\Config_Properties_Data_File_21_04_2018.properties");
		prop.load(fis);
		
		String browsername=prop.getProperty("browser");
		String brow="chromee";
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("URL"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("pwd"));
		
		
		
		if(brow.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(prop.getProperty("URL"));
			driver.manage().window().maximize();
		}
		else
		{
			System.out.println("Browser is not defined");
		}

	}
	}

