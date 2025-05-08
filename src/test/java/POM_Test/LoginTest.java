package POM_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginTest {

	  WebDriver driver;
		
		@BeforeClass
		void setup()
		{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		}
		
		@Test
		
		void testlogin()
		{
		LoginPage page=new LoginPage(driver);
		
		page.enteremailaddress("pankajchavan4002@gmail.com");
		
		page.enterpassword("Pankaj@123");
		
		page.enterbtn();
		
		}
		
		@AfterClass
		
		void tearDown()
		{
			driver.close();
		}

	}


