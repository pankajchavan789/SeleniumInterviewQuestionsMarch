package POM_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	//Constructor
	
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
				
	}
	
	

	//Locators
	
	By emailaddress=By.xpath("//input[@id='email']");
	By password=By.xpath("//input[@id='pass']");
	By login=By.xpath("//button[@id='u_0_5_CU']");
	
	//Actions Methods
	
	public void enteremailaddress(String ename) 
	{
		driver.findElement(emailaddress).sendKeys(ename);
	}
	
	public void enterpassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void enterbtn()
	{
		driver.findElement(login).click();
	}
	
	
	
	

}
