package Conditional_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NOP {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		//isDisplayed Method
		WebElement logo=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		System.out.println("Verify the Logo -"+logo.isDisplayed());
		
		//isEnabled
		WebElement enable=driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
		System.out.println(enable.isEnabled());
		
		//isSelected
		
		driver.findElement(By.id("gender-male")).click();
		WebElement selected=driver.findElement(By.id("gender-male"));
		System.out.println(selected.isSelected());
		
		//Explicit Wait
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement test=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		test.sendKeys();
		
		
		
		
		driver.close();
		

	}

}
