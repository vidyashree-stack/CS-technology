package programs;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownSelect {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(""
				+ "");
		driver.findElement(By.xpath("//input[@placeholder='Username']"))
		.sendKeys("Admin",Keys.TAB, "admin123",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Leave']")).click();
		Thread.sleep(3000);
		List<WebElement> all = driver.findElements(By.xpath("//div[@class='oxd-select-option']"));
		Thread.sleep(3000);
	    Iterator<WebElement> itr = all.iterator();
	    Thread.sleep(3000);
	    while(itr.hasNext())
	    {
	    	String values = itr.next().getText();
	    	System.out.println(values);
	    }		
	}
}

