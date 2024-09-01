package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("i phone 14");
		element.submit();
		driver.findElement(By.xpath("(//div[@class=\"A8uQAd\"])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class=\"A8uQAd\"])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class=\"A8uQAd\"])[24]")).click();;
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class=\"A8uQAd\"])[23]")).click();;
		Thread.sleep(3000);
		driver.close();		
	}

}
