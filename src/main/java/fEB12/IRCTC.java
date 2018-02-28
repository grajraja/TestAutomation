package fEB12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Open a browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver browser = new ChromeDriver();

		//Hit the URL
		//browser.get("https://irctc.co.in");

		//maximize
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//eticketing/userSignUp.jsf
		//browser.findElementByLinkText("/eticketing/userSignUp.jsf").click();

		browser.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");

		browser.findElementById("userRegistrationForm:userName").sendKeys("ganesh");
		browser.findElementById("userRegistrationForm:password").sendKeys("sample");
		browser.findElementById("userRegistrationForm:confpasword").sendKeys("sample");

		WebElement sec = browser.findElementById("userRegistrationForm:securityQ");
		Select secure = new Select(sec);
		secure.selectByVisibleText("What make was your first car or bike?");

		browser.findElementById("userRegistrationForm:securityAnswer").sendKeys("santro");

		WebElement lan = browser.findElementById("userRegistrationForm:prelan");
		Select language = new Select(lan);
		language.selectByVisibleText("English");

		browser.findElementById("userRegistrationForm:firstName").sendKeys("ganesh");

		browser.findElementById("userRegistrationForm:gender:0").click();

		browser.findElementById("userRegistrationForm:maritalStatus:0").click();

		WebElement d = browser.findElementById("userRegistrationForm:dobDay");
		Select day = new Select(d);
		day.selectByVisibleText("06");


		WebElement mon = browser.findElementById("userRegistrationForm:dobMonth");
		Select month = new Select(mon);
		month.selectByVisibleText("MAR");

		WebElement ye = browser.findElementById("userRegistrationForm:dateOfBirth");
		Select year = new Select(ye);
		year.selectByVisibleText("1995");

		WebElement oc = browser.findElementById("userRegistrationForm:occupation");
		Select Occupation = new Select(oc);
		Occupation.selectByVisibleText("Private");

		WebElement co = browser.findElementById("userRegistrationForm:countries");
		Select country = new Select(co);
		country.selectByVisibleText("India");

		browser.findElementById("userRegistrationForm:email").sendKeys("sample.src@gmail.com");

		//	browser.findElementById("userRegistrationForm:isdCode").sendKeys("91");

		WebElement abc= 	browser.findElementById("userRegistrationForm:isdCode");
		System.out.println(abc.isEnabled());
		System.out.println(abc.getText());
		System.out.println(abc.getAttribute("value"));

		browser.findElementById("userRegistrationForm:mobile").sendKeys("9978973984");

		WebElement na = browser.findElementById("userRegistrationForm:nationalityId");
		Select nationality = new Select(na);
		nationality.selectByVisibleText("India");		

	}

}
