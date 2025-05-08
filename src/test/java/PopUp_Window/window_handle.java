package PopUp_Window;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_handle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in/home?ref=%2Fin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(300);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		
		alert.accept();
		
		

	}

}
