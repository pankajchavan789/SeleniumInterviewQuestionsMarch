package Navigation_Method;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Select_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 300);
		
		Thread.sleep(4000);
		WebElement dropC=driver.findElement(By.id("country"));
		
		Select Sc=new Select(dropC);
		Sc.selectByVisibleText("France");
		
		List<WebElement> count=Sc.getOptions();
		
		System.out.println(count.size());
		
		for(int i=0;i<count.size();i++) {
			System.out.println(count.get(i).getText());
		}
		
		

	}

}
