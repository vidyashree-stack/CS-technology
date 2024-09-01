package programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		Actions act =new Actions(driver);
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//span[text()='Login']"));
		act.contextClick(element).perform();
		Thread.sleep(3000);
		WebElement element2= driver.findElement(By.xpath("//input[@name='q']"));
		element2.sendKeys("i phone 14");
		element2.submit();
		Thread.sleep(3000);
		WebElement element3= driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[24]"));
		act.scrollToElement(element3).perform();
		Thread.sleep(3000);
		driver.close();
         
		
	}

}
