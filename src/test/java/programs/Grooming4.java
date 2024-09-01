package programs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Grooming4 {
	public static void main(String[] args) throws Exception  {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		WebElement  dropdownele= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Thread.sleep(3000);
		Select sel=new Select(dropdownele);
		Thread.sleep(3000);
		sel.selectByVisibleText("Books");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//input[@placeholder='Search Amazon']"));
		element.sendKeys("books");
		element.submit();
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Price: High to Low']")).click();
		Thread.sleep(3000);
		String element2= driver.findElement(By.xpath("//span[text()='Property Law: Cases, Problems, and Skills [Connected eBook with Study Center] (Aspen Casebook)")).getText();
		System.out.println("book name is" + element2);
		Thread.sleep(3000);
		String element3= driver.findElement(By.xpath("//span[@class='a-price-whole'][1]")).getText();
		System.out.println("book price is" +  element3);
		Thread.sleep(3000);
		
	}

}

