package Incognito_Mode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Private_window {

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito");
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

	}

}
