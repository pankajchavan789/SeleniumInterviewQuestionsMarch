package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		WebElement test=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[1]/div/div/span"));
		
		Actions act=new Actions(driver);
		act.moveToElement(test).build().perform();
		
		Thread.sleep(300);
		
		WebElement test1=driver.findElement(By.xpath("/html/body/div[4]/div[1]/object/a[4]"));
		Actions act1=new Actions(driver);
		act1.moveToElement(test1).build().perform();
		
		Thread.sleep(300);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/object/a[8]")).click();
		
		System.out.println(driver.getTitle());
		
		

	}

}
