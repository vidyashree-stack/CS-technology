package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroomingScenario1 {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='submitButton']")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Admin@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("Admin@1234");
		Thread.sleep(3000);
		driver.close();
	
	}

}
