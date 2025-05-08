package Navigation_Method;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement drop=driver.findElement(By.id("country"));
		
		Select sc=new Select(drop);
		sc.selectByVisibleText("Germany");
		
		List<WebElement> names=sc.getOptions();
		
		for(int i=0;i<names.size();i++) {
			
			System.out.println(names.get(i).getText());
		}
		
		
		
		
		}
		
}