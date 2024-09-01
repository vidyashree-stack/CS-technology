package programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] args) throws InterruptedException {
		int count=0;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("i phone 14");
		element.submit();
		List<WebElement>pnames=driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		List<WebElement>pprices=driver.findElements(By.xpath("//div[@class='KzDlHZ']/../following-sibling::div/div[1]/div/div[1]"));
		for(int i=0;i<=pnames.size()-1;i++)
		{
			count++;
			System.out.println(pnames.get(i).getText()+"------->"+pprices.get(i).getText());
			
		}
		System.out.println("iphone 14 count is"+"   "+count);
		Thread.sleep(3000);
		driver.close();		
	}

}
