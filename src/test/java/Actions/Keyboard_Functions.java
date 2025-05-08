package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Functions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://www.google.com/");
		
		
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Testing the automations Tool");
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).click();
		
	    act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	    
	    act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
	    
	    
	    
	}

}
