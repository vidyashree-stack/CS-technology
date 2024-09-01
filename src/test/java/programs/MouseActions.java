package programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
		public static void main(String[] args) throws Exception {
			WebDriver driver=new ChromeDriver();
			Actions act =new Actions(driver);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize(); 
			driver.get("https://www.flipkart.com/");
			Thread.sleep(3000);
			WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
			search.sendKeys("iphone 14");
			search.submit();
			Thread.sleep(3000);
			WebElement leftpointer= driver.findElement(By.xpath("//div[@class='PYKUdo'][1]"));
			act.dragAndDropBy(leftpointer,30,0).perform();
			Thread.sleep(3000);
			WebElement rightpointer= driver.findElement(By.xpath("//div[@class='PYKUdo'][2]"));
			act.dragAndDropBy(rightpointer,-30,0).perform();			
		}
}

