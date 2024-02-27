package qa.Tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import base.BaseTest;
import extentReportBase.ExtentReportManager;
import pageEvents.HomePageEvents;
import pageEvents.LandingPageEvents;
import pageEvents.LoginPageEvents;
import pageObjects.LandingPageElements;
import utils.ElementFetch;

public class MyAccountTest extends BaseTest {
	ElementFetch element = new ElementFetch();
	HomePageEvents homepageevents = new HomePageEvents();
	LoginPageEvents loginpageevents = new LoginPageEvents();
	LandingPageEvents landingpageevents = new LandingPageEvents();

	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;

	@BeforeMethod
	public void initialize() throws IOException {
		extent = ExtentReportManager.getReports();
		logger = extent.createTest("Calendar and Request Test");
	}

	@Test(priority = 3)
	public void MyAccount() {
		logger.info("Click on MY ACCOUNT");
		logger.info("Click on Sales");
		logger.info("Click on Calendar and Request");

		landingpageevents.MyAccount();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(element.getWebElement("XPATH", LandingPageElements.CalendarLogo).isDisplayed())
		{
			logger.log(Status.PASS, "Calendar and Requests page opened");
		}
		else{
			logger.log(Status.FAIL, "Page not loaded properly");
} 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@AfterMethod
	public void finish() {
		extent.flush();
	}

}
