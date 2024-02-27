package pageEvents;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import base.BaseTest;
import pageObjects.LoginPageElements;
import utils.Constants;
import utils.ElementFetch;

public class LoginPageEvents extends BaseTest implements Constants {

	ElementFetch element = new ElementFetch();

	public void VerifySignInPageIsLoaded() {
		Assert.assertTrue(element.getWebElements("XPATH", LoginPageElements.ContinueButton).size() > 0,
				"Element Not Found");
	}

	public void EnterInValidCredentials() {
		element.getWebElement("XPATH", LoginPageElements.EmailAdress).sendKeys(Constants.InValidEmailId);
		element.getWebElement("XPATH", LoginPageElements.Password).sendKeys(Constants.InValidPassword);
		element.getWebElement("XPATH", LoginPageElements.ContinueButton).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Invalid credentials");
		
		Actions actions = new Actions (driver);
		actions.click(element.getWebElement("XPATH",LoginPageElements.EmailAdress))
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.sendKeys(Keys.BACK_SPACE)
		.build()
		.perform();

	}

	public void EnterCredentials() {
		element.getWebElement("XPATH", LoginPageElements.EmailAdress).sendKeys(Constants.ValidEmailId);
		element.getWebElement("XPATH", LoginPageElements.Password).sendKeys(Constants.ValidPassword);
		element.getWebElement("XPATH", LoginPageElements.ContinueButton).click();
		System.out.println("Logged in successfully");

	}

}
