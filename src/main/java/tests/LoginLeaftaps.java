package tests;


import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import excel.LearnExcel;
import wrappers.SeMethods;

public class LoginLeaftaps extends SeMethods{
	
	public String excelFileName=null;
	
	@Parameters({"browser", "url", "uname", "pwd"})
	
	@BeforeMethod
	public void login(String brwse, String url, String username, String paswd) {
		
		//Open the browser
		invokeApp(brwse, url);
		
		//Find the username and enter the value
		enterById("username", username);

		//Find the password and enter the value
		enterById("password", paswd);

		//Click Login button
		clickByClassName("decorativeSubmit");

		//Click CRM/SFA
		clickByLink("CRM/SFA");
		
	}
	
	@AfterMethod
	public void closeApp() {
		closeAllBrowsers();
	}	
	@DataProvider(name="excelRead")
	public Object[][] fetchData() throws IOException {
		LearnExcel dataprovider = new LearnExcel();
		return dataprovider.readData(excelFileName);

}
}
