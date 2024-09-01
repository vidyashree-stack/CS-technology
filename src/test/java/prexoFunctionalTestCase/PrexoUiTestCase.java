package prexoFunctionalTestCase;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.Screenshotcapture;
import genericUtility.SeleniumUtility;
import objectrepository.HomePage;

public class PrexoUiTestCase extends BaseClass {

	@Test
	public void ass1() throws Exception {
		SeleniumUtility SUTIL = new SeleniumUtility();
		HomePage hp = new HomePage(driver);
		hp.getUrl1();
		Screenshotcapture.captureScreenshot(driver, "url1");
		SUTIL.navigateBack(driver);
		hp.getUrl2();
		Screenshotcapture.captureScreenshot(driver, "url2");
		SUTIL.navigateBack(driver);
		hp.getUrl3();
		Screenshotcapture.captureScreenshot(driver, "url3");
		SUTIL.navigateBack(driver);
		hp.getUrl4();
		Screenshotcapture.captureScreenshot(driver, "url4");
		SUTIL.navigateBack(driver);
		hp.getUrl5();
		Screenshotcapture.captureScreenshot(driver, "url5");
		SUTIL.navigateBack(driver);
	}
}