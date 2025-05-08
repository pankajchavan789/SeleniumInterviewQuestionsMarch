package UploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class add_files {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/upload");
		driver.findElement(By.xpath("//*[@id=\"heroSection-container\"]/div[3]/div[2]")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@name='file']")).sendKeys("C:\\Users\\HP\\Desktop\\Introduction.txt");

	}

}
