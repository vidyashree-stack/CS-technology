package prexoFunctionalTestCase;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrexUiTest2 {	
public static void main(String[] args) throws Exception  {
	    ScreenShot sc = new ScreenShot();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='https://www.getcalley.com/']")).click();
		Thread.sleep(3000);
		sc.capturedScreenshot(driver, "imageName1");
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='https://www.getcalley.com/calley-lifetime-offer/']")).click();
     	Thread.sleep(3000);
		sc.capturedScreenshot(driver, "imageName2");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='https://www.getcalley.com/see-a-demo/']")).click();
		Thread.sleep(3000);
		sc.capturedScreenshot(driver, "imageName3");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='https://www.getcalley.com/calley-teams-features/']")).click();
		Thread.sleep(3000);
		sc.capturedScreenshot(driver, "imageName4");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='https://www.getcalley.com/calley-pro-features/']")).click();
		Thread.sleep(3000);
		sc.capturedScreenshot(driver, "imageName5");
		driver.navigate().back();

		driver.close();
    }

 
}
