package programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHrm {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		Actions act =new Actions(driver);
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement element= driver.findElement(By.xpath("//input[@placeholder='Username']"));
		element.sendKeys("Admin");
		Thread.sleep(3000);
		WebElement element1= driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		element1.sendKeys("admin123");
		Thread.sleep(3000);
		element.submit();		
	}

}
