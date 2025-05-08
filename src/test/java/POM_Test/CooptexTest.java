package POM_Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CooptexTest {
	
	WebDriver driver;
	
	@BeforeClass
	
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		driver.get("https://staging.infotex.in/login");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		
	}
	
	@Test
	
	void credentials() throws InterruptedException
	{
		CooptexPage page=new CooptexPage(driver);
		page.enterusername("hosuper");
		page.enterpassword("user1");
		
		Thread.sleep(5000);
		page.enterloginbtn();
				
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	

}
