package pageObjects;

public interface LoginPageElements {
	String ContinueButton = "//button[@name='action']";
	String EmailAdress = "//input[@id='username']";
	String Password = "//input[@id='password']";
	String ActualErrorMessage = "//span[@id='error-element-password']";
	String ExpectedErrorMessage = "Wrong email or password";
}
