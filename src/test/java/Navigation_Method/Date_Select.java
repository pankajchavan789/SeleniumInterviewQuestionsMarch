package Navigation_Method;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Select {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
		String year="2026";
		String month="January";
		String date="24";
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		
		while(true) {
			
			String fmonth=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
			String fyear=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
			
			if(fmonth.equals(month)&&fyear.equals(year)) {
				break;
			}
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
		}
				
		List<WebElement> fdate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement bdate:fdate) {
			if(bdate.getText().equals(date)) {
				bdate.click();
				break;
			}
			
		}
		
		
	}
}
				
			
			
			
		
				

	