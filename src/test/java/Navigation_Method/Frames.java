package Navigation_Method;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		//Frame 1
		
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//*[@id=\"id1\"]/div/input")).sendKeys("Test");
		
		//Back to page
		driver.switchTo().defaultContent();
		//Frame 2
		
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//*[@id=\"id2\"]/div/input")).sendKeys("Automation");
		
		
		driver.switchTo().defaultContent();
		
		//Frame 5
		
		WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Selenium");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/center/a")).click();
		
	    
		
		
		
		
			}

}
