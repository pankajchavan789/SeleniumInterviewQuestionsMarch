package Screenshots;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificContet_Screenshot {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement statictable=driver.findElement(By.xpath("//div[@id='HTML12']"));
		
		File sourcefile=statictable.getScreenshotAs(OutputType.FILE);
		
		File targetfile=new File("C:\\Users\\HP\\eclipse-workspace\\InterviewQT\\Screenshots\\dynamic.png");
		
		sourcefile.renameTo(targetfile);
		
		
		
		
		

	}

}
