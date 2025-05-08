package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_Filter {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		
		driver.get("https://www.flipkart.com/clothing-and-accessories/topwear/tshirt/men-tshirt/pr?sid=clo,ash,ank,edy&otracker=categorytree&otracker=nmenu_sub_Men_0_T-Shirts");
		
//		driver.findElement(By.xpath("//*[@id=\"widget-navbar-219682\"]/ul/li[2]/a/div/span")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"mz-filter-1\"]/div[1]")).click();
		
		WebElement min_slider=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/div/section[2]/div[3]/div[1]/div[1]/div"));
		
		System.out.println("Max slider location is"+min_slider.getLocation());
		
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.dragAndDropBy(min_slider, 117, 612).perform();
		
		System.out.println("Max slider location after moving"+min_slider.getLocation());
		
		
//		WebElement max_slider=driver.findElement(By.xpath("//*[@id=\"mz-filter-panel-1-0\"]/div/div[1]/span[2]"));
//		
//		System.out.println("Default Min Slider"+max_slider.getLocation());
//		
//		Actions act2=new Actions(driver);
//		act2.dragAndDropBy(max_slider, 178, 303).perform();
//		System.out.println("Min slider after remove"+max_slider);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
