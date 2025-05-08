package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Action {
	
	
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(400));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Thread.sleep(3000);
		
		WebElement rightclick=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		WebElement quit=driver.findElement(By.xpath("/html/body/ul/li[7]/span"));
		
		Actions act=new Actions(driver);
		act.contextClick(rightclick).build().perform();
		act.moveToElement(quit).click().build().perform();
		
		

	}

}
