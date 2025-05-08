package Navigation_Method;

import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination_Table {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		int page_count=driver.findElements(By.xpath("//ul[@class='pagination']//li")).size();
		
		
		 
		
		for(int c=1;c<=5;c++) {
			WebElement check=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+c+"]//td[4]/input"));
			
			check.click();
			Thread.sleep(3000);
		}
		
		for(int p=1;p<=page_count;p++) {
			WebElement count=driver.findElement(By.xpath("//ul[@class='pagination']//li["+p+"]"));
			
			count.click();
			Thread.sleep(3000);
			
		}
	}
}


