package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(5000);
		
		
		
		WebElement name=driver.findElement(By.xpath("//input[@name='q']"));
		name.sendKeys("samsung galaxy s25 ultra");
		
		
		
	
		
		List<WebElement> suggest=driver.findElements(By.xpath("//li[@class='_3D0G9a']"));
		
		Thread.sleep(3000);
		
		for(int i=0;i<suggest.size();i++) {
			System.out.println(suggest.get(i).getText());
			
			if(suggest.get(i).equals(name)) {
				suggest.get(i).click();
			}
		}
		
			
		
		
				
				
				
	}

}
