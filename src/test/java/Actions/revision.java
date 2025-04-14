package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class revision {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"logo-icon\"]/span/div"));
		
    	Actions act=new Actions(driver);
		act.contextClick(rightclick).perform();
		Thread.sleep(2000);
		
		WebElement doubleclick=driver.findElement(By.xpath(""));
		Actions act1=new Actions(driver);
		act1.doubleClick(doubleclick).perform();
		Thread.sleep(2000);
		
		WebElement drag=driver.findElement(By.xpath(""));
		WebElement drop=driver.findElement(By.xpath(""));
		
		Actions act2=new Actions(driver);
		act2.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		

	}

}
