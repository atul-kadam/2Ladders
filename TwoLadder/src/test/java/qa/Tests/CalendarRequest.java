package qa.Tests;

import java.awt.AWTException;
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
import pageEvents.CalendarAndRequestPageEvents;
import pageEvents.HomePageEvents;
import pageEvents.LandingPageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class CalendarRequest extends BaseTest {

	
	CalendarAndRequestPageEvents calendarevents = new CalendarAndRequestPageEvents();

	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;

	@BeforeMethod
	public void initialize() throws IOException {
		extent = ExtentReportManager.getReports();
		logger = extent.createTest("Calendar Test");
	}

	@Test(enabled = true)
	public void CreateRequest() throws AWTException, InterruptedException {
		logger.info("Click on dropdown");
		logger.info("Select value from dropdown");
		logger.info("Click on add request buttton");
		logger.info("Fill up field values");
		logger.info("Upload attachment");
		logger.info("Click on save button");   
		calendarevents.SelectValueFromDropdown();
		logger.log(Status.PASS, "Request form saved succesfully");
	}
	@AfterMethod
	public void finish() {
		extent.flush();
	}
}
