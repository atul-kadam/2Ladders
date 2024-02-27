package extentReportBase;

import java.io.File;
import java.io.IOException;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
	public static ExtentSparkReporter sparkReporter;
	public static ExtentReports extent;
	public static ExtentTest logger;

	public static ExtentReports getReports() throws IOException {
		// logger = extent.createTest(testMethod.getName());

		if (extent == null) {
			extent = new ExtentReports();
			sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + File.separator + "reports"
					+ File.separator + "SDETADDaExtentReport.html");
			extent.attachReporter(sparkReporter);
			//sparkReporter.config().setTheme(com.aventstack.extentreports.reporter.configuration.Theme.STANDARD);
			extent.setSystemInfo("Hostname", "RHEL8");
			extent.setSystemInfo("Username", "root");
			sparkReporter.loadXMLConfig(System.getProperty("user.dir")+ "/extentconfig.xml");
			//sparkReporter.config().setDocumentTitle("Automation Test Report");
			//sparkReporter.config().setReportName("TwoLadder Extent Report");
		}
			return extent;
		}
	}
