package genericUtility;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Screenshotcapture {
	
	public static void captureScreenshot(WebDriver driver, String imageName) throws Exception {
		
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY hh-mm-ss");
		String date = sdf.format(d);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\ScreenshotFolder1\\"+imageName+"_"+date+".png");
		Files.copy(src, dest);
		
	}

}

