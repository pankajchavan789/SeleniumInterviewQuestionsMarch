package Screenshots;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullPage_Screnshot {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://uat.cooptex.gov.in/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File("");
		sourcefile.renameTo(targetfile);
		
		
	
				
		

	}

}

