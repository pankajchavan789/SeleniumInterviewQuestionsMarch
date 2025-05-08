package POM_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	WebDriver driver;
	
	//Constructor
	
	LoginPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//Locators
	
	@FindBy(xpath="//input[@id='email']") WebElement emailaddress;
	
	@FindBy(xpath="//input[@id='pass']") WebElement password;
	
	@FindBy(xpath="//button[@id='u_0_5_QW']") WebElement loginbtn;
	
	
	// Actions Method
	
	public void enteremail(String email)
	{
		emailaddress.sendKeys(email);
	}
	
	public void enterpassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void enterloginbtn()
	{
		loginbtn.click();
	}
}
