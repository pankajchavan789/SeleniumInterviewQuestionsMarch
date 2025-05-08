package JavaScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Page {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement name=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/h2"));
		
		//Scroll page to down
		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,2100)", "");
//		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		// Scroll page upto view content
		
		
		
		js.executeScript("arguments[0].scrollIntoView();", name);
				

	}

}
