package Navigation_Method;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDate_Dropdown {
	
	public static void ChoseYearMonth(WebDriver driver ,String selectYear,String selectMonth, String selectDate ) throws InterruptedException {
		
        driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		
		WebElement choseyear=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
		choseyear.click();
		Thread.sleep(4000);
		Select sc=new Select(choseyear);
		sc.selectByVisibleText(selectYear);
		
		
		WebElement choseMonth=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
		choseMonth.click();
		Thread.sleep(4000);
		Select sc1=new Select(choseMonth);
		sc1.selectByVisibleText(selectMonth);
		
		Thread.sleep(4000);
		
		List<WebElement> choseDate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement date:choseDate) {
			
			if(date.getText().equals(selectDate)) {
				date.click();
				break;
			}
		}
		
		
	}
	
	
	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		String selectYear="2027";
		String selectMonth="Jan";
		String selectDate="24";
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		ChoseYearMonth(driver, selectYear, selectMonth, selectDate);
		
	


	}





}
