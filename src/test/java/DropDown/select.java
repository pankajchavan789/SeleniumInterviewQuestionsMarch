package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class select {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 300);
		WebElement dropdown=driver.findElement(By.id("country"));
		Select sc=new Select(dropdown);
		sc.selectByVisibleText("France");
		
		List<WebElement> name=sc.getOptions();
		System.out.println(name.size());
		
		for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i).getText());
		}
		

	}

}
