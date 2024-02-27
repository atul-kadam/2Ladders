package pageEvents;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.gson.GsonExtentTypeAdapterBuilder.Builder;

import base.BaseTest;
import pageObjects.CalendarAndRequestPageElements;
import utils.Constants;
import utils.ElementFetch;

public class CalendarAndRequestPageEvents extends BaseTest {
	ElementFetch element = new ElementFetch();

	public void SelectValueFromDropdown() throws AWTException, InterruptedException {
		WebElement Dropdown = element.getWebElement("XPATH", CalendarAndRequestPageElements.FirstDropdown);
		Dropdown.click();
		Thread.sleep(3000);
		List<WebElement> Dropdownvalues = element.getWebElements("XPATH",
				"//*[@id=\"pr_id_6_list\"]/p-dropdownitem[*]/li");
		for (WebElement element : Dropdownvalues) {
			if (element.getText().equalsIgnoreCase("Strategy Representative"))
				element.click();
		}
		Thread.sleep(3000);
		element.getWebElement("XPATH", CalendarAndRequestPageElements.ClickRequest).click();
		Thread.sleep(3000);
		
		element.getWebElement("XPATH", CalendarAndRequestPageElements.SearchCompany).sendKeys("1171");
		Thread.sleep(3000);

		// Actions action = new Actions(driver);
		element.getWebElement("XPATH", CalendarAndRequestPageElements.SearchCompany).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);

		element.getWebElement("XPATH", CalendarAndRequestPageElements.SearchCompany).sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		element.getWebElement("XPATH", CalendarAndRequestPageElements.AssignTo).click();
		Thread.sleep(3000);

		element.getWebElement("XPATH", CalendarAndRequestPageElements.SearchAssignTo).sendKeys("wi");
		Thread.sleep(3000);

		element.getWebElement("XPATH", CalendarAndRequestPageElements.SearchAssignTo).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);

		element.getWebElement("XPATH", CalendarAndRequestPageElements.SearchAssignTo).sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		element.getWebElement("XPATH", CalendarAndRequestPageElements.Dates).click();
		String month = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/button[1]")).getText();
		String year = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/button[2]")).getText();
		while (!(month.equals("February") && year.equals("2024"))) {
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/button[2]/span")).click();
			month = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/button[1]")).getText();
			year = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/button[2]")).getText();
		}
		Thread.sleep(3000);
		element.getWebElement("XPATH", CalendarAndRequestPageElements.SelectDate).click();
		Thread.sleep(3000);
		
		element.getWebElement("XPATH", CalendarAndRequestPageElements.Description).sendKeys(Constants.DescriptionText);
		Thread.sleep(3000);

		element.getWebElement("XPATH", CalendarAndRequestPageElements.UploadFile).click();
		Thread.sleep(3000);

	    Robot robot = new Robot();
	    robot.delay(4000);
	   
	    StringSelection path = new StringSelection("D:\\TwoLadder\\TwoLadder\\Files\\dummy.pdf");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
	    
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_V);
	    
	    robot.keyPress(KeyEvent.VK_ENTER);
	    
	    robot.delay(4000);

	    element.getWebElement("XPATH", CalendarAndRequestPageElements.SaveButton).click();	    
	    
	    
	    
	    
	}
}
