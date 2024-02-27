package pageEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import base.BaseTest;
import pageObjects.CalendarAndRequestPageElements;
import pageObjects.EditRequestElements;
import utils.Constants;
import utils.ElementFetch;

public class EditEvents extends BaseTest {
	ElementFetch element = new ElementFetch();

	public void EditRequestEvents() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,700)");

		Thread.sleep(3000);

		element.getWebElement("XPATH", EditRequestElements.Eventclick).click();
		Thread.sleep(2000);

		element.getWebElement("XPATH", EditRequestElements.EditEvent).click();
		Thread.sleep(2000);

		element.getWebElement("XPATH", CalendarAndRequestPageElements.AssignTo).click();
		Thread.sleep(3000);

		element.getWebElement("XPATH", CalendarAndRequestPageElements.SearchAssignTo).sendKeys("jac");
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

		element.getWebElement("XPATH", EditRequestElements.EditDate).click();
		Thread.sleep(3000);
		
		element.getWebElement("XPATH", EditRequestElements.Description).sendKeys(Constants.EditDescription);
		Thread.sleep(3000);

		element.getWebElement("XPATH", CalendarAndRequestPageElements.SaveButton).click();

	}

}
