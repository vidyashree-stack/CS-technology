package programs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {
	public static void main(String[] args) {
		String expectedData="flipkart";
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		String actualData=driver.getCurrentUrl();
		if(actualData.contains(expectedData)) 
		{
			System.out.println("accessed flipkart successfully");
		}
		else
		{
			System.out.println("not accessed");
		}
		
	}

}
