package Actions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class basics {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
		//System.out.println(driver.getCurrentUrl());
		
		
		
		String windowID=driver.getWindowHandle();
		System.out.println("Single Window Id is --"+windowID);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		
		Boolean field=driver.findElement(By.xpath("//input[@name='firstname']")).isDisplayed();
		System.out.println("Firstname field is--"+field);
		
		WebElement female_id=driver.findElement(By.xpath("//input[@value='1']"));
		//female_id.click();
		System.out.println("Male dropbox is selected--"+female_id.isSelected());
		
		WebElement male_id=driver.findElement(By.xpath("//input[@value='2']"));
		//male_id.click();
		System.out.println("Female dropbox is selected --"+male_id.isSelected());
		
		
		
		WebElement custom_id=driver.findElement(By.xpath("//input[@value='-1']"));
		custom_id.click();
		System.out.println("Custom dropbox is selected--"+custom_id.isSelected());
		
		
		
		Thread.sleep(200);
		
		
		
//		driver.quit();
		

	}

}
