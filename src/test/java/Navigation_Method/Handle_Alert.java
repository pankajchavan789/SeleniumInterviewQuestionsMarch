package Navigation_Method;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//*[@id=\"promptBtn\"]")).click();
		
		//1.Normal Alert
		
//		Alert alert=driver.switchTo().alert();
//		
//		System.out.println(alert.getText());
//		
//		Thread.sleep(300);
//		
//		alert.accept();
		
		//2.Cancel Alert
		
//		Alert alert=driver.switchTo().alert();
//		System.out.println(alert.getText());
//		Thread.sleep(3000);
//		alert.dismiss();
		
		
		//3.Prompt Alert
		
		driver.switchTo().alert().dismiss();
		
		
		
		
		
	}

}
