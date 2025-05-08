package POM_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CooptexPage {
	
	WebDriver driver;
	
	//Constructor
	
	CooptexPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	
	
	@FindBy(xpath="//input[@id='username']") WebElement enterusername;
	
	@FindBy(xpath="//input[@id='password']") WebElement enterpassword;
	
	@FindBy(xpath="//input[@name='j_idt6:j_idt10']") WebElement loginbtn;
	
	
	//Actions Method
	
	public void enterusername(String username)
	{
		enterusername.sendKeys(username);
	}
	
	public void enterpassword(String pwd)
	{
		enterpassword.sendKeys(pwd);
	}
	
	public void enterloginbtn()
	{
		loginbtn.click();
	}

	
	

}
