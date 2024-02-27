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
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class ValidLoginTest extends BaseTest {
	String ActualText;
	String ExpectedText = "MY ACCOUNT";
	
	ElementFetch element = new ElementFetch();
	HomePageEvents homepageevents = new HomePageEvents();
	LoginPageEvents loginpageevents = new LoginPageEvents();

	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;

	@BeforeMethod
	public void initialize() throws IOException {
		extent = ExtentReportManager.getReports();
		logger = extent.createTest("Valid Login Test");
	}

	@Test(priority = 2)
	public void ValidLogintest()
	{
		logger.info("Enter valid email adress");
		logger.info("Enter valid password and click on continue button");
		logger.info("Click on sign in button");
		loginpageevents.EnterCredentials();
		ActualText = element.getWebElement("XPATH", "//div[@class='real_header_menu']//a[normalize-space()='My Account']").getText();
		if(ActualText.equalsIgnoreCase(ExpectedText))
		{
		logger.log(Status.PASS, "Signed In Sucessfully");
		}
     try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@AfterMethod
	public void finish()
	{
		extent.flush();
	}

}
