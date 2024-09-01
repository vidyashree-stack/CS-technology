package programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	public static void main(String[] args) throws InterruptedException {
		int count=0;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|B|Brand|Brand-BrandExact_DT|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|RSA|&s_kwcid=AL!1631!3!!e!!o!!makemytrip.com%7C&ef_id=:G:s");
		WebElement element = driver.findElement(By.xpath("//input[@id='departure']"));
		element.submit();
		String day =driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--selected']"))
		.getText();
		Thread.sleep(3000);
		String Price = driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--selected']//div//p[@class=' todayPrice']")).getText();
		Thread.sleep(3000);	
	}

}

