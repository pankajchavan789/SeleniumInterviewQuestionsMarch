package Navigation_Method;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics_Command {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//To Method
		URL myurl=new URL("https://www.facebook.com/");
		driver.navigate().to(myurl);
		
		// Forward Method
		driver.navigate().forward();
		
		//Back Method
		driver.navigate().back();
		
		//Refresh Method
		driver.navigate().refresh();
		
		//getWindowHandle
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getWindowHandle());
		
		// open newTAB/Window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/");
		
		//getWindowHandles
		System.out.println(driver.getWindowHandles());

	}

}
