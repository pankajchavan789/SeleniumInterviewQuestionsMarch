package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightDoubleDrag {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://staging.infotex.in/login");
		
		//Right Click Operation
		
		WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"fm1\"]/div[3]/div/div[4]/a"));
		
		Actions act=new Actions(driver);
		act.contextClick(rightclick).perform();
		
		//DoubleClick Operation
		
		WebElement dclick=driver.findElement(By.xpath("//*[@id=\"fm1\"]/div[3]/div/div[1]/div/div/input"));
		
		Actions act1=new Actions(driver);
		act1.doubleClick(dclick).perform();
		
		// Drag&Drop Operation
		
		WebElement drag=driver.findElement(By.xpath(""));
		
		Actions act2=new Actions(driver);
		act2.dragAndDrop(dclick, drag).perform();

	}

}
