package pageEvents;

import base.BaseTest;
import pageObjects.LandingPageElements;
import utils.ElementFetch;

public class LandingPageEvents extends BaseTest {
	ElementFetch element = new ElementFetch();

	public void MyAccount() {
		element.getWebElement("XPATH", LandingPageElements.MyAccount).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		element.getWebElement("XPATH", LandingPageElements.Sales).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		element.getWebElement("XPATH", LandingPageElements.CalenadarRequest).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
