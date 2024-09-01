package programs;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshotshandling {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.flipkart.com");
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\ScreenshotFolder\\"+"ss1"+".png");
		Files.copy(src, dest);
		driver.findElement(By.xpath("//input[@name='a']")).sendKeys("i phone 14");	
	}
}
