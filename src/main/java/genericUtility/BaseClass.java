package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;


public class BaseClass {

	public static WebDriver driver = null;
	SeleniumUtility SUTIL = new SeleniumUtility();
	PropertiesUtility PUTIL = new PropertiesUtility();

	@BeforeSuite(alwaysRun = true)
	public void createConnection() {
		System.out.println("connection establish");
	}
    @Parameters("browsers")
	@BeforeClass(alwaysRun = true)
	public void launchBrowser(String browser) throws Exception {
		String URL = PUTIL.getDataFromProperties("url");
		SUTIL = new SeleniumUtility();

		if (browser.contains("chrome")) {
			driver = new ChromeDriver();
			System.out.println("Chrome launched");
		}
		if (browser.contains("firefox")) {
			driver = new FirefoxDriver();
			System.out.println("Firefox launched");
		}
		if (browser.contains("edge")) {
			driver = new EdgeDriver();
			System.out.println("Firefox launched");
		}

		SUTIL.implictWait(driver, 10);
		SUTIL.maximizeWindow(driver);
		driver.get(URL);
		System.out.println("Launching Successfully");
	}

}

