package Pages;

import wrappers.SeMethods;

public class LoginPage extends SeMethods{
	
	public LoginPage enterUserName(String username) {
		
		enterById("username", username);
		return this;
	}
	
	public LoginPage enterPassword(String paswd) {
		
		enterById("password", paswd);
		return this;
	}
	
	public Home clickSubmit() {
		
		clickByClassName("decorativeSubmit");
		return new Home();
	}
	
	public LoginPage clickLoginFailure() {
		clickByClassName("decorativeSubmit");
		return this;
	}
}
