package pageEvents;

import pageObjects.HomePageElements;
import utils.ElementFetch;

public class HomePageEvents {
	ElementFetch element = new ElementFetch();

	public void signInButton() 
	{
     element.getWebElement("XPATH", HomePageElements.signinButtonText).click();
    
	}
}
