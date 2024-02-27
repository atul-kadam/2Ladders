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
import pageEvents.EditEvents;

public class EditTest extends BaseTest {

	EditEvents editevents = new EditEvents();

	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;

	@BeforeMethod
	public void initialize() throws IOException {
		extent = ExtentReportManager.getReports();
		logger = extent.createTest("Edit Test");
	}

	@Test
	public void EditRequest() throws InterruptedException {
		logger.info("Scroll down page");
		logger.info("Select event to edit");
		logger.info("Click on Edit button");
		logger.info("Edit field values");
		logger.info("Click on Save button");
		editevents.EditRequestEvents();
		logger.log(Status.PASS, "Request Edited form saved succesfully");

	}

	@AfterMethod
	public void finish() {
		extent.flush();
	}
}
