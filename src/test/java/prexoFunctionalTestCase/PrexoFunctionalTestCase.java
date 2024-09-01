package prexoFunctionalTestCase;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class PrexoFunctionalTestCase {
	
	public static void main(String[] args) throws Exception  {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.dealsdray.com/");
		Thread.sleep(3000);
		WebElement element= driver.findElement(By.xpath("//input[@name='username']"));
		element.sendKeys("prexo.mis@dealsdray.com");
		Thread.sleep(3000);
		WebElement element1= driver.findElement(By.xpath("//input[@name='password']"));
		element1.sendKeys("prexo.mis@dealsdray.com");
	    Thread.sleep(3000);
		element.submit();	
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Orders']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Add Bulk Orders']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='file']"))
		.sendKeys("C:\\Users\\91790\\Downloads\\demo-data.xlsx");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[text()='Import']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Validate Data']")).click();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		
		RobotClass rc = new RobotClass();
		rc.getZoomOut();
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\ScreenshotFolder1\\"+"ss1"+".png");
		Files.copy(src, dest);
		System.out.println("file uploaded Sucessfully ");
		
		
		driver.close();
	}
}
