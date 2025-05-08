package HandleTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableData {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// Find rows of table
		
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Total rows are "+rows);
		
		// find columns
		
		int coloumn=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Total column are "+coloumn);
		
		//Find data of Specific column and Rows
//		
//		String name=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[3]")).getText();
//		System.out.println(name);
		
		//Find all data from Table
		
//		for(int r=1;r<=rows;r++) {
//			
//			for(int c=0;c<=coloumn;c++)
//			{
//				String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
//				
//				System.out.print(data+"\t");
//			}
//			System.out.println();
//		}
		Thread.sleep(3000);
		
		
		int total=0;
		for(int r=2;r<=rows;r++) {
			
			String price=driver.findElement(By.xpath("//table[@name='Book Table']//tr["+r+"]//td[4]")).getText();
			
		      total=total+Integer.parseInt(price);
			
		}
		
		System.out.println("Total of Price is "+total);
		
		
		
		
		
		
	}

}
