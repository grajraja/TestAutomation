package feb9;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// open a browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver browser = new ChromeDriver();

//		//open a firefox browser
//		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
//		FirefoxDriver browser = new FirefoxDriver();

		
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
		
		//click create lead /crmsfa/control/leadsMain
		browser.findElementByLinkText("Create Lead").click();
		
		//enter details 
		browser.findElementById("createLeadForm_companyName").sendKeys("company3");
		browser.findElementById("createLeadForm_firstName").sendKeys("ganesh");
		browser.findElementById("createLeadForm_lastName").sendKeys("raja");
		
		//Source
		WebElement src = browser.findElementById("createLeadForm_dataSourceId");
		Select source = new Select(src);
		//source.selectByIndex(5);		
		List<WebElement> opt = source.getOptions();
		int size = opt.size();
		source.selectByIndex(size-3);
		
		//Marketing Campaign
		WebElement mkt = browser.findElementById("createLeadForm_marketingCampaignId");
		Select market = new Select(mkt);
		market.selectByVisibleText("Demo Marketing Campaign");
		
		//Industry
		WebElement ind = browser.findElementById("createLeadForm_industryEnumId");
		Select industry = new Select(ind);
		industry.selectByValue("IND_INSURANCE");
		
		//Ownership
		WebElement own = browser.findElementById("createLeadForm_ownershipEnumId");
		Select owner = new Select(own);
		owner.selectByValue("OWN_PARTNERSHIP");
		
		//Country
		WebElement cty = browser.findElementById("createLeadForm_generalCountryGeoId");
		Select country = new Select(cty);
		country.selectByVisibleText("India");
		
		Thread.sleep(2000);
		
		//State
		WebElement sta = browser.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select state = new Select(sta);
		state.selectByVisibleText("TAMILNADU");
		
		
		//submit
	browser.findElementByName("submitButton").click();	
	

	}

}
