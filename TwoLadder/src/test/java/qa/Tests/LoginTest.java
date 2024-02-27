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

public class LoginTest extends BaseTest {
	String actualerrormessage;
	String Expectederrormessage = "Wrong email or password";
	ElementFetch element = new ElementFetch();
	HomePageEvents homepageevents = new HomePageEvents();
	LoginPageEvents loginpageevents = new LoginPageEvents();

	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;

	@BeforeMethod
	public void initialize() throws IOException {
		extent = ExtentReportManager.getReports();
		logger = extent.createTest("Invalid Login Test");
	}

	@Test(priority = 1)
	public void InvalidLogintest() {

		logger.info("SignIn to login page");
		homepageevents.signInButton();
		logger.info("Verify page is loaded");
		loginpageevents.VerifySignInPageIsLoaded();
		logger.info("Entering Invalid email adress,Invalid password and click on continue button");
		loginpageevents.EnterInValidCredentials();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actualerrormessage = element.getWebElement("XPATH", "//span[@id='error-element-password']").getText();
		if (actualerrormessage.equalsIgnoreCase(Expectederrormessage)) {
			logger.log(Status.FAIL, "Invalid Credentials entered");
		}
	}

	@AfterMethod
	public void finish() {
		extent.flush();
	}

}
