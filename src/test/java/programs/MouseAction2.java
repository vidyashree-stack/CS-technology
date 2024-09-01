package programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction2 {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		Actions act =new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
		Thread.sleep(3000);
		WebElement mobilesrc= driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement mobiledst=driver.findElement(By.xpath("//a[text()='Drag Position']"));
	    
	    Thread.sleep(3000);
	    
	}

}
