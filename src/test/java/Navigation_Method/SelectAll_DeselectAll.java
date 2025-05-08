package Navigation_Method;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAll_DeselectAll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		for(int i=0;i<checkbox.size();i++) {
			checkbox.get(i).click();
			System.out.println("Sucesfully Selected all Checkbox ");
		}
		
		Thread.sleep(300);
		
		for(int i=0;i<checkbox.size();i++) {
			if(checkbox.get(i).isSelected()) {
				checkbox.get(i).click();
				System.out.println("Deslect all Checkbox ");
			}
		}

	}

}
