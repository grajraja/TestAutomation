import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListLearn {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		//Open a browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver browser = new ChromeDriver();
		
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		browser.get("https://www.facebook.com");
		
		List<WebElement> lis = browser.findElementsByName("sex");
		List<WebElement> li = browser.findElementsByTagName("a");
		System.out.println(lis.size());
		System.out.println(li.size());
		lis.get(1).click();
		
		File src = browser.getScreenshotAs(OutputType.FILE);
		File des = new File("./snapshots/firstshot.png");
		FileUtils.copyFile(src, des);
			
		
		
		
		
	}

}
