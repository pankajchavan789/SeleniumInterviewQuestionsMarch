package Navigation_Method;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
		driver.get("https://testautomationpractice.blogspot.com/");
				
		String year="2025";
		String month="January";
		String day="26";
		
		driver.findElement(By.id("datepicker")).click();
		
		while(true) {
			
		 String previous_month=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
		 String current_year=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
		
		if(previous_month.equals(month)&&current_year.equals(year)) {
			break;
		}
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
		}
		    
		 List<WebElement> datepicker=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		 
		 for(WebElement date:datepicker) {
			 
			 if(date.getText().equals(day)) {
				 date.click();
				 break;
			 }
		 }
		
		
		
		

	}

}
