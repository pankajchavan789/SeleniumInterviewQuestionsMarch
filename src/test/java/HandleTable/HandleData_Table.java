package HandleTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleData_Table {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		driver.get("https://blazedemo.com/");
		
		WebElement depart=driver.findElement(By.xpath("//select[@name='fromPort']"));
		depart.click();
		Select sc=new Select(depart);
		sc.selectByVisibleText("Portland");
		
		WebElement dest=driver.findElement(By.xpath("//select[@name='toPort']"));
		dest.click();
		Select sc2=new Select(dest);
		sc2.selectByVisibleText("Dublin");
		
		WebElement find=driver.findElement(By.xpath("//input[@type='submit']"));
		find.click();
		
//		String rows=driver.findElement(By.xpath("//table[@class='table']//th[6]")).getText();
//		System.out.println(rows);
//		
//		String col=driver.findElement(By.xpath("")).getText();
		
				WebElement flight=driver.findElement(By.xpath("//table[@class='table']//tr[3]//td[6]"));
				WebElement page=flight.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[1]/input"));
				page.click();
				System.out.println(page.getText());
		

	}

}
