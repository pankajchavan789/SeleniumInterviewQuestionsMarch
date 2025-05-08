package Actions;

import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Rightclick_newTab {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		WebElement rightclick=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).click(rightclick).keyUp(Keys.CONTROL).perform();
		
		
		List<String> id=new ArrayList(driver.getWindowHandles());
		
		System.out.println("Return id are--"+id);
		
		driver.switchTo().window(id.get(1));
		
		
		
		

	}

}
