package feb9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// open a browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver browser = new ChromeDriver();

//				//open a firefox browser
//				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
//				FirefoxDriver browser = new FirefoxDriver();

				
				//hit URL
				browser.get("http://leaftaps.com/opentaps");
				
				//maximize
				browser.manage().window().maximize();
				browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//enter username
				browser.findElementById("username").sendKeys("DemoSalesManager");
				
				//enter password
				browser.findElementById("password").sendKeys("crmsfa");
				
				//click login
				browser.findElementByClassName("decorativeSubmit").click();
				
				//click SFA
				browser.findElementByLinkText("CRM/SFA").click();
				
				//Click lead 
				browser.findElementByLinkText("Leads").click();
				
				//crmsfa/control/findLeads
				browser.findElementByLinkText("Find Leads").click();
				
				browser.findElementById("ext-gen248").sendKeys("ganesh");
				
				browser.findElementById("ext-gen334").click();
				
				browser.findElementByLinkText("ganesh").click();
				
				browser.findElementByLinkText("Duplicate Lead").click();
				
				//enter details 
				browser.findElementById("createLeadForm_companyName").sendKeys("1");
				browser.findElementById("createLeadForm_firstName").sendKeys("1");
				browser.findElementById("createLeadForm_lastName").sendKeys("1");
				
				browser.findElementByXPath("//input[@value='Create Lead']").click();
						
				
		
	}

}
