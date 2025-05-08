package POM_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest2 {
	
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
		LoginPage2 login=new LoginPage2(driver);
		login.enteremail("pankajchavan4002@gmai.com");
		login.enterpassword("Pankaj@123");
		login.enterloginbtn();
	}
	
	@AfterClass
	
	void tearDown()
	{
		driver.close();
	}

}
