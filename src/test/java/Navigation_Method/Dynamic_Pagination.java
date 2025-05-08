package Navigation_Method;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Pagination {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		driver.get("https://uat.cooptex.gov.in/admin");
		
		//Login the admin	
		WebElement uname=driver.findElement(By.id("input-username"));
		uname.clear();
		uname.sendKeys("admin");
		
		WebElement password=driver.findElement(By.id("input-password"));
		password.clear();
		password.sendKeys("welcome");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		//open the customer table
		driver.findElement(By.xpath("//*[@id=\"menu-customer\"]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"collapse9\"]/li[1]/a")).click();
		
		
		//check the total pages
		
		String page_name=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div/div[2]/div[2]/div[2]")).getText();
		int count=Integer.parseInt(page_name.substring(page_name.indexOf("(")+1,page_name.indexOf("Pages")-1));
		
		
		
		//Selecting pages
		for(int p=1;p<=2;p++) {
			
			if(p>1) {
				
				WebElement page_move=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/ul/li["+p+"]/a"));
				
				page_move.click();
			}
					
			
			//Reading the data from table
			
			int noOfRows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			System.out.println("Rows Size is--"+noOfRows);
			
			for(int r=1;r<=noOfRows;r++) {
				
				String cName=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
				String eMail=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
				
				System.out.println(cName+"--"+eMail);
			}
			
			
		
		
		
		}
	}

}
