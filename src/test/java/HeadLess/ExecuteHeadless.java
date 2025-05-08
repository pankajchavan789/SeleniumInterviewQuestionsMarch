package HeadLess;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExecuteHeadless {

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless=new");
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"header-inner\"]/div[1]/h1"));
		
		File sourcefile=logo.getScreenshotAs(OutputType.FILE);
		
		File targetfile=new File("C:\\Users\\HP\\eclipse-workspace\\InterviewQT\\Screenshots\\logoname.png");
		
		sourcefile.renameTo(targetfile);
		
		

	}

}
