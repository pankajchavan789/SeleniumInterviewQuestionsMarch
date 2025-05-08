package Navigation_Method;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Specific_Tab {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.youtube.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://staging.infotex.in/login");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://uat.cooptex.gov.in/");
		
		Set<String> types=driver.getWindowHandles();
		
		for(String winid:types) {
			
			String title=driver.switchTo().window(winid).getTitle();
			System.out.println(title);
			
			if(title.equals("Co-Optex | Login")) {
				
				driver.close();
			}
		}
		
	

	}

}
