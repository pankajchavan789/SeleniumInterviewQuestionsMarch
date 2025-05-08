package Actions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_click {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
			
		WebElement box1=driver.findElement(By.xpath("//*[@id=\"field1\"]"));
		box1.clear();
		box1.sendKeys("PANKAJ");
		Thread.sleep(3000);
		System.out.println("Name is -"+box1.getAttribute("value"));
		
		WebElement box2=driver.findElement(By.xpath("//*[@id=\"field2\"]"));
		
		
		WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
		
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		act.doubleClick(doubleclick).build().perform();
		Thread.sleep(3000);
		System.out.println("Name is-"+box2.getAttribute("value"));
		
		if(box2.equals("PANKAJ")) {
			System.out.println("Names are correct");
		}
		else {
			System.out.println("Names are not correct");
		}
		

	}

}
